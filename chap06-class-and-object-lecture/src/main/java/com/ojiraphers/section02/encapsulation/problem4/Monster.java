package main.java.com.ojiraphers.section02.encapsulation.problem4;

public class Monster {
    /*
    접근제한자 (=접근제어자)
    클래스 혹은 클래스의 멤버에 참조연산자로 접근할 수 있는 범위를 제한하기 위한 키워드
    1. public : 모든 패키지에 접근 허용
    2. protected : 동일 패키지에 접근 허용 단, 상속관계에 있는 경우 다른 패키지도 접근 가능
    3. default : 동일 패키지에서만 접근 허용 (기본값으로 작성하지 않으면 default 접근 제한을 갖는다.)
    4. private : 해당 클래스 내부에서만 접근을 허용

    위의 네 가지 접근제한자는 클래스의 멤버(필드, 메소드)에 모두 사용이 가능하다.
    단, 클래스 선언 시 사용하는 접근 제한자는 public과 default만 사용이 가능하다.
    필드: 클래스에 선언된 변수
    멤버: 클래스에 정의된 모든 속성을 의미 (=필드, 메소드 전부)
     */

    private String kind;
    public int hp;

    public void setKind(String kind) {
        this.kind = kind;
    }

    void setHp(int hp){
        if (hp>0) {
            this.hp = hp;

        }else {
            this.hp = 0;
            System.out.println("캐릭터가 죽었습니다.");
        }
    }

    public String getKind(){
        return this.kind;
    }

    int getHp(){
        return  this.hp;
    }

    @Override
    //부모한테 있는 기능을 예가 상속받아서 다시 정의함. 현재 toString을 상속받은 상태
    public String toString(){
        return " 입력한 종류는 " +kind+" 이고 채력은 "+hp+" 입니다";
    }

}
