package main.java.com.ojirapher.section03.copy;

public class Application02 {
    public static void main(String[] args) {



        //레퍼런스 타입: 검색

        String[] names = {"홍길동", "유관순", "이순신"};

        System.out.println("names의 Hashcode : " + names.hashCode());

        print(names); // 주소값을 보냄. 값이 아니라.

        String[] animals = getAnimals();
        System.out.println("리턴 받은 animals의 hashcode : " + animals.hashCode());

        print(animals);

    }

    public static void print(String[] args){
        System.out.println("args의 hashcode : " + args.hashCode());

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[1] + " ");
            /*
            매개변수 args: 그냥 변수명. '프린트' 클래스에 정의된 변수명 이름.
            함수를 호출할 때 값을 전달하기 위해 사용하는 변수.
            함수 또는 메서드의 정의에서 선언되며, 해당 함수를 호출할 때 전달되는 데이터와 상호작용하는데 사용됩니다.
            둘 사이에서 양편의 관계를 맺어주면서, 어떤 관계나 범위 안에서 여러가지 값으로 변할 수 있는 가변적 요소
            */
        }
        System.out.println();
    }


    public static String[] getAnimals(){
        String[] animals = new String[] {"낙타", "호랑이", "나무늘보"};

        return animals;
    }

}
