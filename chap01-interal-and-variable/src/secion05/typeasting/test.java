package secion05.typeasting;

public class test {

    public static void main(String[] args) {
        /*
        5명의 반 학생이 있으며 학생들의 키는 각각
        178.5
        170.3
        190.7
        188.678
        160.8
        우리는 학생의 평균 키를 구해서 화면에 보여주고자 한다. (소수 자리 절삭)
        화면에 보여지는 양식은 다음과 같다.
        1반 학생 5명의 키의 평균은 000cm다.
         */

        double cm1= 178.5;
        double cm2= 170.3;
        double cm3= 190.7;
        double cm4= 188.678;
        double cm5= 160.8;

        System.out.println("1반 학생 5명의 키의 평균은 " + (int)((cm1 + cm2 + cm3 + cm4 + cm5)/5) + "cm 이다.");

        /*
        문자 z에 대응하는 숫자(아스키코드)를 화면에 출력해주세요.

        */
        long lnum = 10L;
        int num = 190;
        //z의 아스키코드: 122

        System.out.println("z의 아스키코드 : " + (int)((num - (lnum * 7)) + ((lnum / 10) *2)));



        /*
        아래의 연산의 차이를 옆사람에게 설명해주세요.
        int sum = (int)num+ num;
        int sum2 = (int)(num + lnum);
         */
        //위는 첫번째 num에만 int(정수형으로 치환)이 적용되었고, 아래는 (num+lnum)을 계산한 값이 int로 치환되었다.

        /*
        사업을 시작한 홍길동은 10월18일 매출에서 부가세(10%)를 제외한 소득을 알고 싶다.
        10-18의 매출은 다음과 같다.
        150400원
        1400원
        25000원
        30000원
        여기서 부가세 10%는 변하지 않는 값이라는 점에 유의하자
         */

        int salary1 = 150400;
        int salary2 = 1400;
        int salary3 = 25000;
        int salary4 = 30000;
        int tax = 10;

        System.out.println("부가세 제외 소득 : " + (int)((salary1 + salary2 + salary3 + salary4) - ((salary1 + salary2 + salary3 + salary4)/10)));


    }
}
