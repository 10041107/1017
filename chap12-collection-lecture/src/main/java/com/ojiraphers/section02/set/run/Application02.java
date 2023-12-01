package main.java.com.ojiraphers.section02.set.run;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Application02 {
    public static void main(String[] args) {
        /*
        linkedhashSet클래스
        hashSet이 가지는 기능을 모두 가지고 있고
        추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
        jdk1.4부터 제공한다
         */
        LinkedHashSet<String> lhest = new LinkedHashSet<>();
        lhest.add("java");
        lhest.add("oracle");
        lhest.add("jdbc");
        lhest.add("html");
        lhest.add("css");


        System.out.println(lhest);

        //오름차순 정렬을 하고자 하는 경우 아래와 같이 진행
        //여기서 정렬을 희망하는 경우 같은 자료형에 한해서 지원해준다.
        TreeSet<String> test = new TreeSet<>(lhest);
        System.out.println(lhest);






    }

}
