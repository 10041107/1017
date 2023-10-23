package main.java.com.ojirapher.section01.aray;

import java.util.Scanner;

public class Application04 {
    public static void main(String[] args) {
        //5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램 제작

        Scanner sc = new Scanner(System.in);

//        System.out.println("첫 번째 학생의 점수를 입력해주세요.");
//        double rank1 = sc.nextInt();
//        System.out.println("두 번째 학생의 점수를 입력해주세요.");
//        double rank2 = sc.nextInt();
//        System.out.println("세 번째 학생의 점수를 입력해주세요.");
//        double rank3 = sc.nextInt();
//        System.out.println("네 번째 학생의 점수를 입력해주세요.");
//        double rank4 = sc.nextInt();
//        System.out.println("다섯 번째 학생의 점수를 입력해주세요.");
//        double rank5 = sc.nextInt();
//
//        double[] rankarray = new double[5];
//
//        rankarray[0] = rank1;
//        rankarray[1] = rank2;
//        rankarray[2] = rank3;
//        rankarray[3] = rank4;
//        rankarray[4] = rank5;
//
//        double sum = 0;

//        for (int i = 0; i <= rankarray.length; i++){
//            //int i를 0값주고 선언 ; i가 array보다 작거나 같을 때까지만; i에 ++
//              sum += rankarray[i];
////            sum에 rankarray값을 추가
//
//            }

        int[] student = new int[5];

        int sum = 0;

        double avg = 0.0;

        for (int i = 0; i < student.length ; i++){
            System.out.println(i + "번째 학생의 자바 점수를 입력해주세요 : ");
            student[i] = sc.nextInt();
            sum += student[i];
        }
        avg = sum / student.length;

        System.out.println(student.length + "명의 자바 점수 합계는 + " + sum + "\n 평균 점수는" + avg);







        }


    }


