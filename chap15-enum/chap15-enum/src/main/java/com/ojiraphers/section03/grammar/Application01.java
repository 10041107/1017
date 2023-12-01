package main.java.com.ojiraphers.section03.grammar;

import java.util.EnumSet;
import java.util.Iterator;

public class Application01 {
    public static void main(String[] args) {
        UserRole1 admin = UserRole1.ADMIN;
        System.out.println(admin);
        System.out.println(admin.getNameToLowerCase());
        System.out.println("============");


        UserRole2 consumer = UserRole2.CONSUMER;
        UserRole2 consumer2 = UserRole2.CONSUMER;
        System.out.println(consumer == consumer2);
        // 인스턴스의 타입을 비교하기 때문에 값 비교가 가능함
        //인스턴스의 타입을 비교하기 위해서 기본적으로 제공되는 사용자 정의 자료형.
        //enum = 주소값이 아닌 '값', main, 상수필드를 기준으로 비교하기 때문
        System.out.println("============");


        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);
        Iterator<UserRole2> iter = roles.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next().name());
        }

        System.out.println("============");
        EnumSet<UserRole2> notGuest = EnumSet.complementOf(EnumSet.of(UserRole2.GUEST));
        Iterator<UserRole2> notGuestIter = notGuest.iterator();
        while (notGuestIter.hasNext()){
            UserRole2 role2 = notGuestIter.next();
            System.out.println(role2.ordinal() + " " + role2.getDsscription());
        }








    }



}
