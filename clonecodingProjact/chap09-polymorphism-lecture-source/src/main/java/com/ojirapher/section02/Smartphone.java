package main.java.com.ojirapher.section02;

public class Smartphone extends Product{


    public Smartphone(){}

    @Override
    public void abStaticMethod() {
        System.out.println("product클래스의 추상 메서드를 호출함");
    }

    public void printSmartPhone(){
        System.out.println("Smart폰의 클래스의 print메서드를 호출함");
    }
}
