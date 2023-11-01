package main.java.com.ojirapher.understand;

import main.java.com.ojirapher.dto.MemberDTO;

public class NaverAuth implements SnsAuth{


    @Override
    public boolean login(MemberDTO memberDTO){
        MemberDTO naverMember = new MemberDTO("id","pass");

        if(naverMember.getId().equals(memberDTO.getId())){
            System.out.println("아이디가 같지 않습니다");
            return false;
        }else {
            if(!naverMember.getPass().equals(memberDTO.getPass())){
                System.out.println("네이버 회원 정보의 비밀번호가 같지 않습니다");
                return false;
            }
        }

        return true;
    }



}
