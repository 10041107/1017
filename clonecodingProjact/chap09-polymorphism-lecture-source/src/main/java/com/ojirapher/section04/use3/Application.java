package main.java.com.ojirapher.section04.use3;

public class Application {
    public static void main(String[] args) {
        Dicer dicer = new Dicer();
        dicer.throwDice(new HellDice());
        dicer.throwDice(new SuperDice());
    }




}
