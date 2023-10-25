package main.java.com.ojiraphers.section04.parameter;

public class Ractengle {

    private double width;
    private double height;

    public Ractengle(double width, double height){
        this.width = width;
        this.height = height;

        //2. 생성자
        // 반환자를 그대로 따라감
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getheight() {
        return height;
    }

    public void setheight(double height) {
        this.height = height;
    }


    @Override
    public String toString() {
        return "Ractengle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public void calcArea(){
        double area = width * height;
        System.out.println("사각형의 넓이는 : " +area);

    }

    public void calcRound(){
        double area = (width +height) * 2;
        System.out.println("사각형의 둘레는" + area + "입니다.");
    }




}
