package main.java.com.ojiraphers.section04.constructor;

import java.util.Date;

public class User {
    private String color;
    private int count;
    private int all;
    private  String id;
    private String pwd;
    private String name;

    private Date enrollDate;

    /*
    생성자의 작성 위치
    작성 위치는 문법상으로 클래스 내부에 작성하게 되며
    통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례적이다

    생성자 사용 목적
    1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 사용한다
    2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화하며 인스턴스를 생성할 목적으로 주로 사용된다
    3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다는 의미.
    따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수 있다.

    생성자의 작성방법
    접근제한자 클래스명(매개변수){
        인스턴스 생성 시점에 수행할 명령 기술(주로 필드 초기화)
        this.필드명 = 매개변수;

    생성자 작성시 주의할 점
    1. 생성자 메소드는 반드시 클래스 이름과 동일해야 한다.
    2. 생성자 메소드는 반환명을 작성하지 않는다.

    생성자의 종류
    1. 기본 생성자(매개변수 없는 생성자)
    2. 매개변수가 있는 생성자
    기본생성자는 자바 compiler가 자동으로 추가해주는 구문이지만 명시적으로 작성할 수 있다.
    매개변수가 있는 생성자가 한개라도 존재하는 경우 기본 생성자를 자동으로 추가해주지 않기 때문에
    기본생성자가 필요한 경우에는 반드시 명시적으로 작성해주어야 한다.
     */

    //기본 생성자
    public User() {
    }

    //모든 필드를 초기화하는 생성자
    // this~ 구분으로 모든 필드를 초기화함
    public User(String color, int count, int all) {
        this.color = color;
        this.count = count;
        this.all = all;
    }

    //2개의 필드를 초기화하는 생성자
    // color, count라는 2개의 필드를 지님
    public User(String color, int count) {
        this.color = color;
        this.count = count;
    }

    //1개의 필드를 초기화하는 생성자
    //count라는 1개의 필드를 지님
    public User(int count) {
        this.count = count;
    }

    //4개의 메서드가 각각 같은 이름으로 사용될 수 있도록 하는 기술을 000라고 합니다... 000는?
        // 오버로딩






}
