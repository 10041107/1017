package main.java.com.ojirapher.understand;

import main.java.com.ojirapher.dto.MemberDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        MemberService memberService;

        do{
            MemberDTO memberDTO = new MemberDTO();
            System.out.println("====사용자 인증 프로그램입니다.=====");
            System.out.println("1. google 로그인");
            System.out.println("2. Naver 로그인");
            System.out.println("3. Kakao 로그인");
            System.out.println("9. 프로그램 종료");
            System.out.print("로그인 할 인증 수단을 선택하세요 : ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            System.out.println("아이디를 입력해주세요 :");
            memberDTO.setId(sc.nextInt());
            System.out.println("비밀번호를 입력해주세요 :");
            memberDTO.setPass(sc.nextInt());
            boolean result;
            String type;

            switch (choice){
                case 1 : memberService = new MemberService(new GoogleAuth());
                result = memberService.findMember(memberDTO);
                if(result){
                    System.out.println("google로그인에 성공하였습니다." + memberDTO.getId());
                } break;
                case 2 : memberService = new MemberService(new KacaoAuth()); break;
                result = memberService.findMember(memberDTO);
                if(result){
                    System.out.println("Kacao로그인에 성공하였습니다." + memberDTO.getId());
                } break;
//                case 3 : memberService = new MemberService(new NaverAuth()); break;
//                result = memberService.findMember(memberDTO);
//                if(result){
//                    System.out.println("Naver로그인에 성공하였습니다." + memberDTO.getId());
//                } break;

                case 9 :
                    System.out.println("프로그램을 종료합니다");
                    break;
            }

        }while (true);

    }




}
