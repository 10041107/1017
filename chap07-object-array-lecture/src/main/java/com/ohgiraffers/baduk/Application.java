package main.java.com.ohgiraffers.baduk;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String[][] baduk = new String[3001][3001];


        for (int i = 0; i < baduk.length; i++) {
            for (int j = 0; j < baduk[i].length; j++) {
                baduk[i][j] = " ";
            }
        }
        boolean test = true;
        Scanner scanner = new Scanner(System.in);
        int turn = 1;


        while (test) {
            System.out.println(((turn % 2 == 0) ? "홍팀" : "청팀") + " 님 차례입니다. 게임을 종료하려면 3000 3000을 입력하세요.");
            String[] index = scanner.nextLine().split(" ");
            int first = Integer.parseInt(index[0]);
            int second = Integer.parseInt(index[1]);

            if ((first == 3000) || (second == 3000)) {
                System.out.println("게임을 종료합니다.");
                break;
            }
                else if (first > 29 || second > 29) {
                System.out.println("숫자는 1부터 29까지 가능합니다.");
                continue;
            }
            else {
                if (turn % 2 == 0) {
                    if (baduk[first][second].equals(" ")) {
                        baduk[first][second] = "O";
                    } else {
                        System.out.println(((turn % 2 == 0) ? "홍팀" : "청팀") + " 님 다시 입력해주세요.");
                        continue;
                    }
                } else {
                    if (baduk[first][second].equals(" ")) {
                        baduk[first][second] = "X";
                    } else {
                        System.out.println(((turn % 2 == 0) ? "홍팀" : "청팀") + " 님 다시 입력해주세요.");
                        continue;
                    }
                }

                for (int i = 0; i < baduk.length; i++) {
                    System.out.print("|");
                    for (int j = 0; j < baduk[i].length; j++) {
                        System.out.print(baduk[i][j] + "|");
                    }
                    System.out.println();
                }
                turn++;
            }

        }
    }
}