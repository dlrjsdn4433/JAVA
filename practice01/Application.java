package com.ohgiraffers.practice01;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Calculation calc = new Calculation();

        calc.checkMethod();
        System.out.println("1부터 10까지의 합 : "+calc.sum1to10());
        calc.checkMaxNumber(10,20);
        Scanner sc = new Scanner(System.in);
        System.out.println("a는");
        int a = sc.nextInt();
        System.out.println("b는");
        int b = sc.nextInt();
        int answer1 = calc.sumTwoNumber(a,b);

        System.out.print(a+"과 "+b+"의 합은 : ");
        System.out.println(answer1);
        System.out.println(calc.minusTwoNumber(10,5));

    }
}
