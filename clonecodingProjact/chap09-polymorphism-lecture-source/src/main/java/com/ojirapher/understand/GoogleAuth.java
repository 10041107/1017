package main.java.com.ojirapher.understand;

import main.java.com.ojirapher.dto.MemberDTO;

public class GoogleAuth implements SnsAuth {

    @Override
    public boolean login(MemberDTO memberDTO){
        MemberDTO googleMember = new MemberDTO("id","pass");

        if(googleMember.getId().equals(memberDTO.getId())){
            System.out.println("아이디가 같지 않습니다");
            return false;
        }else {
            if(!googleMember.getPass().equals(memberDTO.getPass())){
                System.out.println("구글 회원 정보의 비밀번호가 같지 않습니다");
                return false;
            }
        }

        return true;
    }

}
