package main.java.com.ojiraphers.section01.method;

public class Application7 {
    public static void main(String[] args) {
        /*
        두 수를 매개변수로 받아 더한 값을 반환하는 함수
        두 수를 매개변수로 받아 뺀 값을 반환하는 함수
        두 수를 매개변수로 받아 곱한 값을 반환하는 함수
        두 수를 매개변수로 받아 나눈 값을 반환하는 함수
        메서드 4개 제작
         */

        int a = 10;
        int b = 20;

        Application7 app7 = new Application7();

        int returnValue;
        // returnValue변수는 동일한 메서드 내에서 다시 선언할 수 없다.
        // 사용하기 전에 한번만 선언해야 하므로 해당 코드로 함축해야 한다.


        returnValue = app7.ad(a,b);
        System.out.println(returnValue);
        // returnValue를 변수로 지정함

        returnValue = app7.su(a,b);
        System.out.println(returnValue);

        returnValue = app7.mu(a,b);
        System.out.println(returnValue);

        returnValue = app7.di(a,b);
        System.out.println(returnValue);


    }

    public int ad (int a, int b){
        return  a + b;
    }
    public int su (int a, int b){
        return a - b;
    }
    public int mu (int a, int b){
        return a * b;
    }
    public int di (int a, int b){
        return a / b;
    }

}
