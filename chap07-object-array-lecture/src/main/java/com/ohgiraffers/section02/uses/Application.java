package main.java.com.ohgiraffers.section02.uses;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Application {

    public static void main(String[] args){
        /*
        * 시스템의 요구사항
        * 1. 여려 명의 회원 정보를 받아 한 번에 여러 회원 정보를 등록
        * 2. 전체 회원 조회 시 여러 명의 회원 정보를 반환
        *
        * 1. MemberRepository에 static 필드로 회원 정보들을 관리
        * 2. 회원 정보는 최대 10명까지 저장할 수 있다..
        * */

        //사용자의 입력을 받을 수 있도록 scanner객체를 생성함
        //반복문 내부에서 생성시 반복문 실행마다 새로운 인스턴스를 생성해야 하기 때문에
        //메모리 낭비가 발생될 수 있으며 컴퓨터 리소스가 낭비됨
        Scanner scanner = new Scanner(System.in);
        //memberservice 객체를 heap에 생성하여 메서드를 실행시킬 수 있도록 함

        MemberService memberManger = new MemberService();

        while (true){
            System.out.println("===회원 관리 프로그램====");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택");
            //사용자에게 이용하고자 하는 서비스의 번호를 입력받음(입력 값은 정수형)
            int no = scanner.nextInt();

            switch (no){ // 입력값이 아래와 같을 경우 해당 되는 서비스를 실행해줌
                // 사용자 입력값이 ==1이면 memberService클래스에 있는 signUpMembers()메서드를 호출함
                //호출시 stack 영역에서 동작이 된다. 참고 ((no == 1)일시 1번쨰로 실행되는 부분)
                case 1 : memberManger.singUpMembers(); break;
                case 2 : memberManger.showAllmembers(); break; //((no == 2): 1번째로 실행 - showAllmembers 실행
                case 9 :
                    System.out.println("프로그램을 종료합니다"); return;
                default:
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요."); return;
            }
        }


    }
}


//레퍼지토리: 메인 클래스, 메소드와 연결해주는 역할 << private로 사용되는 등 클래스 외부에서 접근할 수 없을때 사용하는 등 연결 매개체로 쓰임
// 접근이 용이해짐. 협업 기반의 경우 코드를 찾기가 쉬워짐. <구조를 잡고 디자인 패턴을 구현하는 이유

//디자인패턴: 자바 코드 패턴. =프로젝트의 구조를 잡다, 각각의 계층을 나눈다
// 일정한 프로세스 를 가진 요구사항을 템플릿 메소드 패턴을 이용하여 구현할 수 있습니다.
//ex: Spring Security의 인증및 인가과정,  애노테이션 프로세서의 라운드구조, 로직의 완성까지의 로직이 순차적인 일정한 단계가 있는 경우 등
//https://catsbi.oopy.io/344dbe7b-9774-48fc-9c95-b554e9c1c4bc
