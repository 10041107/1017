package main.java.com.ojirapher.section03.interfaceimplements;

import java.io.Serializable;

public class Product extends Object implements InterProduct{
    /*
    클래스에서 인터페이스를 상속받을 때에는 implement키워드를 사용한다.
    또한 인터페이스는 여러개를 상속받을 수 있으며,
    extends로 다른 클래스를 상속받는 경우에도 그것과 별개로 인터페이스도 추가 상속이 가능해진다.
    단, extend키워드를 앞에 작성하고 implements를 뒤에 작성한다.(순서 변경시 에러)
     */

    /*
    인터페이스에 추상메서드는 구현책임의 원칙으로 인하여 전부 구현해야 한다.
    단 default메소드의 재정의는 선택이며 static은 재정의가 불가능하다
     */

    @Override
    public void nonStaticMethod() {
        System.out.println("interproduct의 nonstaticMethod오버라이딩 메소드 호출");
    }

    @Override
    public void abstMethod() {
        System.out.println("interfroduct의 absMethod 오버라이딩 메소드 호출");
    }

//    @Override static 메서드의 경우 재정의가 불가능하다.
//    public static void staticMethod(){}
    @Override
    public void defaultMethod() {
        System.out.println("default Method 오버라이딩 호출");
    }
}
