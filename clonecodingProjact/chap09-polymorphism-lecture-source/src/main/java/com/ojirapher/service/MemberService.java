package main.java.com.ojirapher.service;

public class MemberService {

package main.java.com.ohgiraffer.section04.login.service;

import main.java.com.ohgiraffer.section04.login.auth.SnsAuth;
import main.java.com.ohgiraffer.section04.login.dto.MemberDTO;

    public class MemberService {
        private SnsAuth snsAuth;

    public boolean findMember(String authType, MemberDTO memberDTO){
        switch (authType){
            case "google" : snsAuth = 000; break;
            case "naver" : snsAuth = 000; break;
            case "kakao" : snsAuth = 000; break;
            default:
                System.out.println("인증되지 않은 로그인 방식입니다."); return false;
        }

        boolean result = snsAuth.login(memberDTO);

        return result;
    }
    }
    }





}
