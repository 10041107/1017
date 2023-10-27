package main.java.com.ohgiraffers.section02.uses;

public class MemberRepository {

    private final static Member[] members;
    private static int count;

    static {
        members = new Member[10];
    }

    public static boolean store(Member[] newMembers) { // (no == 9번째 : 전달 받은 메게 Member[]를 newMembers에 대입한다.
        //(no==1) 10번쨰: member의 길이만큼 반복문을 실행한다.
        for (int i = 0; i < newMembers.length; i++) {
            //members에 [count++]가 들어가는 이유
            //현재 members의 static변수이다. 이 이야기는 모든 MemberRapository의 인스턴스가 하나의 배열을 공유하게 된다.
            // 여기서 members의 길이는 10을 고정이 되어 있기 때문에 members[1]를 대입하게 되면 매번 호출시 1은 0으로 시작하게 된다.
            //이러한 오류를 해결하기 위해 MemberRepository의 인스턴스가 배열의 인덱스 members[indew]를 공유하기 위해서
            //count라는 static변수를 참조하여 배열의 인덱스에 접근하게 하여 전달받은 newMembers[i]를 대입하는 것이다.
            members[count++] = newMembers[i];
        }
        //위의 대입하는 과정종료 후 true를 반환한다.
        return true;
    }
        public static Member[] findAllMembers(){

        //select * from member; = '선택한다 *(와일드카드=전체선택) 멤버 목록을' 가 생략됨

        return members; // (n == 2) 4번쨰 실행 : members 목록을 전체 리턴한다.
    }
}
