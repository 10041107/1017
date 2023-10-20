package Quiz;
import java.util.Scanner;

public class ALLclass {
    public static void main(String[] args) {

        /*
        1. 자료형
        기본자료형(Primitive type)와 참조 자료형(Reference type)로 나뉜다.

        1-1.primitive type
        int: 정수를 나타내는 자료형.
        double: 소수점을 가지는 실수를 나타내는 자료형.
        char: *단일* 문자를 나타내는 자료형. (문자열 하나만 '작은 따옴표'로 표현됨)
        boolean: true 또는 false 값을 나타내는 자료형.
        byte, short, long, float 등: 상수 자료형(비트별로 다름)
         */
        System.out.println("byte의 최대값 : " + Byte.MAX_VALUE + " / byte의 최소값 : " + Byte.MIN_VALUE);
        System.out.println("short의 최대값 : " + Short.MAX_VALUE + " / short의 최소값 : " + Short.MIN_VALUE);
        System.out.println("int의 최대값 : " + Integer.MAX_VALUE + " / int의 최소값 : " + Integer.MIN_VALUE);
        System.out.println("long의 최대값 : " + Long.MAX_VALUE + " / long의 최소값 : " + Long.MIN_VALUE);
        System.out.println("float의 최대값 : " + Float.MAX_VALUE + " / float의 최소값 : " + Float.MIN_VALUE);
        System.out.println("double의 최대값 : " + Double.MAX_VALUE + " / double의 최소값 : " + Double.MIN_VALUE);
        System.out.println("char의 최대값 : " + (int) Character.MAX_VALUE + " / char의 최소값 : " + (int) Character.MIN_VALUE);
        System.out.println("boolean의 가능한 값 : true 또는 false");

        /*
        1-2.Reference type
        기본 자료형을 제외한 모든 자료형. 자바의 인스턴스를 가리킬 수 있는 자료형.
        클래스, 배열, 열거, 인터페이스...
        -1. 사용자가 정의한 클래스 (예: Person, Car, Book 등).
        -2. 배열 (예: int[], String[] 등).
        -3. 인터페이스 (예: List, Map 등).

        +배열(=자료형 선언)
        1. 배열 변수명 선언
        int (변수명) [];
        2. 배열 생성
        (변수명) = new int[5];
        3.초기화(생성된 배열에 값을 넣음)
         */

               /*
        2. 조건문

        2-1.if 문
        주어진 조건이 true면 특정 코드 블록이 실행된다.
        if(조건) {조건이 참일때 실행할 코드}

        2-2. if-else문
        if(조건){조건이 참일때 실행할 코드} else {조건이 거짓일 때 실행할 코드}

        2-3. else if문
        if (조건) {조건이 참일때 실행할 코드} else if (조건2) {조건2가 참일때 실행할 코드} else {조건이 거짓일 때 실행할 코드}

        2-4. switch문
        여러 가능한 경우(case)를 비교하고 일치하는 경우 코드를 실행한다.
        주로 정수, 문자 또는 열거형(enum)값에 대한 조건 검사에 사용됨.
        switch (표현식) {
          case 값1 :
              값1에 해당하는 코드
              break;
          case 값2 :
              값2에 해당하는 코드...
              break;
          default;
              어떤 case에도 해당하지 않을 때 실행할 코드
          }
         */
        System.out.println("A / B / C / D~ 등급을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String score = sc.next();
        switch (score) {
            case "A":
                System.out.println("A등급입니다.");
                break;
            case "B":
                System.out.println("B등급입니다.");
                break;
            case "C":
                System.out.println("C등급입니다.");
                break;
            default:
                System.out.println("D등급 이하 입니다.");
                break;
        }
        /*
        2-4. 삼항연산자
        변수명 = (논리 조건) ? true일때 실행되는 기능 " false일때 실행되는 기능
         - 변수 지정 안해주면 오류 발생한다
         */
        System.out.println("숫자를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        String result = ( score < 10 ) ? "10보다 작습니다." : "10보다 큽니다.";
        System.out.println(result);

        /*
        3. 반복문

        3-1. for 반복문
        */
        for(int i = 0 ; i < 100 ; i++){
        //이와 같은 형태로 사용한다.
        }

        /*
        3-2. for each 반복문
        배열, 리스트 등에서 하나하나의 원소들을 iterate하며 사용하는 방식
         */





















        //https://velog.io/@rlafbf222/JAVA-%EA%B8%B0%EC%B4%88-%EB%AC%B8%EB%B2%95-%EA%B0%9C%EB%85%90-%EC%A0%95%EB%A6%AC



















    }
}
