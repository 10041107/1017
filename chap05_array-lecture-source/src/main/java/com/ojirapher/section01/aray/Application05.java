package main.java.com.ojirapher.section01.aray;

public class Application05 {
    public static void main(String[] args) {
        /*
        랜덤한 카드를 한 장 뽑아서 출력해보자
         */
        String[] shapes = {"SPADE" , "CLOVER", "HEART", "DIAMIND"};
        String[] cardnumber = {"2","3","4","5","6","7","8","9","10","ACE","QUEEN","KING","JACK"};
        /*
        String 배열의 길이 추출 : 변수명.length
        //문자열의 길이(문자 수)를 구하는 방법은 length() 메소드를 사용하는 것입니다.
        //length() 메소드는 문자열 객체에 포함되어 있으며 문자열의 길이를 반환합니다.
         */


        int shapeNum = (int)(Math.random() * shapes.length);
        int num = (int) (Math.random() * cardnumber.length);
        for (int i = 0; i < shapes .length; i++) {
            System.out.println(shapes[shapeNum]);

            System.out.println("당신이 뽑은 카드는" + shapes[shapeNum] + " " + cardnumber[num]);
        }




    }



}
