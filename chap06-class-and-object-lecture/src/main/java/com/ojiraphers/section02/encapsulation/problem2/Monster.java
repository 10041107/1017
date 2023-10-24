package main.java.com.ojiraphers.section02.encapsulation.problem2;

public class Monster {

    String kind
            ;
    int hp;

    public void setHp(int hp){
        if(hp > 0) {

            //this[=자기 자신(클래스)].변수
            //전역변수: 활동범위가 넓음. 모든 메소드에 존재하는 상태
            //지역변수: 현재 메소드에만 존재하는 상태. 전역변수와 지역변수의 차이에 따라 변수를 사용하고 사용불가능하고가 달라짐. (int와 this의 차이 등

            /*
            this는 인스턴스가 생성되었을때 자신의 주소를 저장하는래퍼런스 변수이다.
            지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선적으로 접근하기 때문에
            전역변수에 접근하기 위해서는 this.를 명시해야 한다.
             */
            System.out.println("양수값이 입력되어 몬스터의 체력을 입력한 값으로 변경합니다.");
            this.hp = hp;
        }else {
            System.out.println("0보다 작거나 같은 값이 입력되어 몬스터의 체력을 0으로 설정합니다.");
            this.hp = 0;


        }
    }



}
