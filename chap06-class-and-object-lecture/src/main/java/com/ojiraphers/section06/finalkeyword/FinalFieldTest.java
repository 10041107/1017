package main.java.com.ojiraphers.section06.finalkeyword;

public class FinalFieldTest {
    /*
    필기
    final
    :final은 중단의 의미를 가지는 키워드이다
    Final키워드를 사용하 수 있는 위치는 다양한 편이며 의미가 약간 다르지만, 결국 변경은 불가의 의미이다
    1. 지역변수: 초기화 이후 값 변경 불가 final String value = "final";
    2. 매개변수: 호출시 전달한 인자 변경 불가 method(final String value;)
    3. 전역변수: 인스턴스 생성 후 초기화 이후에 값 변경 불가
    4. 클래스(static)변수: 프로그램 start이후 값 변경 불가
    5. non-static 메소드: 메소드 재작성(overriding)불가
    6. static 메소드: 메소드 재작성(overriding)불가
    7. 클래스: 상속 불가

    final은 변경 불가의 의미를 가진다.
    따라서 초기 인스턴스 (생성된 객체)가 생성되고 나면 기본값인 0이 필드에 들어가게 되는데,
    그 초기화 이후 값을 변경할 수 없기 때문에 선언하면서 바로 초기화를 해주어야 한다.
    그렇지 않으면 compile error가 발생한다.
     */

    //private final int nonStaticNum;
    //final을 쓰면 수정이 안되고 int는 기본값이 0이기 때문에 에러남

    private final int NON_STATIC_NUM = 1;
    private final String NON_STATIC_NAME;
    //대문자로 쓰이는 이유: 상수(변하지 않는 값)이기 때문.
    //final이 붙으면 값이 변하지 않기 때문에 대문자와 스네이크 케이스를 사용해서 표기.
    // String 도 상수가 가능하다.

    public FinalFieldTest(String nonStaticName){
        //상수값이 정해지지 않을 때 따로 생성자를 만들어서 사용한다.
        //기본 생성자를 제공받지 않아서 입력을 받아야만 위의 final이 선언된다.
        this.NON_STATIC_NAME = nonStaticName;
    }
    /*
    private static final int STATIC_NUM;
    // static이 이미 프로그램 실행 시점에 가장 먼저 발동하기 때문에 위와 같은 방법 불가능

    public FinalFieldTest(int nonStaticNum) {
        this.NON_STATIC_NUM = nonStaticNum;
    }

    */
    private static final int STATIC_NUM = 10; //이렇게 사용
    /////
    private static final double STATIC_DOUBLE;

    static  {
        //스태틱 초기화 블록
        STATIC_DOUBLE = 10.0;
    }



}
