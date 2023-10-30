package main.jaa.com.ojirapher.section01.extened.understand.car;

import java.time.chrono.MinguoDate;
//자동차가 공통적으로 가지고 있는 속성을 만들어 준다.
/*
자동차는 공통적으로 brand명과 price를 갖는다.
 */
public class Car {
    //현대차
    private final String brand;

    private int price;

    Car(String brand, int price){
        this.brand = brand;
        this.price = price;

    }

    public static int getPrice(){
        return this.price;
    }

    public String getBrand(){
        return this.brand;
    }


}
