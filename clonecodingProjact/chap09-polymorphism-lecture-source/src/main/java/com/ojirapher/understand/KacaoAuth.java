package main.java.com.ojirapher.understand;

import main.java.com.ojirapher.dto.MemberDTO;

public class KacaoAuth implements SnsAuth {

    @Override
            public boolean login(MemberDTO memberDTO){
    MemberDTO kakaoMember = new MemberDTO("id","pass");

        if(kakaoMember.getId().equals(memberDTO.getId())){
        System.out.println("아이디가 같지 않습니다");
        return false;
    }else {
        if(!kakaoMember.getPass().equals(memberDTO.getPass())){
            System.out.println("카카오 회원 정보의 비밀번호가 같지 않습니다");
            return false;
        }
    }

        return true;
}


}
