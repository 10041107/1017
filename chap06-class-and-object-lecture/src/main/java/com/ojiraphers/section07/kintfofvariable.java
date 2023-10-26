package main.java.com.ojiraphers.section07;

public class kintfofvariable {
    /*클래스 영역에 사용하는 변수 = 필드 = 멤버변수 = 전역변수
    필드 == 멤버변수 =클래스가 가지는 멤버라는 의미) == 전역변수 (클래스 전역에서 사용할 수 있는 변수라는 의미)
     */
    //non static field를 인스턴스 변수라고 한다.
    private int globalNum;

    //Stetic Field를 정적 필드(클래스 변수)라고 한다. 정적(클래스)영역에 생성되는 변수
    private static int staticNum;
    private void testMethod(int num){
        /*
        메소드 영역에서 작성하는 변수 = 지역변수
        메소드 괄호 안에 선언하는 변수 = 매개변수
        매개변수= =일종의 지역변수
        지역변수, 매개변수 모두: 메소드 호ㅜㄹ시 stack을 할당받음.
         */

        int localNum;
        System.out.println(num);
//        System.out.println(localNum); // 지역변수는 반드시 초기화 해줘야 한다.
        System.out.println(globalNum); // 전역변수는 기본값으로 초기화가 됨
        System.out.println(staticNum);

    }
    private void sss(){
//        System.out.println(localnum); // 지역변수는 클래스가 다르면 사용 불가
        System.out.println(globalNum);
        System.out.println(staticNum);
    }




}
