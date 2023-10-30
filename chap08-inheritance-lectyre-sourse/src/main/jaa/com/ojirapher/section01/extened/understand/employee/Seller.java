package main.jaa.com.ojirapher.section01.extened.understand.employee;

import main.jaa.com.ojirapher.section01.extened.understand.car.ElectricCar;
import main.jaa.com.ojirapher.section01.extened.understand.car.OldCar;

public class Seller {

    private String name;
    private int result; // 판매 수당

    public Seller(String name){
        this.name = name;

    }
    /*
    자동차 판매의 경우 내연기관 자동차와 전기차를 한번에 Car(부모)의 타입으로 입력을 받고
    입력받은 타입의 재정이된 price를 호출하여 하나의 메서드로 판매 가격을 제정할 수 있다.
    만약 위와 같이 하지 안흔 경우 아래의 메서도 oldCarSale().electricCarSale() 각각
    구현을 해야하며 이로 인해 별도의 속성을 갖게 된다.
     */

    //대상변수 incetenceOf 타입 // 대상변수와 타입의 자료형이 같은지 비교한다 (boolean값으로 반환됨)

//    public void sale(){
//
//    }
    /*
    형변환을 하였다고 해서 heap생성된 값이 변환되는 것은 아니며 주소를 잃는 것도 아니다.
    단지 해당 형에서 사용할 수 있는 기능만 사용할 수 있으며 그외적인 기능은 쓰지 못하는 상태가 되는 것이다.
    이를 통해 다형성의 이점을 누릴 수 있게 된다.
    if(car incetenceOf Ele~ // heap의 생성된 car의 자료형이 ElectriceCar와 같은지를 비교함
     */

    /*만약 우리가 상속을 받지 않았다면 다음과 같이 내연기관차(oldCar)를 판매하는 메서드와
    (electricCar)를 판매하는 메서드를 따로 만들어 제공해야 할 것이다.
     */

    public void oldCarSale(OldCar[] oldCar){
        for (OldCar car : oldCar){
        result = OldCar.getPrice();
        }
    }

    public void electricCarSale(ElectricCar[] car){
        for (ElectricCar electricCar : car){
            result += ElectricCar.getPrice();
        }
    }


    @Override
    public String toString() {
        return name + "사원의 이번달 월급은 result= " + result + "만원입니다";
    }


    public void oldCarSale(OldCar oldCar){

        for (OldCar car: oldCar) {
            System.out.println(car.getName() + "을 판매하였습니다");
            System.out.println("-");
        }
        System.out.println(oldCar.getName() + "을 판매했습니다");
        result+= oldCar.getPrice(); * 0.1;
    }




}
