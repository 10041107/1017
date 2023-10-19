package main.java.com.ojiraphers.section01.method;

public class Application9 {
    public static void main(String[] args) {
        /*
        계산기 만들기
         */

        int first = 100;
        int second = 50;
        int result;


        // result = app9.minNumberOf(first ,second) ;
        // : 스테틱 메소드 접근 (권장하지 않음. 용량이 정해져있지 않아 부족할수 있음)
        // result = Caculator.minNumberOf(first ,second) ;
        // : 일반 메소드 접근 (클래스 자체를 불러오자)

      Caculator app9 = new Caculator();

      result = Caculator.minNumberOf(first ,second) ;
      System.out.println("result is : " +  result );
      result = Caculator.maxNumberOf(first ,second) ;
      System.out.println("result is : " +  result );

    }


}
