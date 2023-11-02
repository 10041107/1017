package main.java.com.ojirapher.section01.run;

import main.java.com.ojirapher.section01.*;

public class Application2 {

    public static void main(String[] args) {
        /*
        와일드카드(WildCard)
        제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때 그 객체의 타입 변수를 제한할 수 있다.
        <?> : 제한 없음
        <? extend Type> :와일드카드의 상한 제한 (Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 허용)
        <? super Type> : 와일드카드의 하한 제한 (Type과 Type의 부모를 이용해서 생성하나 인스턴스만 인자로 허용)
         */

        WildcardFarm wildcardFarm = new WildcardFarm();

//        wildcardFarm.anyType(new RabbitFarm< Mammal>(new Mammal()));
//        wildcardFarm.anyType(new RabbitFarm<Reptile>(new Reptile()));
        wildcardFarm.anyType(new RabbitFarm<>(new Rabbit()));
        wildcardFarm.anyType(new RabbitFarm<>(new Bunny()));
        wildcardFarm.anyType(new RabbitFarm<>(new DrunkenBunny()));

//        wildcardFarm.extendnsType(new RabbitFarm<Rabbit>(new Rabbit()));
        //extendsType: bunny랑 bunny후손만 수용 가능
        wildcardFarm.extendnsType(new RabbitFarm<>(new Bunny()));
        wildcardFarm.extendnsType(new RabbitFarm<>(new DrunkenBunny()));

        wildcardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildcardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));

        // +아래의 내용을 테스트하기 전
//      RabbitFarm <T extends Rabbit> ->> RabbitFarm <T extends Object>
        //RabbitFarm<T extends Rabbit>으로 타입이 지정되어 있기 때문에
        //superType(RabbitFarm<? super Bunny>)로 정의를 하게 되면
        //허용 범위가 Rabbit ~ Bunny 사이의 조상만 허용이 가능하게 된다.
//        wildcardFarm.superType(new RabbitFarm<Mammal>(new Mammal()));

        

        //superType(RabbitFarm<? super Bunny>)로 정의가 되어있기 때문에
        //Bunny와 관련이  없는 Reptile타입을 지시할 수 없음
//        wildcardFarm.superType(new RabbitFarm<Reptile>(new Snake()));


    }


}
