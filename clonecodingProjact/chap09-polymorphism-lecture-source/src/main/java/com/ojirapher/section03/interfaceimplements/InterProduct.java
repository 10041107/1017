package main.java.com.ojirapher.section03.interfaceimplements;

import java.io.Serializable;

public interface InterProduct extends Serializable {
    /*
    인터페이스가 인터페이스를 상속받을 시에는 extends키워드를 이용하며
    이 때는 여러 인터페이스를 다중 상속받을 수 있다.
     */


    /*
    추상메서드의 묶음 = 인터페이스
    인플리먼츠 = 인터페이스를 상속받는다
    익스텐드 = 클래스를 상속받는다

    인터페이스는 상수 필드만 작성이 가능하다.
    public static final제어자 조합을 상수 필드라고 한다
    반드시 선언과 동시에 초기화해줘야 한다.
    이유: 인터페이스는 생성자를 받지 않기 때문. 무조건 상속 시켜줘야 함
     */

    public static final int MAX_NUM = 100;
    //인터페이스는 상수 필드만 가질 수 있기 때문에 모든 필드는 묵시적으로 public static final이 된다.
    int MIN_NUM = 10;

    //인터페이스는 생성자를 가질 수 없다.
    //인터페이스를 사용하는 목적은 추상 메서드를 묶어서 제공하기 위함이다.
    //그렇기 때문에 INTERFACE를 생성하며 사용하는 일이 없이 어딘가에 상속하여 구현 후 사용하게 된다
//    public InterProduct(){}

    //추상 메서드는 몸체를 갖지 않기 때문에 오류 발생
//    public abstract void nonStaticMethod(){}

    public abstract void nonStaticMethod();

    /*
    인터페이스 안에 작성한 메서드는 묵시적으로 public abstrect의 의미를 가진다.(다른 접근제한자 사용불가)
    따라서 인터페이스의 메소드를 오버라이딩 해야하는 경우
    반드시 접근제한자를 public으로 해야 오버라이딩이 가능하다.
     */
    void  abstMethod();

    //static키워드를 이용하여 작성하는 경우 가능하다. (jdk1,8이후 추가된 기능)
    public static void staticMethod(){
        System.out.println("InterFroduct 클래스의 static Method호출");
    }

    //default키워드를 이용하여 작성하는 경우 가능하다 (jdk1.8이후 추가된 기능)
    public default void defaultMethod(){
        System.out.println("InterProduct클래스의 defaultMethod메서드 호출됨");
    }




}
