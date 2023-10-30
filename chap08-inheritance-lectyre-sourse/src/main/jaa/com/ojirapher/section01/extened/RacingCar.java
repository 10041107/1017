package main.jaa.com.ojirapher.section01.extened;

import javax.crypto.spec.PSource;

public class RacingCar extends Car {

    public RacingCar(){
        System.out.println("RacingCar클래스의 기본 생성자를 호출");
    }

    @Override
    public void run(){
        System.out.println("레이싱카가 전속력으로 질주합니다.");
    }

    @Override
    public void soundHorn(){
        System.out.println("레이싱카는 경적을 울릴 수 없습니다.");
    }

    @Override
    public void stop() {
//        super.stop(); // 부모가 가지고 있는 기능을 그대로 호출함
        System.out.println("레이싱을 멈춥니다");

    }
}
