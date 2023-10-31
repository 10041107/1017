package main.java.com.ojirapher.section01.polymophism;

public class Tiger extends Animal{


    @Override
    public void eat() {
        super.eat();
        System.out.println("호랑이가 고기를 먹습니다");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("호랑이가 사냥하러 달립니다");
    }

    @Override
    public void cry() {
        super.cry();
        System.out.println("호랑이가 울부짖습니다");
    }

    public void bite(){
        System.out.println("호랑이가 물어 뜯습니다");
    }





}
