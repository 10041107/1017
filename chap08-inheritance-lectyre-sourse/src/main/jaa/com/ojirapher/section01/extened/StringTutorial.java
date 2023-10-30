package main.jaa.com.ojirapher.section01.extened;

public class StringTutorial {



    public static void main(String[] args) {
        StringTutorial car = new StringTutorial();
        System.out.println(car.hashCode());

        StringTutorial car2 = car;
        System.out.println(car2.hashCode());

        StringTutorial car3 = returnCar();
        System.out.println(car3.hashCode());




        System.out.println("====String====");
        String test = "test";
        String test1 = "test";
        System.out.println(test.hashCode());
        System.out.println(test1.hashCode());
        //문자열은 문자가 같으면 같은 주소값을 공유함. 'test'라는 문자의 주소값을 현재 함께 공유하는 중

        String test2 = new String("test");
        System.out.println(test2.hashCode());

        /*
        Java에서 문자열 리터럴(String literal)을 사용할 때
        문자열 상수 풀(String Pool)이라는 메모리 영역에서 문자열을 관리하고,
        동일한 문자열 리터럴을 가리키는 모든 문자열 변수가 동일한 주소를 참조하기 때문입니다.

        문자열 리터럴은 불변(immutable)하다:
        문자열 리터럴은 변경이 불가능하며, 한 번 생성되면 그 내용이 변경되지 않습니다.

        문자열 리터럴 풀:
        Java는 문자열 리터럴을 자동으로 관리하기 위해 문자열 리터럴 풀을 사용합니다.
        이것은 동일한 문자열 리터럴이 메모리 내에서 단 하나의 인스턴스로 유지되도록 보장합니다.

        ==============================

        문자열 리터럴 풀(String Pool)은 Java에서 문자열을 관리하는 특별한 메모리 영역입니다.
        이 메모리 영역은 문자열 리터럴이 저장되는 곳으로,
        문자열 리터럴은 애플리케이션 실행 중에 여러 변수에서 공유할 수 있도록 설계되어 있습니다.

        문자열 리터럴 공유:
        Java는 문자열 리터럴을 재사용하고 공유하는데 목적이 있습니다.
        동일한 문자열 리터럴을 가리키는 모든 문자열 변수는 문자열 리터럴 풀에 저장된 동일한 문자열 인스턴스를 참조합니다.
        메모리 사용량이 절약되고 문자열 비교가 효율적으로 수행됩니다.

        불변성:
        문자열 리터럴은 불변(immutable)하다. 이것은 한 번 생성된 문자열 리터럴의 내용을 변경할 수 없음을 의미합니다.
        이것은 문자열의 안전한 공유를 보장하며,
        문자열이 변경되더라도 다른 변수에 영향을 주지 않습니다.

        자동 생성 및 관리:
        문자열 리터럴은 자동으로 문자열 리터럴 풀에 추가되며,
        JVM(Java Virtual Machine)이 문자열 리터럴을 관리합니다.
        이는 개발자가 직접 풀을 관리할 필요가 없음을 의미합니다.

        문자열 비교:
        문자열 비교(예: equals() 메서드) 시 문자열 리터럴을 사용하면 참조 주소를 비교할 수 있으므로 비교가 빠르고 효율적합니다.
        문자열 리터럴은 참조 주소가 같으므로 내용이 같은 문자열이면 동일한 문자열로 간주됩니다.


         */


        test1 += "1";
        System.out.println(test.hashCode());
        System.out.println(test1.hashCode());
        //문자열이 달라지면 주소값도 함께 달라짐. test =/= 'test1
        //기본 자료형에 string은 없었음...




    }
    public static StringTutorial returnCar(){
        return new StringTutorial();
    }



}
