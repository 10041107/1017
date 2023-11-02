package day1102;

import java.util.*;


public class Main {
    private int count;
    private int rank;

    private int quene;

    public Main(int quene, int count, int rank) {
        this.quene = quene;
        this.count = count;
        this.rank = rank;
    }

    public int getQuene() {
        return quene;
    }

    public int getCount() {
        return count;
    }

    public int getRank() {
        return rank;
    }

    //public void로 this선언시 get선언 필요, 다른 클래스로 이동할시 set선언추가필요

    public static void main(String[] args) {
        /*
        1. 테스트케이스를 진행할 수(정수)
        2. 테스트케이스 -1 : 문서의 개수 N (1) / 몇번째로 인쇄되었는지 궁금한 문서(M)가 현재 큐에서 몇번째냐? (2)
        3. 테스트케이스 -2 : 해당 문서들의 중요도 (9가 가장 높고 1이 낮음 / 현재 문서보다 중요도 높은게 있다 = 가장 뒤에 재배치)
        4. 출력: M의 중요도 순서
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("반복할 횟수 입력");
        int testquene = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < testquene; i++) {

            System.out.println("테스트케이스1 - 문서의 개수 (N) / 몇번째로 인쇄되었는지 궁금한 문서(M) 입력");

            String input = sc.nextLine();
            String[] inputArray = input.split(" ");
            count(); = Integer.parseInt(inputArray[0]);



            int count2 = (Integer.parseInt(inputArray[1])-1);

            System.out.println("테스트케이스2 - 각 문서의 중요도 입력");

            String input2 = sc. nextLine();
            String[] inputArray2 = input2.split(" "); //띄어쓰기제거

            ArrayList<Integer> valueList = new ArrayList<>();
            List <Main> Lists = new ArrayList<>();
            for (int j = 0; j < count1; j++) {
                Lists.add(new Main(j, Integer.parseInt(inputArray2[j])));
            } // count1만큼 반복.






//
//            ArrayList<Integer> valueList = new ArrayList<>();
//            List<Main> Lists = new ArrayList<>();
//
//
//            String input2 = sc.nextLine();
//            String[] inputArray2 = input2.split(" ");
//
//            for (int j = 0; j < count1; j++) {
//                Lists.add(new Main(j, Integer.parseInt(inputArray2[j])));
//            }
//
//            Lists.sort(Comparator.comparing(Main::getRank));
//            Main mainObject = Lists.get(count2);
//
//            int rank = mainObject.getRank();
//            System.out.println(rank);
//
//
//
//
//
//        }
//    }
//}