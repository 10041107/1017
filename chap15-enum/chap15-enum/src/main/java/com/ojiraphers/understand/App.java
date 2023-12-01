package main.java.com.ojiraphers.understand;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //회원 제한은 없으며 체력을 관리해야 한다.
        //10명의 회원 유형도 자율이다

        List<MemberDTO> members = new ArrayList<>();
        members.add(new MemberDTO("김일장", 10));
        members.add(new MemberDTO("김이장", 10));
        members.add(new MemberDTO("김삼장", 10));
        members.add(new MemberDTO("김일장", 10));
        members.add(new MemberDTO("김일장", 10));
        members.add(new MemberDTO("김일장", 10));
        members.add(new MemberDTO("김일장", 10));
        members.add(new MemberDTO("김일장", 10));
        members.add(new MemberDTO("김일장", 10));
        members.add(new MemberDTO("김일장", 10));


        System.out.println("기유의 체력을 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        kiyuDTO kiyu = new kiyuDTO();
        int getsHp = sc.nextInt();
        kiyu.setHp(kiyu.getHp() + getsHp);
        sc.nextLine(); // 줄바꿈 문자 제거해서 다음에도 입력받을 수 있게 함


        System.out.println("10명의 사람의 운동 유형을 선택해주세요. [ 벌크업 / 감량 / 다이어트 / 요가 / 유령 ] : ");
        String[] value = sc.nextLine().split(" ");

        if (value.length < 10) {
            System.out.println("운동유형 10개를 모두 입력해주세요.");
            return;
        } else {
            for (int i = 0; i < members.size(); i++) {
                String result = value[i];
                HType type = HType.valueOf(result.toUpperCase());
                members.get(i).setType(type);
//            members.get(i).getType();
                //i = 방금 입력받은 10개를 공백 split하고 배열에 추가한 각각 개체
                //enum : membersDTO로 전달된 getType값을 변동
            }

            for (MemberDTO member : members) {
                //members 리스트의 각 MemberDTO요소에 대해 반복함.
                switch (member.getType()) {
                    case 벌크업:
                        kiyu.setHp(kiyu.getHp() - 40);
                        kiyu.setMoney(kiyu.getMoney() + 100);
                        break;
                    case 감량:
                        kiyu.setHp(kiyu.getHp() - 20);
                        kiyu.setMoney(kiyu.getMoney() + 70);
                        break;
                    case 다이어트:
                        kiyu.setHp(kiyu.getHp() - 10);
                        kiyu.setMoney(kiyu.getMoney() + 50);
                        break;
                    case 요가:
                        kiyu.setHp(kiyu.getHp() + 20);
                        kiyu.setMoney(kiyu.getMoney() + 30);
                        break;
                    case 유령:
                        kiyu.setMoney(kiyu.getMoney() + 30);
                        break;
                    default:
                        break;
                }

                // 운동 결과 바로 출력
                System.out.println(member.getName() + " 회원이 " + member.getType() + " 를(을)합니다. 기유의 체력: " + kiyu.getHp() + ", 기유의 돈: " + kiyu.getMoney());
            }
        }
    }
}


    김일장 회원이 요가 를(을)합니다. 기유의 체력: 100, 기유의 돈: 30
        김이장 회원이 요가 를(을)합니다. 기유의 체력: 100, 기유의 돈: 60
        김삼장 회원이 요가 를(을)합니다. 기유의 체력: 100, 기유의 돈: 90
        김일장 회원이 요가 를(을)합니다. 기유의 체력: 100, 기유의 돈: 120
        김일장 회원이 요가 를(을)합니다. 기유의 체력: 100, 기유의 돈: 150
        김일장 회원이 요가 를(을)합니다. 기유의 체력: 100, 기유의 돈: 180
        김일장 회원이 요가 를(을)합니다. 기유의 체력: 100, 기유의 돈: 210
        김일장 회원이 요가 를(을)합니다. 기유의 체력: 100, 기유의 돈: 240
        김일장 회원이 요가 를(을)합니다. 기유의 체력: 100, 기유의 돈: 270
        김일장 회원이 요가 를(을)합니다. 기유의 체력: 100, 기유의 돈: 300




        /*
        1. 기유의 총 체력을 입력
        1. 각 멤버의 운동 유형을 입력함
        2. members enum에 각각 분할해 추가
        3. 출력 (name회원의 몸무게 변화: weight >> weight-(enum.weignt). 기유의 체력: enum.hp
            벌크업(100,-40),
            감량(70,-20),
            다이어트(50,-10),
            요가(30,20),
            유령(30,0);
         */

//3. 출력 (name회원의 몸무게 변화: weight >> weight-(enum.weignt). 기유의 체력: enum.hp
//마지막 결과: 수익