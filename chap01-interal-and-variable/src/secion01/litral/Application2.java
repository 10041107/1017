package secion01.litral;

public class Application2 {

    public static void main(String[] args) {
        System.out.println("================숫자의 연산===============");
        // 수업 목표: 리터럴 형식의 값을 직접 연산하기
    
        //목차 1. 숫자의 연산
        
        //정수와 정수 리터럴 연산
        System.out.println(123 + 456);
        System.out.println(123 - 456);
        System.out.println(123 * 456);
        System.out.println(40 / 80);
        System.out.println(10 % 2); // 나누고 난 몫

        //실수와 실수 리터럴 연산
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 1.23);
        System.out.println(1.23 * 1.23);
        System.out.println(1.23 / 1.23);
        System.out.println(1.23 % 1.23);

        //정수와 실수 리터럴 연산
        System.out.println(1 + 0.5);
        System.out.println(1 - 0.5);
        System.out.println(1 * 0.5);
        System.out.println(1 / 0.5);
        System.out.println(1 % 0.5);

        System.out.println("================문자의 연산===============");
        //목자 2. 문자의 연산
        //문자에 정수를 연산하는 것도 가능.
        // 문자열이지만 연산할 땐 숫자로 변환됨. 10진법(=아스키 코드)으로 변환.
        
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 1);
        System.out.println('a' / 1);
        System.out.println('a' % 1);

        System.out.println("================문자열과 다른 형태의 값 연산===============");
        //목자 3. 문자열과 다른 형태의 값 연산
        //문자열과의 연산은 '+'연산만 가능하다.
        //불리언+ 문자열(+) 를 제외하면 연산이 안됨
        System.out.println("hello" + 1004);
        System.out.println("hello" + 123.456);
        System.out.println("hello" + 'a');
        System.out.println("hello" + true);

        System.out.println("123" + "456");

        //논리값(=불리언) 연산
        //System.out.printin(true + false); (X)
        //System.out.printin(true + 1 ); (X)
        System.out.println(true + "false"); //(O)
        System.out.println("안녕" + "f" + "a" + "l" + "s" + "e");

    }
}