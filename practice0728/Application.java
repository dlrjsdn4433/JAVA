package com.ProjectNull.practice0728;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        // 문자열 역순
        StringBuilder a = new StringBuilder("hello");
        a.reverse();
        System.out.println(a);

        //현재 날짜 출력
        LocalDate date = LocalDate.now();
        System.out.println(date);

        //리스트에서 중복제거
        HashSet<Integer> b = new HashSet<>();
        b.add(1);
        b.add(2);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(4);
        b.add(5);
        System.out.println(b);
        String c = "Java is very fun";
        String[] split = c.split(" ");
        System.out.println("단어개수 : "+split.length);

        Pair<String,Integer> p = new Pair<>("Alice",((Integer) 20));




    }
}
