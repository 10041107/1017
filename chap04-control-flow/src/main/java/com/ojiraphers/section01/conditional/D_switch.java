package main.java.com.ojiraphers.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public static void main(String[] args) {
        /*
        [switch 문 표현식]
        switch(비교형 변수(값 가능)){
        case 비교값 : 비교값 1과 일치하는 경구 실행할 구문; break;
        case 비교값2 : 비교값 2과 일치하는 경구 실행할 구문; break;
        case 비교값3 : 비교값 3과 일치하는 경구 실행할 구문; break;
        default : case 모두에 해당하지 않는 경우 실행할 구문(생략가능); break;
        }

        여려 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은 if-else-if와 유사하다.
        따라서 일부 호환이 가능하다.
        하지만 switch문으로 비교 가능한 값은 정수, 문자 문자열 형태의 값이다.
        실수, 논리는 비교할 수 없다.
        또한 정확하게 일치하는 경우에만 비교할 수 있으며, 대소비교를 할 수 없다는게 차이점이다.
        case절에는 변수를 사용하지 못한다.
        또한 문자열 비교는 jdk1.7부터 가능하다.

         */

        testSwitchVendingMachine();

        //가져올 클래스 선언();
        //String 변수명 = 선언한 클래스();
        // so.(변수명);

        }

//   public void testNestedIfElseIfStatement2(){
//        Scanner sc = new Scanner(System.in);
//        System.out.printf("첫 번째 정수 입력");
//        int first = sc.nextInt();
//        System.out.printf("두 번째 정수 입력");
//        int second = sc.nextInt();;
//
//        System.out.printf("연산 기호 입력");
//        char op = sc.next().charAt(0);
//        int result = 0;
//        switch (op){
//            case  '+' : result = first + second;
//            break;
//            case  '-' : result = first - second;
//            break;
//            case '*' : result = first * second;
//            break;
//            case '/' : result = first / second;
//            break;
//            case '%' : result = first % second;
//            break;
//        }
//        System.out.printf(first + " " +op + " " +second +" = "+ result);
//
//    }


    public static String testSwitchVendingMachine(){
        /*
         * 사용자가 선택한 음료와 가격을 문자열로 반환해주자
         * 프로그램의 콘솔 출력은 반환받은 값을 main에서 출력할 것이다.
         *
         * 단 자판기는 switch 를 이용해서 만든다.
         * */




        System.out.println("=== OhGiraffers vending machine ===");
        System.out.println("  사이다(500)   콜라(600)   환타(700)   박카스(1000)  핫식스(1500)  ");
        System.out.println("==============================");
        System.out.print("음료를 선택해주세요 : ");

        Scanner sc = new Scanner(System.in);
        String selectedDrink = sc.nextLine();

        String drink = "";
        int price = 0;



        switch (selectedDrink) {
            case "사이다":
                price = 500;
                drink = selectedDrink;
                break;
            case "콜라":
                price = 600;
                drink = selectedDrink;
                break;
            case "환타":
                price = 700;
                drink = selectedDrink;
                break;
            case "박카스":
                price = 1000;
                drink = selectedDrink;
                break;
            case "핫식스":
                price = 1500;
                drink = selectedDrink;
                break;
        }

        return (drink + "의 가격은 " + price + "원 입니다.");
        // return main.of(price, selectedDrink);
        //리턴문은 하나만 작성할 수 있다. return (클래스명).of (변수1, 변수2);

    }







}
