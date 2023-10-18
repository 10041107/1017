package secion05.typeasting;

public class Application4

{
    public static void main(String[] args) {
        int inum = 290;
        byte bnum = (byte) inum;
        System.out.println("inum : " + inum);
        System.out.println("bnum : " + bnum);//바로 앞부분의 손절로 인해 예측이 어렵다

        double heght = 178.5;
        int floorHeights = (int) heght;
        System.out.println("height : "+ heght);
        System.out.println("floorHeight" + floorHeights);








    }
}
