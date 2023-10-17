public class test {
    public static void main(String[]args) {

        int manager = 100;
        int exaggeration = 120;
        int head = 130;
        int director = 150;
        float bonus = 0.5f;

        String ma = "대리";
        String ex = "과장";
        String he = "부장";
        String di = "차장";

        System.out.println("김" + ma + "의 월급은 " + manager + " + 보너스 " + (int)(manager * bonus) + "만원으로, 총 " +
                (int)(manager + (manager * bonus)) + "만원 입금 되었습니다.");

        System.out.println("김" + ex + "의 월급은 " + exaggeration + " + 보너스 " + (int)(exaggeration * bonus) + "만원으로, 총 " +
                (int)(exaggeration + (exaggeration * bonus)) + "만원 입금 되었습니다.");

        System.out.println("김" + he + "의 월급은 " + head + " + 보너스 " + (int)(head * bonus) + "만원으로, 총 " +
                (int)(head + (head * bonus)) + "만원 입금 되었습니다.");

        System.out.println("김" + di + "의 월급은 " + director + " + 보너스 " + (int)(director * bonus) + "만원으로, 총 " +
                (int)(director + (director * bonus)) + "만원 입금 되었습니다.");

        //나도코딩 -자바 기초 개념


    }
}