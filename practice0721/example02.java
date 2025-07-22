package com.ProjectNull.practice0721;

import java.util.Scanner;

public class example02 {
    public static void main(String[] args) {
        String[] fruits = new String[]{"딸기","바나나","복숭아","키위","사과"};
        Scanner sc = new Scanner(System.in);
        System.out.println("0부터 4까지의 정수를 입력하세요 : ");
        int num = sc.nextInt();
        if(num>=0&&num<=4){
            System.out.println(fruits[num]);
        }else{
            System.out.println("준비된 과일이 없습니다.");
        }

    }
}
