package main.java.com.ojiraphers.section03.abstraction;

import java.awt.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*
        객체 지향 프로그래밍이란
        현실셰계의 모든 사건(event)는 객체의 상호작용에 의해 일어난다는 세계관을
        프로그램을 만들때 이용하여 새로운 세계를 창조해내는 방법론이다.
        현실 세계와 닿아있지만 현실 세계와 다른 점은,
        객체간의 상호 작용을 한다는 사실은 현실 세계와 동일하지만 의인화 기법이 적용되어
        현실 세계에서 불가능한 무생물이나 개념 같은 존재들도 하나의 주제로 본인의 상태를 스스로 제어하고
        행동 하도록 한다는 것이 현실 세계와 다른 점이다. (캡슐화)
        모든 객체는 책임을 가지고 자신의 역할을 수행해야 한다.
        또한 하나의 객체는 너무 많은 일을 수행하는 것이 아닌 적절한 채임을 가지고 있어야 한다.(단일 책임의 원칙)

        객체와 객체의 상호작용이란?
        객체와 객체는 메세지를 통해 서로 상호작용을 한다. 메세지(메소드 호출)을 보내는 쪽을 송신자라고 하고,
        메세지를 수신하는 쪽을 수신자라고 한다. 수신자는 메세지를 전달받아 그 메세지에 해당하는 내용을 처리하는 방법을
        스스로 결정하고, 그 결정한 방법대로 처리할 명령어 들을 순차적으로 기술한 것을 메소드라고 한다.
        상호작용에 중요한 것은 메세지를 송수신하고 그 방법을기술하며 객체들간의 주고 받는 메세지를 이용해 상호작용하는 것을
        설계하는 것을 의미한다.
        즉, 필드보다는 메소드를 중점적으로 추상화 기법을 적용하여 객체를 설계하고, 그 객체를 구현하는 방법으로 설계한 대로
        클래스를 작성하는 것이다. 이것을 추상화라고 부른다.
         */

        /*
        프로그램 설계하기
        -자동차 운전 게임에서 카레이서가 자동차를 운전한다.
        필요한 객체를 도출한다.
        -필요한 객체; 플레이어(사용자), 카레이서, 자동차

        객체간의 상호작용
        -카레이서가 수신할 수 있는 메세지
        1. 시동을 걸어라
        2. 엑셀을 밟아라
        3. 브레이크를 밟아라
        4. 시동을 꺼라
        - 자동차가 수신할 수 있는 메세지
        1. 시동을 걸어라
        2. 앞으로 가라
        3. 멈춰라
        4. 시동을 꺼라
        커뮤니케이션 다이어그램
        1. 시동 걸기
        사용자 ---> 시동을 걸어라 ---> |카레이서| ---> 시동을 걸어라 ---> |자동차|

        2. 가속
        사용자 ---> 엑셀을 밟아라 ---> |카레이서| ---> 앞으로 가라 ---> |자동차|

        3. 멈추기

        4. 시동끄기

        클래스 설계하기
        카레이서 클래스
        1. 속성(=필드): 자동차
           행위(=메서드): 시동걸기, 엑셀밟기, 브레이크, 시동끄기
        자동차 클래스
           속성 : 시동의 상태, 속도,
           메소드(=행위 =액션) : 시동걸기, 앞으로가기, 멈추기, 시동끄기

         */

        carRacer carRacer = new carRacer();
        carRacer.startUp();
        Scanner sc = new Scanner(System.in);
        loop: while (true){
            System.out.println("====카레이싱 프로그램====");
            System.out.println("1. 시동 걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동 끄기");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : carRacer.startUp(); break;
                case 2 : carRacer.stepAcccelator(); break;
                case 3 : carRacer.setUpBreak(); break;
                case 4 : carRacer.turnOff(); break;
                case 9 : System.out.println("프로그램을 종료합니다."); break loop;
                default:
                    System.out.println("잘못된 번호입니다. 다시 선택해주세요."); break;
            }
            if(no == 9){
                break;
            }


        }




        /*
        추상화란, 객체지향 프로그래밍(oop)의 소프트웨어 공학에서 중요한 개념 중 하나이며
        추상화는 복잡한 현실 세계의 개념, 데이터, 시스템 또는 프로세스를 단순화하거나 요약하여 핵심적인 특징을 강조하고
        불필요한 세부 사항을 숨기는 과정이다.

        단순화: 복잡한 것을 더 단순하게 만든다. 추상화는 중요한 부분만 남기고 세부적인 부분을 무시한다.
        일반화: 여러 객체나 개념에서 공통된 특성을 찾아내어 일반적인 개념으로 표현한다.
        ex) 동물은 추상적인 개념이며 개, 고양이, 코끼리 등은 이 개념의 구채적인 인스턴스이다.

        은닉화: 불필요한 세부 사항을 숨기고 필요한 정보만을 노출한다. 이것은 정보 은닉과 관련이 있으며 객체의 내부 구형을
        외부로부터 숨겨 보호하고 필요한 인터페이스(메소드)만 노출하는 것을 의미한다.

        모델링: 추상화는 현실 세계의 개념을 소프트웨어 모델로 변환하며, 이 모델은 소프트웨어 개발에서 사용된다.
        복잡하나 현실 세계를 이해하고 해결책을 제공하는 도구로 사용된다.

        객체지향 프로그래밍: 추상화는 객체지향 프로그래밍의 핵심 개념 중 하나로 클래스와 객체를 사용하여
        추상화를 통해 현실 세계의 개념을 모델링하고 이를 소프트웨어로 구현한다.
        클래스는 추상 데이터 타입을 정의하고, 객체는 클래스의 인스턴스로 실제 데이터와 메서드를 갖는다.

        인터페이스: 추상화의 한 형태로 객체가 특정 동작을 수행하는 방법을 정의하는 역할을 하며
        추상 메서드를 포함하여 클래스에서 이를 구현함으로써 필요한 동작을 정의할 수 있다.

        =추상화
        세부적인 속성을 제거함.
        클래스 안에서 공통적인 특성만 정의해놓고
        개별적인 특성을 제거함


         */




    }



}