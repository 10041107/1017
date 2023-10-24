package main.java.com.ojiraphers.section03.abstraction;

/**
 *
 */
public class carRacer {
//    카레이서 클래스
//        1. 속성(=필드): 자동차
//    행위(=메서드): 시동걸기, 엑셀밟기, 브레이크, 시동끄기

    private static car car = new car();
    /**
    this.car의시동을 거는 메서드
     @return void;
     */
    public static void startUp(){
        car.startUp();
    }

    /**
     * this.car go 메서드를 호출하여 앞으로 가는 기능
     * @return void;
     */
    public static void stepAcccelator(){
        car.go();
    }

    /**
     * this.car.stop() 메서드를 호출하여 자동차를 멈춘다.
     */
    public static void setUpBreak(){
        car.stop();
    }

    /**
     * this.car.turnOff메서드를 호출하여 시동을 끈다.
     */
    public static void turnOff(){
        car.turnOff();
    }




}
