package com.ProjectNull.practice0721.practice01;


public class Calculation {
    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10() {
        int num=0;
        for(int i = 1 ; i <=10; i++){
            num+=i;
        }
        return num;
    }

    public void checkMaxNumber(int a, int b){
        int answer;
        if(a>b){
            answer=a;
        }else{
            answer=b;
        }
        System.out.println("두 수 중 큰 수는 "+answer+"이다.");
    }

    public int sumTwoNumber(int a, int b){
        int answer = a+b;
        return answer;
    }

    public int minusTwoNumber(int a, int b){
        return a-b;
    }

}
