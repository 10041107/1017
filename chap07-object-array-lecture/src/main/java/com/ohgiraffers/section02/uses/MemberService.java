package main.java.com.ohgiraffers.section02.uses;

import java.awt.*;

public class MemberService {
    public void singUpMembers(){ // (no==1)일시 2번째로 실행됨
        Member[] members = new Member[5];
        //Member[]배열의 size를 5로 만들어줌
        members[0] = new Member(1,"user01","pass","홍길동", 20, '남');
        members[1] = new Member(2,"user02","pass","유관순", 16, '여');
        members[2] = new Member(3,"user03","pass","이순신", 40, '남');
        members[3] = new Member(4,"user04","pass","신사임당", 36, '여');
        members[4] = new Member(5,"user05","pass","윤봉길", 22, '남');
        // (no==1)일시 3번째로 실행됨 :memberRegister실행
        MemberRegister memberRegister = new MemberRegister();
        // (no--1)일시 4번째로 실행됨 : memberRegist.regist() 메서드에 Member[]을 매개변수로 전달하여 호출함
        memberRegister.regist(members);

    }

    public void showAllmembers(){
        MemberFinder finder = new MemberFinder();
        // (n == 2) 2번째 실행 : new MemberFinder를 finder이름으로 생성
        // 생성 = 초기화

        System.out.println("==가입된 회원 목록==="); // (n == 2) 5번쨰 실행 : (MemberFinder에서 members목록 전체를 리턴받음)

        for(Member member : finder.findAllMembers()) { // (n == 2) 6번쨰 실행 : 리턴받은 members목록 (=배열)을 for each에 대입
            if(member != null){ // (n == 2) 7번쨰 실행 : 만약 멤버 목록이 비어있지 않다면 (!=부정문)
                System.out.println(member.getInfo());// (n == 2) 8번쨰 실행 : 멤버 목록을 출력한다.
                //getInfo()는 멤버 개체에서 호출되는 메서드입니다.
                // 데이터를 표준 출력으로 반환해야 합니다.
                // = 메서드가 반환하는 데이터를 화면에 출력하도록 하는 것을 의미합니다. (=메서드의 자료형을 따른다)
            }
        }
        System.out.println("====회원 조회 완료===="); //(n == 2) 9번쨰 실행 : 회원 조회 완료
    }

}
