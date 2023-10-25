package main.java.com.ojiraphers.section03.dto;

public class MemberDTO {
    /*
    DAO :데이터베이스에 값을 저장함 (서비스에 속하지 않음. 그냥 붙어있는 수준)
    정상적으로 됐다: 등의 결과를 서비스로 반환함. 서비스(=모델)>컨트롤러로 이동하고, 컨트롤러가 뷰(프론트)로 전달

    DTO (Data TranfFer Object)의 약자로 계층간의 데이터 전송을 위해 도메인 모델 대신 사용하는 객체.
     */
    private int number; //회원번호
    private String name; //회원이름
    private int age; //회원나이
    private char gender; //회원 성별
    private double weight; //몸무게
    private boolean isActivated; // 활동 상태

//    geter seter : art + (ins) + insert


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    html, css, js, java, mysql(db), jdbc, mybatis(jdbc)(국내에서만 자주 사용함. 샌드박스... 스프링 프레임워크에 포함되어있음),
    spring frame work, thymelfe(java), 세미 프로젝트 [12월 말~1월 초]
    spring boot, jpa, js-core, reactNative(app), ai 서버 구성, 어플리케이션 배포, 클라우드 서버 구성(경우에 따라 이벤트성으로, 비용부담 있음)

    */

}
