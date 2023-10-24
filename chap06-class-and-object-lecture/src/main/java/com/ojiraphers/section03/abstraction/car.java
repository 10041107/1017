package main.java.com.ojiraphers.section03.abstraction;

public class car {
        //    자동차 클래스
        //    속성 : 시동의 상태, 속도,
        //    메소드(=행위 =액션) : 시동걸기, 앞으로가기, 멈추기, 시동끄기
    private boolean isOn; //불리언은 지정해주지 않으면 기본값이 false
    private int speed;

    public void startUp(){
        if(isOn){
            System.out.println("이미 시동이 걸려 있습니다.");

        }else{
            this.isOn = true;
            System.out.println("시동이 걸렸습니다.");
        }
    }


    public void go() {
        if(isOn){ //시동 불리언이 on일때
            if(speed == 0){ //속도가 0이면
                System.out.println("자동차가 출발합니다.");
            }
            speed += 10; // 속도를 점점 증가한다
            System.out.println("현재 자동차의 시속은 " + speed + "km/h 입니다.");
        }else {
            System.out.println("자동차는 시동을 걸어야 출발이 가능합니다.");

        }


    }
    public void stop(){
        if(isOn){
            if(this.speed > 0){
                while (this.speed <= 0){
                    --this.speed;
                    System.out.println("현재 속도" + this.speed + "km/h");


                }
                System.out.println("자동차가 멈췄습니다.");
            }else{
                System.out.println("이미 멈춰있는 상태입니다.");

            }
        }else {
            System.out.println("시동을 걸지 않는 경우 유압으로 인해 브레이크가 점점 무거워집니다.");

        }
    }

    public void turnOff(){
        if(isOn){
            if(speed > 0){
                System.out.println("달리는 상태에서 시동을 끄는 것은 위험압니다.");
            }else {
                this.isOn = false;
                System.out.println("시동을 끄겠습니다. 고생하셨습니다.");
            }
        }else
            System.out.println("이미 시동이 꺼져있습니다.");
    }







}











