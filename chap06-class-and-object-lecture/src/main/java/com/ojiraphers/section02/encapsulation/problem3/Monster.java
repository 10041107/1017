package main.java.com.ojiraphers.section02.encapsulation.problem3;

public class Monster {

    private String name;
    public int hp;

    public void setInfo(String info){
        this.name = info;

    }

    public void setHp(int hp){
        if(hp>0){
            System.out.println("정상적으로 체력이 입력되었습니다.");
            this.hp = hp;
        }else {
            System.out.println("체력은 0보다 작거나 같을 수 없습니다.");
            this.hp = 0;
        }
    }

    public String getInfo(){
        return "몬스터의 종류는" + name + "이고, 체력은" + hp + "입니다.";
    }

}
