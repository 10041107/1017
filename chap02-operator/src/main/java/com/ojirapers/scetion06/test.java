package com.ojirapers.scetion06;

public class test {
    public static void main(String[] args) {

        /*
        300만원을 지닌 김과장이 62만원인 지갑을 구매하려 한다. 실행되지 않는 코드의 오류를 수정해라.


        String name = "김과장";
        int balance = 3000000;
        int walletPrice = 620000;

        String result = (balance >= walletPrice) ? (name + " 님의 결제가 진행되었습니다. " + name + " 님의 남은 잔고 : " + (balance - walletPrice)) : "잔액 부족으로 결제가 진행되지 않았습니다.";
        System.out.println(result);
         */
       /*
        해석
        1. '김과장' => "김과장"
        2. balance, walletPrice 앞에 int
        3. String, int 뒤에 ; 추가
        4. int result를 String result로 변경

        300만원을 갖고 있는 김과장이 62만원인 지갑을 구매하려 한다. 실행되지 않는 코드의 오류를 수정해라.
        String name = '김과장'
        balance = 3000000
        walletPrice = 620000
        int result = (balance >= walletPrice) ? (name + " 님의 결제가 진행되었습니다. " + name + " 님의 남은 잔고 : " + (balance - walletPrice)) : "잔액 부족으로 결제가 진행되지 않았습니다.";
        System.out.println(result);

         */

        // ==============================================================================================
        // A 마트의 이번 주 주류 판매 실적은 소주 :  45만원 , 맥주 : 30만원 , 와인 : 36만원 , 고량주 : 27만원 이다.
        // 마트의 주당 평균 총 매출이 140 만원일때
        // 1. 그 주의 '주류 별 평균 실적'과 그 주의 '총 매출'을 정리하고(세금 10%),
        // 2. '총 매출이 주당 평균 매출보다 높은지' 나타내려고 한다.
        // 다음과 같은 양식을 가진다.
        // A마트 이번 주 주류 당 평균 실적은 ()만원이고, 세금을 제외한 총 매출은 ()만원이며 세금은 ()만원을 냈다.
        // 이번 주 총 매출은 평균 총 매출보다 높다/낮다. (삼항연산자 사용)

        int Sales0 = 450000;
        int Sales1 = 300000;
        int Sales2 = 360000;
        int Sales3 = 270000;
        int averageSales = 1400000;
        int tax = (Sales0 + Sales1 + Sales2 + Sales3)/10;
        int totalSales = ((Sales0 + Sales1 + Sales2 + Sales3) - tax);
        int averagePer = ((Sales0 + Sales1 + Sales2 + Sales3)/4);
        String updounresult = (totalSales > averageSales) ? "높다" : "낮다";

        String result = ("A마트 이번 주 주류 당 평균 실적은 " + averagePer + "원이고, 세금을 제외한 총 매출은 " + totalSales + "원이며 세금은 " + tax + "원을 냈다.");
        String result2 = ("이번 주 총 매출은 평균 총 매출보다 " + updounresult);

        System.out.println(result);
        System.out.println(result2);



        // ==============================================================================================
        // 승객 두명의 놀이기구 탑승 가능여부를 출력하는 코드를 만드시오.
        // 놀이기구 탑승 기준은 키가 120cm 이상이다.
        // 승객 두명의 키는 각각 113cm 와 127cm 이다.

        // 화면에 보여지는 양식은 다음과 같다.
        // 키카 113cm 이므로 탑승 불가능합니다.
        // 키가 127cm 이므로 탑승 가능합니다.

        // 조건
        // 삼항 연산자를 사용하시오


        // ==============================================================================================
        //삼항연산자를 이용해 1이 4보다 작으면 바보 . 4보다 크면 천재를 출력

        // ==============================================================================================
//        1.
//        한 축구 구단의 직원 수는 약 1892명 이다.
//        올해에 리그에서 순위가 18위 이하로 나온다면 강등 되어서 직원수는 15% 감소하고, 18위 이하를 기록하지 않는다면 구단의 직원수는 15% 증가한다.
//        구단의 직원들에게 설명하기 위해 삼항연산자를 활용해 작성해보자.
//        구단은 기적적으로 17위를 기록하였는데, 이후의 구단 직원수도 구해보자.

        float people = 1892f;
        int rank = 17;

        String afterPeople = (rank > 17) ? "직원이 15% 감소합니다." : "직원이 15% 증가합니다.";
        float afterPeopleNum = (rank > 17) ? (people - (people * 0.15f)) : (people + (people * 0.15f));

        System.out.println("리그 순위가 18위 이하로 나온다면 직원 수가 15% 감소하고 이상이라면 15% 증가하는데, 이번 리그에서 기적적으로  " + rank + " 위를 달성하여 " + afterPeople + " 총 " + (int)afterPeopleNum + " 명이 됩니다.");


        // ==============================================================================================
//        2.
//        영어시험을 본 결과 1번 학생은 90점 2번 학생은 95점 3번 학생은 81점을 맞았다
//        평균을 구한 후 논리 연산자를 이용해 90점 이상~100점 이하라면 true를 출력, 아니라면 false를 출력하라.

        int student1 = 80;
        int student2 = 95;
        int student3 = 81;
        boolean average = ((student1 + student2 + student3) / 3) >= 90;
        System.out.println(average);


        // ==============================================================================================
//        4.
//        시험과목 3개의 점수가 50,40,60이다 평균 40을 넘기면 합격 못넘기면 불합격 출력

          int subject1 = 50;
          int subject2 = 40;
          int subject3 = 60;
          boolean average2 = ((subject1 + subject2 + subject3) / 3) >= 40;
          String result3 = (average2 == true) ? "합격" : "불합격" ;
          System.out.println(result3);

    }


}

