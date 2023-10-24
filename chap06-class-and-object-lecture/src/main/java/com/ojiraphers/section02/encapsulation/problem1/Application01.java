package main.java.com.ojiraphers.section02.encapsulation.problem1;

public class Application01 {
    public static void main(String[] args) {
        //=== 변수와 인스턴스의 차이
        // 변수는 데이터를 저장하거나 참조하기 위한 이름이며,
        // 변수의 값은 인스턴스를 가리키거나 클래스의 속성을 저장하는 데 사용될 수 있습니다.
        // 인스턴스는 클래스의 객체를 실제로 생성한 것이며, 각각의 인스턴스는 해당 클래스의 속성과 동작을 가집니다.

        Monster monster = new Monster();
        //클래스 변수명 = new(=인스턴스 생성) 클래스();
        //새로운 Monster 객체가 메모리에 생성되고, monster 변수가 이 객체를 참조합니다.
        //인스턴스 = 객체
        System.out.println(monster.hashCode());
        //93122545.ht

        monster.name = "두치"; // = 93122545.name
        // =/= monster.name = "두치"; => 이게 맞다면 monster2.name도 "두치"여야 함.
        monster.hp = 200; // = 93122545.hp

        System.out.println("> monster name : " + monster.name);
        System.out.println("> monster hp : " + monster.hp);

        Monster monster2 = new Monster();
        System.out.println(monster2.hashCode());
        System.out.println("> monster2의 name : " + monster2.name);
        //null = 문자는 null값을 허용할 수 있음. int등의 숫자형은 허용 불가능해서 0.0, 0등으로 초기화됨
        //2083562754.ht

        monster2.name = "뿌꾸";
        monster2.hp = 200;
        System.out.println("> monster2의 name : " + monster2.name);
        System.out.println("> monster2 hp : " + monster2.hp);

        Monster monster3 = new Monster();
        monster3.name = "드라큘라";
        monster3.setHp(-200);
        System.out.println("monster3의 name" + monster3.name);
        System.out.println("monster3의 hp" + monster3.hp);

        Monster monster4 = new Monster();
        monster4.name = "프랑켄슈타인";
        monster4.setHp(1000);
        System.out.println("monster4의 name" + monster4.name);
        System.out.println("monster4의 hp" + monster4.hp);




    }



}
