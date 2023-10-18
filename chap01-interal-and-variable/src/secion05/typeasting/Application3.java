package secion05.typeasting;

public class Application3 {

    public static void main(String[] args) {
        /*
        자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
        다른 자료형 끼리 연산은 큰 자료형으로 자동 형변환 된 후 연산처리 한다.
         */
        int inum = 10;
        long lnum = 10L;

        /*자바에서는 같은 자료형 끼리만 연산이 가능하다.
        따라서 서로 자료형이 다른 두 자료를 연산할 때 자료형이 같아지도록 형 변환을 해주어야 한다.
         */

        int isum = inum + (int)lnum;
        // 10 + (int) 10;
        isum = (int)(isum + inum);
        // 10L + 10L = (int)20

        byte bnum = 1;
        short snum = 2;
        short snum2 = 3;
        short snum3 = 4;

        short result1 = /*((short) 넣어서 short로 변환해줘야함: 자바는 기본 단위가 int이기 때문*/ (short)(bnum + snum2);
        int results1 = /*(결과 = int로 바뀜)*/ /*(short로 바뀜)*/ bnum + snum2;
        int result2 = snum2 + bnum;
        int result3 = /*(int로 바뀜)*/ bnum + results1;









    }
}
