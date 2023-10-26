package main.java.com.ojiraphers.section06.singleton;

public class Application01 {
    public static void main(String[] args) {


        /*
        // "Eager Initialization" 및 "Lazy Initialization"
        //메서드임. 싱글턴 디자인 패턴을 구현하는데 사용

        1. Eager initialization(이른 초기화)
        -클래스가 로딩될 때 즉시 싱글톤 인스턴스를 생성하는 방식.
        -클래스 로딩과 함께 생성되므로 언제든지 해당 인스턴스에 접근할 수 있음.
        //인스턴스가 반드시 필요하며, 초기화 시간이 길지 않을 때 적합
        //인스턴스가 자주 사용되고, 초기 생성 비용이 적을때 유용함
           public class EagerSingleton {
           private static EagerSingleton instance = new EagerSingleton();
           private EagerSingleton() { }
           public static EagerSingleton getInstance() {
           return instance;
           }
           }

         2. Lazy initialazation (게으른 초기화)
         -인스턴스가 필요한 시점에 생성하는 방식.
         -인스턴스는 처음 사용될 때 생성되므로 초기화 시간이 지연됨.
         //초기 생성비용이 높거나,
         //인스턴스가 필요한 시점이 불분명하거나,
         //리소스를 낭비하지 않아야 하는 경우에 유용함
           public class LazySingleton {
           private static LazySingleton instance;
           private LazySingleton() { }
           public static LazySingleton getInstance() {
           if (instance == null) {
           instance = new LazySingleton();
           }
           return instance;
           }
           }

           ::new 클래스명을 넣고 빼고의 차이.
           이른 초기화는 =new 클래스명 :: 선언으로 인스턴스를 바로 생성하지만
           게으른 초기화는 ; :: 세미콜론으로 선언만 하고 끊었기 때문에 나중에 값을 부여해줘야 함. null이 나올수도 있음.

           :: 인스턴스 - 클래스를 기반으로 생성된 개별 객체
           :: 변수 - 데이터를 저장하고 참조하기 위한 식별자
           == "인스턴스" = 객체 자체
           == "변수" = 데이터를 저장하고 이용하기 위한 명칭


           - 인스턴스의 속성을 참조하거나 조작하기 위해 사용되며, 각 인스턴스(객체)의 속성을 저장함.
           - ex. 자동차 클래스의 인스턴스 변수로 "차량의 속도"를 저장할 때
           - 해당 속도 값을 저장하고 접근하기 위한 변수가 사용될 것.


        */




        //================================

        /*
        singleton pattern(하나의 디자인 패턴) // 어플리케이션 성능 향상 등...
        어플리케이션이 시작될 때 어떤 클래스가 최초의 한 번만 메모리를 할당하고
        그 메모리에 인스턴스를 만들어서 하나의 인스턴스를 공유해서 사용하며
        메모리 낭비를 방지할 수 있게 함. (매번 인스턴스를 생성하지 않는다.)

        장점
        1. 첫번재 이용시에는 인스턴스를 생성해야 하므로 속도 차이가 나지 않지만
        두 번째 이용시에는 인스턴스를 생성 시간 없이 사용할 수 있다.
        2. 인스턴스가 절대적으로 한 개만 존재하는 것을 보증할 수 없다.

        단점
        1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하며 결합도가 높아짐
        (유지보수와 테스트에 문제점이 있음)
        2. 동시성 문제를 고려해서 설계해야 하기 때문에 난이도가 있음.
         */
        /*
        싱글톤 구현 방법
        1. 이론 초기화(Eager initialzation) // 두 번째 생성부터 속도 차이가 남.(더 빠르다)
        2. 게으른 초기화 (Lazy initialzation) //
         */

        /*
        싱글턴 패턴(Singleton pattern)을 따르는 클래스는,
        생성자가 여러 차례 호출되더라도 실제로 생성되는 객체는 하나이고
        최초 생성 이후에 호출된 생성자는 최초의 생성자가 생성한 객체를 리턴한다.
        이와 같은 디자인 유형을 싱글턴 패턴이라고 한다.
        파이썬의 모듈은 그 자체로 싱글턴이다.
        자바는 생성자를 private으로 선언하여 상속이 불가능함을 지정하기도 한다.
        =상속을 막고 독점한다.
        =생성자가 여러 차례 호출되어도 실제로 생성되는 객체는 하나. 최초 생성 이후에 호출되는 것은 최초 생성자를 갖고와 사용하는 것.
        */

        EagerSingleton eager1 = EagerSingleton.getInstance();
        System.out.println(eager1.hashCode());
        eager1 = EagerSingleton.getInstance(); // 값을 그대로 공유
        System.out.println(eager1.hashCode());
        EagerSingleton test1 = EagerSingleton.getInstance();
        System.out.println("test1의 주소 : " + test1.hashCode());
        EagerSingleton test2 = EagerSingleton.getInstance(); // 값을 그대로 공유
        System.out.println("test2의 주소 : " + test2.hashCode());

        System.out.println("========== lazy ==========");
        LazySingleton lazy = LazySingleton.getInstance();
        System.out.println(lazy.hashCode()); // lazy가 null인 상태, lazy 생성됨
        lazy = LazySingleton.getInstance();
        System.out.println(lazy.hashCode()); //lazy가 null이 아닌 상태.

    }



}
