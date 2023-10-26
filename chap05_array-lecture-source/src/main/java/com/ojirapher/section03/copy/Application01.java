package main.java.com.ojirapher.section03.copy;

public class Application01 {

    public static void main(String[] args) {

        /*
        배열의 복사에는 크게 두 가지 종류가 있다.
        1. 얇은 복사(shallow copy) : stack의 주소 값만 복사.
        2. 깊은 복사(deep copy) : heap의 배열에 저장된 값을 복사. 어머니

        //stack:
        //heap:

        //https://junghyun100.github.io/%ED%9E%99-%EC%8A%A4%ED%83%9D%EC%B0%A8%EC%9D%B4%EC%A0%90/
        https://helloworld-japan.tistory.com/33
        https://velog.io/@sp1rit/%EC%8A%A4%ED%83%9DStack%EA%B3%BC-%ED%9E%99Heap

        데이터, 스택, 힙 영역 정리

        각각의 영역을 간단하게 정리하면 아래와 같습니다.

        데이터 영역(정적메모리)
        - 프로그램이 종료될 때까지 지워지지 않을 데이터 저장.
        - 대표적으로 전역 변수와 static 변수
        - 상수도 저장

        스택 영역(자동 메모리)
        - 잠깐 사용하고 삭제하는 데이터 저장(지역변수, 매개변수)
        - 해당 객체가 정의된 블록(스코프)을 벗어날 때 소멸
        - 함수의 호출하는 위치도 저장.
        - 힙보다 빠름

        힙 영역(자유 저장소)
        - 가비지 컬렉터가 없으면 프로그래머가 직접 관리(할당/해제)해줘야 함.
        - 스택보다 큰 메모리를 할당받기 위해 사용
        - 동적 메모리 할당 ( new /포인터)
        - delete를 사용하여 해당 객체 메모리 반환
        - 스택보다 느림


        얇은 복사는 stack에 저장되어 있는 배열의 주소값만 복사한다는 것이다.
        따라서 두 개의 레퍼런스 변수는 동일한 배열의 주소값을 가지고 있다.
        하나의 레퍼런스 변수에 저장된 주소값을 가지고 배열의 내용을 수정(값 변경)을 하게되면
        다른 레퍼런스 변수로 배열에 접근했을 때도 동일한 배열을 가리키고 있기 때문에 변경된 값이 반영되어 있다.
         */

        int[] originArr = {1,2,3,4,5};
        int[] copyArr = originArr;

        int[][] test = new int[3][5];
        int[] test1 = new int[3];

        System.out.println(originArr.hashCode());
        System.out.println(copyArr.hashCode());

        // for each문: 각각의 int x에 copyArr을 대입했다
        // 배열의 루프를 돌리고, 배열 안에 있는 객체에서 한개씩 int x 에 대입한다. 순서대로
        // x=변수명. 다른것으로 변경할 수 있다.

        for(int x : copyArr) {
            System.out.println(x);
        } // 같은 주소를 참조하고 있음 - 얕은 복사

//        int[] deepCopy = new int[originArr.length];
//            int i=0;
//            for (int x: originArr){
//            deepCopy[i]= x;
//            i++;
//        }
//            for (int x : deepCopy) {
//                System.out.println("deepCopy = " + x);
//            }
//
//            int [] deepCopy = new int[originArr.length];
//            int i = 0;
//            for (int x: originArr) {
//                deepCopy[i] = x;
//                i++;
//            }
//            deepCopy[0] = 100;

        int[] deepCopy = new int[originArr.length];
        int i = 0;
        for (int x : originArr) {
            deepCopy[i] = x;
            i++;
        }

        //for each문
        for (int x : deepCopy) {
            System.out.println("deepCopy = " + x);
        }

        deepCopy[0] = 100;








    }




}
