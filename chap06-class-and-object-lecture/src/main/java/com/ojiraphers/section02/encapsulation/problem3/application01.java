package main.java.com.ojiraphers.section02.encapsulation.problem3;

import main.java.com.ojiraphers.section02.encapsulation.problem3.Monster;

public class application01 {
    public static void main(String[] args) {



        Monster monster = new Monster();
        monster.setInfo("드래곤");
        String monsterInfo = monster.getInfo();
        System.out.println(monsterInfo);


        Monster monster0 = new Monster();
        monster.setInfo("드라큘라"); // 드라큘라
        monster.setHp(10);

        Monster monster1 = new Monster();
        monster1.setInfo("두치"); // 미이라
        monster1.setHp(1000);

        Monster monster2 = new Monster();
        monster2.setInfo("뿌꾸"); // 프랑켄
        monster2.setHp(500);

        System.out.println(monster0.getInfo());
        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());





    }


}
