package com.ojirapers.section03.increment;

public class Application {
    public static void main(String[] args) {

        //증강연산자에 대하여 공부하자
        /*

        (예를들어 x로 가정) x의 앞,뒤로 쓸수 있음
        ㄴ ++X / X++ 앞 또는 뒤의 피연산자의 값을 1만큼 증가시킨다

        ㄴ --X / X-- 앞 또는 뒤의 피연산자의 값을 1만큼 증가시킨다
         */

        int num = 10;
        int num2 = 20;
        int result;
        ++num;
        num++;
        //피연산자 자체의 값을 바꿔버리는 기능. "메모리 자체에 바뀐 값이 남음"

        //result = ++num;
        //System.out.println(result);

        //초기화 = 대입연산자(=)로 값을 부여시킴
        //초기화가 되어있지 않으면 에러남
        result = num * ++num2; // ++가 우선순위 발동. num2를 먼저 +1하고 num을 곱함.
        result = num * num2++;// ++가 우선순위 발동x. num을 곱하고 result에 대입 후 num2에 +1됨(이후 코드부터 적용됨)
        System.out.println(result);








    }

}
