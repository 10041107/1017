package main.java.com.ojirapher.section02;

public class Application01 {
    public static void main(String[] args) {
//        /*
//        다차원 배열
//        다차원 배열은 2차원 이상의 배열을 의미한다.
//
//        배열의 인덱스마다 또 다른 배열의 주소를 보관하는 배열을 의미한다.
//        즉, 2차원 배열은 1차원 배열 여러개를 하나로 묶어서 관리하는 배열을 의미한다...
//        더 많은 차원의 배열을 사용할 수 있지만 일반적으로 2차원 배열보다 더 높은 차월의 배열은 사용빈도가 적다.
//
//        2차원 배열을 사용하는 방법
//        1. 배열의 주소를 보관할 레퍼런스 변수를 선언(stack)
//        2. 여러 개의 1차원 배열의 주소를 관리하는 배열을 생성(heap)
//        3. 각 인덱스에서 관리하는 배열을 할당(heap)하여 주소를 보관하는 배열에 저장
//        4. 생성한 여러 개의 1차원 배열에 차례로 접근해서 사용
//         */
//
//        //최초선언
////        int[][] iarrl;
////        int iarrl[][];
////        int[] iarrl[];
////        도 가능
//
//        /*
//        heap에 공간을 할당할 때는 new연산자를 이용한다.
//        배열의 주소를 관리하는 배열의 길이는 앞 부분에 정수형으로 표기하며 반드시 크기를 지정해줘야 한다.
//         */
////        iarr1 = new int[3][];
//        //iarrl2 = new int[][4]; // 오류
//        //iarrl3 = new int[][] // 오류
//
//        iarrl[0] = new int[3];
//        iarrl[1] = new int[4];
//        iarrl[2] = new int[5];
//
//        java: variable iarrl might not have been initialized
////        iarr2 = new int[3][5];
//
//        //2차원 배열 초기화
////        베열 이름[몇번째 인덱스]
//
//        System.out.println(iarrl[0]);
//
//        //for 일반문
//        //int i = 0부터, 배열(자동설정됨)길이까지, i++함
//        for (int i = 0; i < iarrl.length; i++) {
//            for (int j = 0; j < iarrl.length; j++){
//                System.out.println(iarrl[j]);
//            }
//
//
//        }

        int[][] iarrl = new int[3][];
        iarrl[0] = new int[5];
        iarrl[1] = new int[5];
        iarrl[2] = new int[5];
        int value = 0;
        for (int i = 0; i < iarrl.length; i++) {
            for (int j = 0; j < iarrl[i].length; j++) {
                iarrl[i][j] = ++value;
            }
        }





    }




}
