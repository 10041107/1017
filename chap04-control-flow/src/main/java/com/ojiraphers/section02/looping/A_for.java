package main.java.com.ojiraphers.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("-");
        }
    }

    public void testForExample() {
        //반의 학생이 10명인 학생의 이름을 입력받기
        Scanner sc = new Scanner(System.in);

//        System.out.println("1번째 학생의 이름을 입력해주세요:");
//        String name1 = sc.nextLine();
//        System.out.println("2번째 학생의 이름을 입력해주세요:");
//        String name2 = sc.nextLine();
//        System.out.println("3번째 학생의 이름을 입력해주세요:");
//        String name3 = sc.nextLine();
//        System.out.println("4번째 학생의 이름을 입력해주세요:");
//        String name4 = sc.nextLine();
//        System.out.println("5번째 학생의 이름을 입력해주세요:");
//        String name5 = sc.nextLine();
//        System.out.println("6번째 학생의 이름을 입력해주세요:");
//        String name6 = sc.nextLine();
//        System.out.println("7번째 학생의 이름을 입력해주세요:");
//        String name7 = sc.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.printf((i + 1) + "번째 학생의 이름을 입력해주세요");
            String student = sc.nextLine();
            System.out.printf((i + 1) + "번째 학생의 이름은 " + student + "입니다.");
        }

    }


    public void testForExample2() {
        /*
        for(초기치, 조건식, 증감식){
         조건식이 참일 동안만 반복;
        }
        1. 초기치: 반복문에 사용할 변수를 초기화하는 부분. 처음에 한 번만 수행됨.
         for(int i=1;i<=10;i++){  } //int타입 변수 i의 값을 1로 선언 및 초기화한다.
         for(int i=1, j=1;i<=10;i++){  } //int타입 변수 i와 j를 선언 및 초기화한다.
        2. 조건식: 조건식의 값이 참일 동안 반복을 계속하고, 거짓이면 반복을 중단함
         (=for문을 벗어난다)
         for(int i=1;i<=10;i++){  } //i<=10일 동안 괄호안의 문장을 반복 수행한다.
        3. 증감식: 반복문을 제어하는 변수의 값을 증가 또는 감소시킴.
        문장이 1번 실행될대마다 변수의 값이 증감됨.
        감되어 나중에 조건식이 거짓이 되어 for문을 벗어난다.
         for(int i=1;i<=10;i++){  }  // i가 1씩 증가된다.
         for(int i=10;i>=1;i--){  }  // i가 1씩 감소된다.
         for(int i=1;i<=10;i+=2){  }  // i가 2씩 증가된다. (i+=2 > i=i+2)

        :: for( ; ; ) { } : 무한반복문
        :: for 전에 int등으로 변수를 미리 선언해둘 필요 없음

        */

        //1~10까지 수의 합을 구한다.

        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
            //i가 최소치 1, 최대 11이 될때까지 i++한다.
            //이 횟수만큼 sum에 += i(1~10까지 수)를 더한다.

        }
        System.out.println(sum);

    }

    public void testForExample3() {
        for (int a = 0; a <= 10; a++) {
            if (a == 0) {
                System.out.println("0입니다");
            } else if (a % 2 == 0) {
                System.out.println("짝수입니다.");
            } else {
                System.out.println("홀수입니다.");
            }
        }
    }

        public void testForExample4() {
            /*
            숫자 두 개를 입력받아 작은 수에서 큰 수까지의 합계를 구하세요
            단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결합니다.


           프로그램
           목표: 두 수를 입력받아서 작은 수부터 큰 수까지의 합계를 구한다.
           주의 :두 수의 값은 같을 수 없다.

           1.두 수를 입력받아야 한다.
           1-1. 입력 받은 수가 같은지 비교한다.
           1-2. false. 두 수가 같지 않다면 다음으로 넘긴다
                true. 두 수가 같다면 둘 다 다시 입력받는다.
           2. 작은 수와 큰 수를 구한다.
           3. 작은 수부터 큰 수까지의 합계를 구한다.
             */

            System.out.println("=== 두 수를 입력받아 작은 수부터 큰 수까지의 합계를 구하는 프로그램입니다.");

//            1.두 수를 입력받아야 한다.
            Scanner sc2 = new Scanner(System.in);
            System.out.println("첫 번째 수를 입력해 주세요 : ");
            int num1 = sc2.nextInt();
            System.out.println("두 번째 수를 입력해 주세요 : ");
            int num2 = sc2.nextInt();

//            1-1. 입력 받은 수가 같은지 비교한다.
            for (;;){
                if(num1 == num2){
//            true. 두 수가 같다면 둘 다 다시 입력받는다.
                    System.out.printf("두 수의 수가 같습니다. 다시 입력해주세요.");
                    return;
//            1-2. false. 두 수가 같지 않다면 다음으로 넘긴다
                }else {
//             1-3. 작은 수부터 큰 수까지의 합계를 구한다.
                    int min = (num1 < num2) ? num1 : num2;
                    int max = (num1 > num2) ? num1 : num2;
                    int sum = 0;
//            3. 작은 수부터 큰 수까지의 합계를 구한다.
                    for (int i = min; i<= max; i++) {
                        sum += i;
                    }

                    System.out.println("입력한 수에서 작은 값은 " + min + " 큰 값은 " + max + " 이고, 합계는 " + sum + " 입니다. " );
                    break;

                }
            }
        }

        /**
        구구단을 위한 함수 입니다.
         n~9단까지의 구구단
         @param first : 해당 단을 출력함
         @return void
         =함수형 주석
         */
        public void gugudan(int first){

            /*
            1. 2~9까지의 숫자를 입력받는다
            2. 해당 숫자의 9단까지의 내용을 출력한다.

             */

            //1. 2~9까지의 숫자를 입력받는다 (Application에서 실행)

            //2. 해당 숫자의 9단까지의 내용을 출력한다.
            for (int i = 0; i < 10 ; i++){
                System.out.println( 1 + " * " + i + " = "+  (first*1) );
            }






        }

    }




