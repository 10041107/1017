package main.jaa.com.ojirapher.section01.extened;

public class FireCar extends /*상속하다, 연장하다*/ Car/*Car(부모)를 상속받음*/ {

    public FireCar(){
        /* 모든 생성자에는 맨 첫 줄에 super()를 컴파일러가 자동 추가한다.
        부모의 기본 생성자를 호출하는 구문이다.
        해당 생성자가 호출될 시 가장 먼저 Car()클래스 호출 내용이 출력될 것이다.
        명시적, 묵시적 전부 사용가능.

        자바: 다중상속을 지원하지 않음.(C++은가능)
         */
        super();
    }

    @Override
    public void soundHorn/*부모가 갖고 있는 soundHorn을 호출*/(){
        if(isRunning()){
            System.out.println("빠아아아ㅏ아아아아아아앙");

        }else {
            System.out.println("소방차가 앞으로 갈 수 없습니다.");
        }
    }

    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다 ||~~~~~~");
    }





}
