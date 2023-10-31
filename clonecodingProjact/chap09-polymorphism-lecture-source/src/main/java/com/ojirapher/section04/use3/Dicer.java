package main.java.com.ojirapher.section04.use3;

public class Dicer {

    private int curruntPosition;

    public void throwDice(Dice dice){
        int diceNumber = dice.getNumber();
        move(diceNumber);
        System.out.println(curruntPosition + " 만큼 이동하셨습니다.");
    }

    private void move(int diceNumber){
        this.curruntPosition += diceNumber;
    }



}
