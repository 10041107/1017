package main.java.com.ojiraphers.section05.parameter;

public class ParameterTest {

    public void testPrimarytypeParameter(int num){
        System.out.println("매개변수로 전달받은 값 : " + num);

    }
    public void testPrimaryTypeArrayParmeter(int[] iarr){
        System.out.println("매개변수로 전달받은 값 : " + iarr[0]);

        System.out.println("배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");

        }

        System.out.println();
        iarr[0] = 99;
        System.out.println("변경 후 배열의 값 출력");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");

        }

        System.out.println();
    }

    public void testClassTypePermeter(Ractengle ractengle){
        System.out.println("매개변수로 전달받은 값 : " + ractengle);
        System.out.println("변경 전 사각형의 넓이와 둘레 =========");
        ractengle.calcArea();
        ractengle.calcRound();
        System.out.println("변경 후 사각형의 둘레와 넓이 ======");
        ractengle.setWidth(100);
        ractengle.setheight(100);
        ractengle.calcArea();
        ractengle.calcRound();


    }

    public void testVariableLangthArrayParameter(String name, String... hobbys){
        System.out.println("이름 : " +name);
        System.out.println("취미의 개수" + hobbys.length);
        System.out.println("취미 : ");
        for (String hobby: hobbys){
            System.out.println(hobby + " ");
        }
        System.out.println();
    }


}
