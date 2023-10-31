package main.java.com.ojirapher.section01.polymophism;

import java.util.Queue;

public class Application {
    public static void main(String[] args) {
        /*
        다형성
        다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있는 것을 의미한다.
        그렇기 때문에 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있기도 하고
        하나의 메소드 호출로 객체 별로 각기 다른 방법으로 동작하게 할 수 있다.

        다형성은 객체지향 프로그래밍 3대 특징(캡슐화(외부에서 나를 직접적으로 엑세스할수 없지만, 인터페이스로 이용할 수 있음), 상속(공통된 특징을
        상위에 정리하고, 전달받아 같이 사용함), 다형성)중 하나이며
        객체지향 프로그래밍의 꽃이라고 불리울 정도로 활용성이 높고 장점이 많다.
        하지만 학습하기 어렵다는 단점이 있음.

        다형성의 장점
        1. 여러 타입의 객체를 하나의 탕비으로 관리할 수 있기 때문에 유지보수성과 생산성이 증가한다
        2. 상속을 기반으로 한 기술이기 떄문에 상속관계에 있는 모든 객체는 동일한 메세지를 수신할 수 있다
           이러한 동일한 메세지를 수신받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점을 가지고 있다
           (다양한 기능을 사용하는데 있어서 관리해야 할 메세지 종류가 줄어들게 된다)
           하나의 호출로 여러가지 동작을 수행할 수 있다는 측면에서는 오버로딩을 다향성으로 보기도 한다.
           하지만 이 부분은 이견이 많이 존재하기 때문에 다형성을 이해하는데 참고로만 사용한다.
        3. 확장성이 좋은 코드를 작성할 수 있다.
        4. 결합도를 낮춰서 유지보수성을 증가시킬 수 있다

         */

        System.out.println("Animal 생성2==");
        Animal animal = new Animal();
        animal.cry();
        animal.eat();
        animal.run();

        System.out.println();
        System.out.println("-");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.cry();
        rabbit.run();

        System.out.println();
        System.out.println("==tiger인스턴스 생성");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.cry();
        tiger.run();

        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

//        Rabbit r1 = (Rabbit) new Animal(); // Animal의 형이 (Rabbit)으로 바뀜
//        Tiger t1 = new Tiger();


//        런타임 단계: 변환된 언어를 실행시키는 단계
//        컴파일: 프로그램을 작성하는 도중
        System.out.println("동적 바인딩");
        animal1.cry();
        animal2.cry();
        // 호출할 시점에 값을 동적으로 바꿔줌.
//        동적 바인딩(Dynamic binding)은 런타임(Runtime)에 바인딩하는 것을 말한다.
//        프로그램의 실행 파일이 만들어지고
//        이를 실행하면서 변수 및 함수가 호출될 때 바인딩된다

//        animal.jump(); // 형변환을 하지 않음. animal1인스턴스가 Rabbit에 참고한 형으로 변환됨

        ((Rabbit)animal1).jump();
        //동적 바인딩이 아님. 컴파일 단계
        System.out.println("클래스 타입의 형변환 확인");
        ((Tiger)animal2).bite();

        System.out.println("형변환 오류"); // 불러온 형변환에 bite와 jump항목이 없음
//        ((Tiger)animal1).bite();
//        ((Rabbit)animal2).jump();
//
//        상속을 받은 타입도 함께 가지고 있는 형식을 다향성이라고 한다.
        System.out.println("instanceof확인");
        System.out.println("animal1이 Tiger와 같은지 확인: " + (animal1 instanceof Tiger));
        System.out.println("animal1이 Rabbit와 같은지 확인: " + (animal1 instanceof Rabbit));
        System.out.println("animal1이 Animal와 같은지 확인: " + (animal1 instanceof Animal));
        System.out.println("animal이 Rabbit와 같은가" + (animal instanceof Rabbit));
        System.out.println("animal이 Tiger와 같은가" + (animal instanceof Tiger));
        /*
        클래스 형변환은 up-casting과 down-casting으로 구분할 수 있다.
        up-casting:상위 타입으로 형 변환
        doun=casting:하위 타입으로 형 변환
        또한 작성 여부에따라 명시적과 묵시적 두 가지로 구분된다.
         */

        Animal animal3 = (Animal) new Rabbit(); // up-casting명시적 형변환
        Animal animal4 = new Rabbit(); // 묵시적 형변환
        Rabbit rabbit1 = (Rabbit) new Animal(); // down-casting명시적 형변환
//        Rabbit rabbit2 = new Animal(); // 묵시적 형변환이나 에러



























    }








}
