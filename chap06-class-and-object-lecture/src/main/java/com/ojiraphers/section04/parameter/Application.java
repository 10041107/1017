package main.java.com.ojiraphers.section04.parameter;

public class Application {

    public static void main(String[] args) {

        ParameterTest pt = new ParameterTest();

        int num = 20;
        pt. testPrimarytypeParameter(num);
        int[] iarr = new int[] {1,2,3,4,5,6,7};
        System.out.println("인자로 전달받은 값 : " +iarr[0]);
        System.out.println(num); // 주소값 엑세스가 불가능한 상태
        pt.testPrimaryTypeArrayParmeter(iarr);
        System.out.println("전달 후 iarr의 값 : " + iarr[0]);

        System.out.println();

        Ractengle r1 = new Ractengle(12.5, 22.5);
        System.out.println("인자로 전달하는 r1의 값 : " +r1);
        r1.calcArea();
        r1.calcRound();

        pt.testVariableLangthArrayParameter("홍길동");
        pt.testVariableLangthArrayParameter("홍길동", "농구", "헬스", "무데아티"); }

//    public static void test (int... num){ //하나의 변수만 작성해야 함
//        System.out.println(nu,legnhr);








    }




}
