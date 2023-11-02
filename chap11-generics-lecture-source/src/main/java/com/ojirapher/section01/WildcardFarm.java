package main.java.com.ojirapher.section01;

public class WildcardFarm {

    public void anyType(RabbitFarm<?> farm){
        farm.getAnimal().cry();
    }

    public void extendnsType (RabbitFarm<? extends  Bunny> farm){
        farm.getAnimal().cry();
    }

    public void superType(RabbitFarm<?super Bunny> farm){
        farm.getAnimal().cry();
    }

}
