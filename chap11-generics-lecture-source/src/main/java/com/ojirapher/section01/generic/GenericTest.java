package main.java.com.ojirapher.section01.generic;

public class GenericTest <T> {
    // 퍼블릭 클래스 클래스명 <반환타입(T가 관례)> {}

    private  T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
