package main.java.com.ojiraphers.section01.method;

public class Application6 {
    public static void main(String[] args) {
        /*
        메소드 리턴값 테스트
        메소드는 항상 마지막에 return명령어가 존재한다.
        return은 자신을 호출한 구문으로 복귀하는 것을 의미한다.
        복귀를 할 때는 그냥 복귀 할 수도 있지만, 값을 가지고 복귀할 수도 있다.
        이 때 가지고 가는 값을 리턴값 이라고 한다.

        return값을 반환받기 위해서는 메소드 선언부에 의한 리턴 타입을 명시해주어야 한다.
        void는 아무 반환값도 가지지 않겠다는 리턴-에 사용할 수 있는 키워드이다.
        반환값이 없는 경우 return을 생략해도 컴파일러가 자동으로 추가하지만,
        반환값이 있는 경우네는 return 구문을 반드시 명시적으로 작성해야만 한다.
        또한 메서드 선언부에 선언한 리턴타입 반환값의 자료형은 반드시 일치해야 한다.
        */
        System.out.println("main() 메소드 시작함");

        //참조 타입의 반환
        //메소드 작성 후 호출을 해보면 아무 변화가 없으나(프린트 선언 안함) 호출을 한 것이다.
        Application6 app6 = new Application6();
        app6.test();
        String returnValue = app6.test();
        System.out.println(returnValue + "가 함수에서 선언할 값이 맞나요?");
    }
    public String test(){
        return "HelloWorld!"; // +주석 처리하면 에러남. (String이나 다른 리턴 *타입*이 있는 경우 반환할 게 없으면 에러가 남)
    }


}
