package main.java.com.ojiraphers.section03.grammar;

public enum UserRole2 {
    GUEST("게스트"),
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");
    //상수 열거 필드만이 아니라 추가로 뭔가 더 해줘야한다면 무조건 세미콜론 추가

    private final String dsscription;

    UserRole2(String dsscription) {
        this.dsscription = dsscription;
    }

    public String getDsscription(){
        return this.dsscription;
    }

}
