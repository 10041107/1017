package main.java.com.ojiraphers.section04.constructor;

public class Application {
    public static void main(String[] args) {
        /*
        생성자란?
        인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해 두고, 인스턴스를 생성할 때 호출된다.
        생성자 함수에 매개변수가 없는 생성자를 기본 생성자(default contructor)라고 하며,
        기본 생성자는 compiler에 의해 자동으로 추가되기 때문에 지금까지 명시적으로 작성하지 않고 사용하였다.
        (인스턴스 생성 시 별도로 수행할 명령이 없기 때문에 아무것도 작성하지 않은 것이다.
         */
        //원시 자료형 == 기본자료형 == 프리미티브 타입
        // int a; 변수를 선언한다
//        a = 10; // a를 10으로 초기화 한다

        //참조 자료형 == 래퍼런스 타입 == 사용자 정의
        // User user; 변수를 선언한다
        // 변수 == 주소 ==  속성
        // 변수(=주소값)

//        User user; // 변수의 타입과 이름을 정해준다
//        user = new User; // 변수를 초기화한다 (=변수를 생성한다) (=메모리 주소값이 생김)


        User user;

        user = new User();
        int a;

        System.out.println();

    }
}
