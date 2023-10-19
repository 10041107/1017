package main.java.com.ojiraphers.section01.method;

public class Application1 { // 클래스

    public static void main(String[] args) { // 메소드 = 함수 (main=메인 메소드)
        /* static: 스테틱 에리어라는 공간이 따로 있음. 쭉 읽어서 미리 올려놓아서 전부 생성이 되어있는 상태. "= 처음 실행할때 실행되는 부분"

        메소드란?
        메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
         */
    System.out.println("main()메서드 시작됨...");
    Application1 app1 = new Application1(); //생성자를 통해 얘를 생성함 *(여기에 넣어주겠다) = (여기있는거를)*
        //깃헙의 addgit와 비슷한 기능인듯. public static void main만 자동 실행되니 이와의 다른 함수는 add로 추가하자.

        /*
        Application1 app1 = new Application1();
     => Application1 app1  // 메모리에 공간을 확보한다
        app1 = new Application1();  // app1이가 가진 메모리를 Application이 가진 속성을 할당함(=생성함)

         */

        // app1을 만들겠다 new Application1을 참조해서

        app1.methodA();
        //app1에 있는 methodA를 실행시키겠다
        //static: 실행시키려는 것을 메모리에 *미리* 생성해놓음 = 생성하지 않은 것은 사용할수 없음
        //이 메소드: 정의만 했지 생성은 안된 상태.
        //int val = 10; :선언해서 생성이 완료된 상태.(메모리에 올라감)




    }

    // public void method (int){
    // }
    // public:모두의 / void:반환타입 (반환타입 없음) / method:함수이름 / (int): 자료 형태 명시해줘야함

    public void methodA(){
        System.out.println("methodA() 호출....");

        methodB();
        System.out.println("methodA() 종료....");
    }
    public void methodB(){
        System.out.println("methodB() 호출....");
        methodC();
        System.out.println("methodb() 종료....");
    }
    public void methodC(){
        System.out.println("methodC() 호출....");
        System.out.println("methodC() 종료....");
    }


}
