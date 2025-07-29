package com.ohgiraffers.practice02;

import java.util.List;

public class SimpleOperations {

    public void printMessage(){
        System.out.println("메소드 호출 확인용 메소드 호출");
    }

    public int sumNumbers(int start, int end){
        int answer=0;
        for(int i = start; i < end+1;i++ ){
            answer+=i;
        }
        System.out.print(start+"부터 "+end+"까지의 합은 : ");
        return answer;
    }

    public boolean isEvenNumber (int num){
        boolean isEven = true;
        if(num%2!=0){
            isEven=false;
            System.out.println(num+"은 홀수입니다.");
        } else {
            System.out.println(num+"은 짝수입니다.");
        }
        return isEven;
    }

    public int countingCharacter(String input, char ch){
        int result = 0;
        for(int i = 0;i<input.length();i++){
            if (input.charAt(i)==ch){
                result++;
            }
        }
        System.out.print(input+"에서 "+ch+"의 개수는 : ");
        return result;
    }

    public String reverseString (String input){
        String reversedS = "";
        for(int i= input.length()-1;i>=0;i--){
            reversedS+=input.charAt(i);
        }
        System.out.print(input+"을 뒤집은 결과는 : ");
        return reversedS;
    }

}
