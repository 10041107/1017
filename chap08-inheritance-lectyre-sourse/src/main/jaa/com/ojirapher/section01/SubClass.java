package main.jaa.com.ojirapher.section01;

import main.jaa.com.ojirapher.section02.SuperClass;

public class SubClass extends SuperClass {

    //메소드 이름을 변경하면 에러가 발생한다
    //아래의 경우 오버라이드가 아닌 다른 함수로 취급됨.
//    @Override
//    public void method1(int num) {
//        super.method(num);
//    }

    //메소드의 리턴타입이 변경되면 에러가 발생됨
//    @Override
//    public void method(int num) {
//        return num;
//    }

    //3. 메서드의 시그니처가 달라도 오류가 발생함.
//    아래의 경우 오버로딩이다
//    @Override
//    public void method(int num, int num2) {
//        super.method(num);
//    }

    //4.   private접근제한자는 자신만 접근할 수 있기 때문에 오류
//    @Override
//    public void privateMethod(){
//
//    }


    //5.final메소드의 경우 한번 정의된 후 변경이 불가능하다
//    @Override
//    public final void finalMethod(){
//
//    }

    //7.부모 메소드의 접근제한자와 같거나 더 넓은 범위로 오버라이딩이 가능하다.
//    더 좁은 범위는 불가능
//    @Override
//    public void protecteMethod(){
//        super.protectedMethod();
//    }

    @Override
    protected void proctedMethod(){}

    @Override
    public void method(int num) {
        super.method(num);
    }

    @Override
    protected void protectedMethod() {
        super.protectedMethod();
    }
}
