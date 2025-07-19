package com.dlrjsdn4433.practice0719;

import java.util.Scanner;

public class practice01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("1부터 10 사이의 정수 한 개를 입력해주세요 : ");
        int num = sc.nextInt();
        for (int dan = 1;dan <=num; dan +=2){
            for(int su = 1; su<10;su++){
                System.out.println(dan+" * "+su+" = "+(dan*su) );
            }
            System.out.println(" ");
        }
    }
}
