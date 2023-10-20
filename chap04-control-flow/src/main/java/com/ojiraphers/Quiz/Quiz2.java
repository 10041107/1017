package main.java.com.ojiraphers.Quiz;

import java.util.Scanner;

public class Quiz2 {
    private int result1;
    private int total;

    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===주사위 게임을 시작합니다.===");
        System.out.println("첫 번째 주사위를 굴립니다 '굴리기'를 입력하세요.");
        String input = scanner.next();

        if (!input.equals("굴리기")) {
            error();
        } else {
            result1 = rollDice();
            System.out.println("첫 번째 주사위: " + result1);
            System.out.println("두 번째 주사위를 굴립니다 '굴리기'를 입력하세요.");
            input = scanner.next();

            if (!input.equals("굴리기")) {
                error();
            } else {
                int result2 = rollDice();
                System.out.println("두 번째 주사위: " + result2);
                System.out.println("세 번째 주사위를 굴립니다 '굴리기'를 입력하세요.");
                input = scanner.next();

                if (!input.equals("굴리기")) {
                    error();
                } else {
                    int result3 = rollDice();
                    System.out.println("세 번째 주사위: " + result3);

                    if (result1 == result2 && result2 == result3) {
                        total = 20000 + result1 * 2000;
                        finalText();
                    } else if (result1 == result2 || result2 == result3 || result3 == result1) {
                        int nums;

                        if (result1 == result2) {
                            nums = result1;
                        } else if (result2 == result3) {
                            nums = result2;
                        } else {
                            nums = result3;
                        }

                        total = 1500 + nums * 100;
                        finalText();
                    } else {
                        System.out.println("꽝!");
                    }
                }
            }
        }
    }

    private void finalText() {
        System.out.println("게임 결과: " + total + "원의 돈을 벌었습니다.");
    }

    private int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    private void error() {
        System.out.println("주사위를 굴리지 않아 프로그램을 종료합니다.");
    }

    public static void main(String[] args) {
        Quiz2 quiz = new Quiz2();
        quiz.play();
    }
}





