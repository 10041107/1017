package main.java.com.ohgiraffers.section02;

public abstract class Product {

    public Product(){
    }

    public void nonStaticMethod(){
        System.out.println("Product 클래스의 NonStaticMethod를 호출함");
    }
    public static void staticMethod(){
        System.out.println("Product 클래스의 Static Method");
    }

    public abstract void abstractMethod();
}
