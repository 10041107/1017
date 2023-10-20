package main.java.com.ojiraphers.section02.looping;

import java.util.Scanner;

public class B_while {
    public void testwhile() {
        /*
        [while 표현식]
        while (조건식) {
        }
         */

//        System.out.println( "숫자를 입력하세요");
//        Scanner sc = new Scanner(System.in);
//        String value = sc.nextLine();
//        int i = 0;
//        "1234567890".charAt(0); // 이 문자열에서 0번째 인덱스를 뽑아온다 = 문자열을 배열로서 취급한다.
//        while (i < value.length() /*사용자가 입력한 문자열의 길이 만큼*/) {
//            System.out.println(i);
//            i++;
//        }
        /*
        do while[표현식]
        do{

        }while(조건식);
        */

        Scanner sc = new Scanner(System.in);
        boolean isTrue = false;
        do{
            System.out.println("메뚜기 월드 게임");
            System.out.println("시작을 원하면 true, 시작을 원하지 않으면 false를 입력해주세요.");
            isTrue = sc.nextBoolean();
        }while(isTrue); //먼저 안의 내용을 실행한 다음에 조건을 판단한다. = do while







    }




}
