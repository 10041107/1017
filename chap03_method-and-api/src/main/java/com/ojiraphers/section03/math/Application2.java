package main.java.com.ojiraphers.section03.math;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력해주세요.");
        String greating = sc. nextLine();
        //줄 전체를 가져옴
        System.out.println(greating);

        System.out.println("두번째 값을 입력해주세요.");
        //첫번재 호출을 인식하고 단어의 맨 앞부분을 가져옴
        String greating2 = sc.next();
        System.out.println(greating2);



    }

}
