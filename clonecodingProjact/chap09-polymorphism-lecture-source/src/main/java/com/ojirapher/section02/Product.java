package main.java.com.ojirapher.section02;

public abstract class Product {

    public Product() {

    }

    public void nonStaticMethod() {
        System.out.println("product클래스의 nonStaticMethod를 호출함");
    }

        public void StaticMethod() {
            System.out.println("product클래스의 StaticMethod");
    }

    public abstract void abStaticMethod();


    }