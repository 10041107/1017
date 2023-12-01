package main.java.com.ojiraphers.section02.set.run;

import java.util.*;

public class Application03 {
    public static void main(String[] args) {
        /*
        TreeSet클래스
        TreeSet클래스는 데이터
        가 정렬된 상태로 저장되는 이진 검색 트래의 형태로 요소를 저장한다.
        이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠르다.
        jdk1.2부터 제공되고 있으며 Set인터페이스가 가지고 있는 특징을 그대로 가지지만
        정렬된 상태를 유지하는 것이 다른 점이다
         */


        TreeSet<String> tset = new TreeSet<>();
        Set<String> test2 = new TreeSet<>();

        tset.add("java");
        tset.add("oracle");
        tset.add("jdbc");
        tset.add("html");
        tset.add("css");

        System.out.println(tset);

        Iterator iterator = tset.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Object[] arr = test2.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }
        Set<Integer> lotto = new TreeSet<>();
        while (lotto.size() < 6){
            lotto.add((int)(Math.random()*45)+1);
        }
        System.out.println(lotto);




    }



}
