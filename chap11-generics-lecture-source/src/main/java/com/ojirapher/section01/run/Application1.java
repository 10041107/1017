package main.java.com.ojirapher.section01.run;

import main.java.com.ojirapher.section01.*;

import java.util.ArrayList;
import java.util.List;

public class Application1 {

    public static void main(String[] args) {

//        RabbitFarm<Animal> farm1 = new RabbitFarm<>(); //불가능
//        RabbitFarm<Mammal> farm1 = new RabbitFarm<Mammal>(); //불가능 (자기 부모라서)
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<Rabbit>(); // 가능(자기 자신이라서)
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>(); // (rabbit후손들도 모두 가능)
//        RabbitFarm<?> farm7 = new RabbitFarm<>(); // <?> : 와일드카드(어떤 타입일지 모름)
//        farm7.setAnimal(new Snake());

        farm4.setAnimal(new Rabbit());
        ((Rabbit)farm4.getAnimal()).cry();
//        Object test = new Object();
//        ((Rabbit)test).cry(); // 제네릭스타입: 타입을 알 수 없고 실행 후에 동적으로 지정해줌.

        // Rabbit의 후손 타입만 허용할 수 있도록 제네릭스의 제한을 걸어두었기 때문에
        //<T extends Rabbit>형변환이 생략가능하다.
        //이유: T이 결정되어도 T의 값은 Rabbit의 후손일 것이기 때문에
        farm4.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        ((Bunny) farm6.getAnimal()).cry();

        List<? super Rabbit> parents = new ArrayList<>();
        parents.add(new Rabbit());
        parents.add(new Mammal());


    }


}
