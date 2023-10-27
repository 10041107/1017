package main.java.com.ohgiraffers.section02.uses;

public class MemberFinder {
    public Member[] findAllMembers(){
        return MemberRepository.findAllMembers(); // (n == 2) 3번쨰 실행 : findAllmembers(); 함수 실행
    }

}
