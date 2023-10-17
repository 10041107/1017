package section02_variable;

import java.awt.*;

public class Application1 {
    public static void main(String[]args) {
        //수업 목표_ 변수의 사용 목적에 대해 이야기할 수 있다.
        /*
        변수의 사용 목적
        1. 값에 의미를 부여하기 위한 목적 (의미 전달이 쉬워야 코드를 읽기 쉬워지고, 협업 및 유지보수에 유리해짐)
        2. 한 번 저장해둔 값을 재사용하기 위한 목적(변수를 사용하여 코드를 작성하면 값을 변경할때도 보다 간편하게 변경할 수 있음)
        3. 시간에 따라 변하는 값을 지정하고 사용할수 있다.(변하는 값을 저장하기 위한 공간.)
         */

        //변수: 값을 재사용 하기 위한 목적으로 사용함.
        System.out.println("==========값에 의미 부여 테스트=========");
        System.out.println("첫달 김과장님 보너스를 포함한 급여 : " + (1000000000+200000) + "원");
        System.out.println("둘재달 김과장님 보너스 미포함 급여 : " +  1000000000 + "원");
        
        int salary = 100000000; 
        int bonus = 20000;
        
        System.out.println("첫달 김과장님 보너스를 포함한 급여 : " + (salary + bonus) + "원");
        System.out.println("둘째달 김과장님 보너스를 미포함 급여 : " + (salary) + "원");

        //시간에 따라 변경되는 값을 저장하고 사용할 수 있다.
        String name = "김쿠팡";
        int point = 100;
        System.out.println(name + "은 쇼핑몰 중독이다. \n 지난달" + name + "의 쿠팡 보너스 포인트는" + point + " 포인트 였다.");

        point = point + 100;
        point += 100;
        System.out.println("이번달" + name+ "의 쿠팡 보너스 포인트는" + point + "이다.");







    }
}
