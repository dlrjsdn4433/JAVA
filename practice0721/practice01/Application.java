package com.ProjectNull.practice0721.practice01;

public class Application {
    public static void main(String[] args) {
        Calculation calc = new Calculation();

        calc.checkMethod();
        System.out.println("1부터 10까지의 합 : "+calc.sum1to10());
        calc.checkMaxNumber(10,20);
        int answer1 = calc.sumTwoNumber(10,20);
        System.out.println(answer1);
        System.out.println(calc.minusTwoNumber(10,5));

    }
}
