package main.java.com.ojiraphers.understand;

import java.util.*;

public class Application {
    public static void main(String[] args) {

       /*
        1. 사용자가 번호를 입력.
        1-1. 번호가 10 이상일 경우 return;
        1-2. 10과 같거나 이하일 경우
        > 로또 번호는 1부터 45까지중에 중복되지 않은 수를 6개 선별.
        > 양식 "1번 로또 : [0,0,0,0,0,0]"

        2. 판매 횟수가 10이 될 시 추가 출력
        > 행운 번호 : [2, 13, 14, 18, 33, 42]

        3. 이전 판매목록에서 일치하는 값을 찾아 출력
        > N로또 당첨 : [2, 13, 14, 18, 33, 42]

     */


//       1. 사용자가 번호를 입력.
//        1-1. 번호가 10 이상일 경우 return;
//        1-2. 10과 같거나 이하일 경우
        System.out.println("로또 번호를 출력할 횟수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int turnNumber = sc.nextInt();

        if (turnNumber > 11) {
            System.out.println("출력은 10개까지 가능합니다.");
            return;
        } else {
            lotto(turnNumber);
        }
    }


    //같은 클래스의 함수 선언 시 public static 필수
    public static void lotto(int turnNumber) {
        List<Set<Integer>> lottoNum = new ArrayList<>();

        for (int i = 0; i < turnNumber; i++) {
            Set<Integer> lottoNum = randomNumber();
            lottoNum.add(numberResult);

        }
    }

    public static void randomNumber() {
        Set<Integer> numberResult = new HashSet<>();

        while (numberResult.size() < 7) { // size나 length선언 필요
            int randomNumber = (int) (Math.random() * 44) + 1;
            numberResult.add(randomNumber);


    }







}








private static Set<Integer> generateLottoNumbers() {
        Set<Integer> lottoNumbers = new HashSet<>();
        Random rand = new Random();

        while (lottoNumbers.size() < 6) {
        int randNum = rand.nextInt(45) + 1; // 1~45 사이의 랜덤 수
        lottoNumbers.add(randNum);
        }

        return lottoNumbers;
        }
        }







import java.util.*;

public class Application {
    public static void main(String[] args) {
        lotto(10); // 10회 로또 번호 생성
    }

    public static void lotto(int turnNumber) {
        List<Set<Integer>> lottoTurns = new ArrayList<>();

        for (int i = 0; i < turnNumber; i++) {
            Set<Integer> lottoNumbers = generateLottoNumbers();
            lottoTurns.add(lottoNumbers);
        }

        // 결과 출력
        for(int i=0; i<lottoTurns.size(); i++) {
            System.out.printf("%d번 로또 : %s\n", i+1, lottoTurns.get(i));
        }
    }









