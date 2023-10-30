package main.jaa.com.ojirapher.section01.extened.understand;

import main.jaa.com.ojirapher.section01.extened.understand.car.ElectricCar;
import main.jaa.com.ojirapher.section01.extened.understand.car.OldCar;
import main.jaa.com.ojirapher.section01.extened.understand.employee.Seller;

public class Application {
    public static void main(String[] args) {
        System.out.println("자동차 판매 프로그램");
        System.out.println("전기차");

        ElectricCar ionic = new ElectricCar("H", 1000, "ionic1", "1000km");
        ElectricCar ionic2 = new ElectricCar("H", 1500, "ionic2", "1500km");
        ElectricCar ionic3 = new ElectricCar("H", 2000, "ionic3", "200km");
        ElectricCar kona = new ElectricCar("H", 2100, "kona", "2100km");

        System.out.println("내연기관 자동차");
        OldCar porter = new OldCar("H", 1500, "poter", "diesel");
        OldCar avante = new OldCar("H", 1500, "avante", "Gasoline");
        OldCar sonata = new OldCar("H", 2000, "sonata", "dGasoline");

        System.out.println("영업 사원 입사");

        Seller seller = new Seller("노홍철");
        OldCar[] sellars = {porter,avante,sonata,porter};
        seller.oldCarSale(sellars);
        ElectricCar[] electricsellars = {ionic2, ionic2};
        seller.electricCarSale(electricsellars);
        System.out.println(seller);


    }




}
