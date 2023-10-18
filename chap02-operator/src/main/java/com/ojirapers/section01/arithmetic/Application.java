package com.ojirapers.section01.arithmetic;

public class Application {
    public static void main(String[] args) {
        System.out.println("정민식님 생일 축하합니다");

        /*산술 연산자
        산술 연산자는 주로 사칙연산과 관련된 연산자로 가장 기본적이면서도 많이 사용되는 연산자이다.
        연산의 실행이 가능하기 위해 필요한 값이나 변수가 두 개인 이항 연산자로 분류되어
        피연산자들의 연산 방향은 항목에서 오른쪽이다.

        연산자의 우선순위는 우리가 알고 있는 수학과 동일하다.
         */

      int num1 = 20;
      int num2 = 7;

      System.out.println("num1 + num2 = " + (num1 + num2));
      System.out.println("num1 - num2 = " + (num1 - num2));
      System.out.println("num1 * num2 = " + (num1 * num2));
      System.out.println("num1 / num2 = " + (num1 / num2));
      System.out.println("num1 % num2 = " + (num1 % num2));

        System.out.println("num1 + num2 = " + num1 + num2);
       // System.out.println("num1 + num2 = " + (int에서 string으로 변환) + (string에서 string으로 변환));

       // System.out.println("num1 - num2 = " + num1 - num2); 문자열로서 인식이됨. 문자열은 더하기만 가능하다
        // 자바에서는 문자열과 숫자 값을 연결할 때 숫자 값을 문자열로 변환한 후 연결해야 합니다.
        // 추가적으로 뺄셈 연산(-)은 별도로 수행해야 합니다.
        System.out.println("num1 * num2 = " + num1 * num2);
        System.out.println("num1 / num2 = " + num1 / num2);
        System.out.println("num1 % num2 = " + num1 % num2);




    }
}
