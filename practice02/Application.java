package com.ohgiraffers.practice02;

public class Application {

    public static void main(String[] args) {

        SimpleOperations s = new SimpleOperations();
        System.out.println(s.sumNumbers(1,100));
        s.isEvenNumber(10);
        System.out.println(s.countingCharacter("Hello World",'l'));
        System.out.println(s.reverseString("Hello World"));
    }
}
