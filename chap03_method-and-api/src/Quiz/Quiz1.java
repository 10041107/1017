//다음은 로그인 화면의 일부이다. 코드의 오류를 수정해라.
//        1. 메인 실행 클래스 폴더 경로: src/Quiz/Quiz1.java
//        2. 부가 기능 실행 클래스 폴더 경로: src/Quiz/Quiz2.java
//        3. 외부 클래스 파일은 Quiz2 이외엔 사용하지 않는다.
//        4. 출력 결과: 환영합니다, vip 회원 김과장 님!
//
//        ==== Quiz1.java====
//        package Quiz;
//
//public class Quiz1 {
//    public static void main(String[] args) {
//        int age 30
//        String personName = "김과장";
//        Quiz2 = new Quiz2
//        int result = quiz2.isAdult(age, Quiz1);
//        System.out.println("환영합니다, " + result + " 회원 " + personName + " 님!");
//    }
//}
//
//==== Quiz2.java====
//        package Quiz;
//
//public class Quiz2 {
//    public String isAdult(-) {
//        return (age <= 14) ? "14세 미만은 회원가입할 수 없습니다." : yesAdult(age);
//    }
//
//    public String yesAdult(-) {
//        personName.equals("김과장") ? "vip" : personName.equals("박부장") ? "기존" : "신규";
//    }
//}
//
//
//
//
//
//==========정답==========
//
//        ==== Quiz1.java====

        package Quiz;

public class Quiz1 {
    public static void main(String[] args) {
        int age = 30;
        String personName = "김과장";
        Quiz2 quiz2 = new Quiz2();
        String result = quiz2.isAdult(age, personName);
        System.out.println("환영합니다, " + result + " 회원 " + personName + " 님!");
    }

}
//
//
//==== Quiz2.java====
//        package Quiz;
//public class Quiz2 {
//    public String isAdult(int age, String personName) {
//        return (age <= 14) ? "14세 미만은 회원가입할 수 없습니다." : yesAdult(personName);
//    }
//
//    public String yesAdult(String personName) {
//        return personName.equals("김과장") ? "vip" : personName.equals("박부장") ? "기존" : "신규";
//    }
//}
//
