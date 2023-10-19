package main.java.com.ojiraphers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /*
        java.util.Scanner
        콘솔 화면에 값을 입력받는 기능. api의 일종

        1-1.scanner는 객체를 만들어서 사용한다.
        =         java.util.Scanner;
         */

        Scanner sc = new Scanner(System.in);
        //in = InputStream
        System.out.println("이름을 입력해주세요 : ");
        String name = sc.nextLine();
        //어떤 값을 받아도 모두 문자열로 반환해준다.
        System.out.println(" 안녕하세요 " + name + " 님!! ") ;

        System.out.println("나이를 입력해주세요 : ");

        int age = sc.nextInt();
        //어떤 값을 받아도 모두 int로 반환해준다.
        System.out.println("입력하신 나이는 " + age + " 가 맞나요? ");


        String names = sc.nextLine();
        //nextLine이 사용된 변수가 사용되지 않으면 판정이 생략됨
        System.out.println(" 안녕하세요");

        long lnum = sc.nextLong();
        System.out.println("입력한 long : " + lnum);

        boolean isTrue = sc.nextBoolean();
        if(isTrue) {
            System.out.println("참이다");
        }else {
            System.out.println("거짓이다");
        }  //boolean은 정확하게 true,false라고만 입력할 수 있다

        char charValue = sc.nextLine().charAt(0); // 몇번째 인덱스에 있는 것을 가져올거냐 선택함
        System.out.println((charValue));






    }


}
