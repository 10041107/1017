package main.java.com.ojiraphers.section02.encapsulation.problem4;

import main.java.com.ojiraphers.section02.encapsulation.problem4.Monster;

public class Application {

    public static void main(String[] args) {
        /*
        접근제어자의 필요성
         */
        Monster monster = new Monster();
        monster.setKind("프랑켄슈타인");
        monster.setHp(500);
        System.out.println(monster.getHp()+" "+ monster.getKind());
        System.out.println(monster instanceof Object);
        //=monster는 Objact랑 같은거야?  // Objact를 상속받아서 구현된것
        System.out.println(monster.toString());



    }




}
