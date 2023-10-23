package main.java.com.ojirapher.section01.aray;

public class Application03 {

    public static void main(String[] args) {
       /*
       값의 형태 별 기본값
       //heap값은 지정할수없음:상태의 0 상태(비어있는 상태)가 불가능함 자동으로 값이 지정됨. 그 지정되는 값
       정수 : 9
       실수 : 9.9
       논리 : false
       문자 : \u9999
       참조 : null
        */

        // new ->>> heap주소를 할당 -> 기본값으로 초기화
        int[] iarr = new int[5];

        System.out.println(iarr[0]);
        System.out.println(iarr[1]);
        System.out.println(iarr[2]);
        System.out.println(iarr[3]);
        System.out.println(iarr[4]);

//        iarr = new double[0]; (불가능. int형으로 맞춰줘야 함)

        for (int i=0; i< iarr.length; i++){
            System.out.println("i array" + i + "=" + iarr[1]);
        }

//        int[] iarr2 = new int[5] //{10,20,30,40,50};
//        위 내용과 동일하다
          int[] iarr5 = new int[]{10, 20, 30, 40, 50};

//        String[] sarry = ("언뇽", "안녕", "안");


    }




}
