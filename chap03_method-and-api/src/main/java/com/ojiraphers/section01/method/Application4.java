package main.java.com.ojiraphers.section01.method;

public class Application4 {
    public static void main(String[] args) {

        Application4 app4 = new Application4();
        app4.testMethod("홍길동", 20, '남');

        String name = "홍길동";
        int age = 20;
        char gender = '여';
        app4.testMethod(name,age,gender);
    }

    public void testMethod(String name, int age, final char gender){
        System.out.println("당신의 이름은" + name + "이고, 나이는" + age + "세 이며, 성별은" + gender + "입니다.");
    }

//    public void infol00(String name, int age, final char gender){
//
//        name = name + " " + 100;
//        age = age + 100;
//        gender = gender + "120";
//
//        System.out.println("당신의 이름은" + name + "이고, 나이는" + age + "세 이며, 성별은" + gender + "입니다.");
//    }

}

