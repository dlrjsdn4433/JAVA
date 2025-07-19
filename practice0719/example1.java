package com.dlrjsdn4433.practice0719;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        // 정수 하나를 입력받아 그 수의 약수와 약수의 갯수를 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 한 개를 입력해주세요 : ");
        int num = sc.nextInt();
        String divisor = "";
        int divisorNum = 0;
        for (int i = 1;i<=num;i++){
            if(num%i==0){
                divisor += i;
                divisor +=" ";
                divisorNum++;
            }
        }
        System.out.println(num+"의 약수는 "+divisor+"이고,");
        System.out.println("약수의 개수는 "+ divisorNum+"개 입니다.");
        if (divisorNum==2){
            System.out.println("소수입니다.");
        }
    }
}
