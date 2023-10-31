package main.java.com.ojirapher.section01.polymophism;

public class Rabbit extends Animal {

    @Override
    public void eat() {
        super.eat(); //super : 부모, this : 자신
        System.out.println("토끼가 풀을 뜯어 먹고 있습니다.");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("토끼가 달려갑니다. 깡총깡총");
    }

    @Override
    public void cry() {
        super.cry();
        System.out.println("토끼가 웁니다....");
    }

    public void jump(){
        System.out.println("토끼가 점프를 합니다");
    }




}
