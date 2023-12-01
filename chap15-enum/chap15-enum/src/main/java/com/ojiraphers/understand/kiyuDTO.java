package main.java.com.ojiraphers.understand;

public class kiyuDTO {
    private int hp;
    private int money;

    public int getHp() {
        return hp;
    }

    public void setHp(int hpChange) {
        this.hp += hpChange; // 로직 짜라
        if(this.hp > 100){
            this.hp = 100;
        }else if(this.hp < 0) {
            System.out.println("기유 트레이너가 쓰러졌습니다.....");
        }

    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
        if(this.money < 0){
            this.money = 0;
        }
    }

    @Override
    public String toString() {
        return "kiyuDTO{" +
                "hp=" + hp +
                ", money=" + money +
                '}';
    }
}
