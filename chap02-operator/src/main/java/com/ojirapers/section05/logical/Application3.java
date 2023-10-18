package com.ojirapers.section05.logical;

public class Application3 {

    public static void main(String[] args) {
        /*
        논리식 && 논리식 : 앞의 결과가 false면 뒤의 연산을 실행하지 않음.
        논리식 || 논리식 :  앞의 결과가 true면 뒤의 연산을 실행하지 않음.

        조건식 두 개가 모두 만족해야 true를 반환하지만 앞에서 미리 false가 나오게되면
        위의 조건을 확인할 필요 없이 false를 반환한다.
        따라서 연산 횟수를 줄이기 위해서는 &&연산의 경우 앞에서 false가 나올 가능성이 높은 조건을 작성하는 것이 좋다.
         */
        int num1 = 10;
        int result = (false && ++num1>0)? num1: 20;

        /* =
        if (false /뒤에걸 계산할 필요가 없음/ ) {
            result = num1;
        }else {
            result = 20;
        }

        */

        System.out.println(result);

        /* 조건식 둘 중 하나라도 true를 반한하면 true를 반환하기 때문에 앞에서 미리 true가 나오게 되면
        위의 조건을 확인할 필요 없이 true를 반환한다.
         */
        int num2 = 20;
        int result2 = (true || ++num2 >0)? num2 : 10;
        System.out.println(result2);

        /*
        if(true){
            result2 = num2;
        } else if (++num2 > 0) {
            result2 = num2;
        }else {
            num2 : 10;
        }

         */








    }



}
