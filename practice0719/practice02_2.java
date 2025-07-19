package com.dlrjsdn4433.practice0719;

public class practice02_2 {
    public static void main(String[] args) {
        /*
        * 4 1
        * 3 3
        * 2 5
        * 1 7
        * 0 9*/

        for (int i = 0; i<=4;i++){
            for(int j = 0; j<=4-i;j++){ // 조건식을 잘 활용해봅시다.
                System.out.print(" ");
            }
            for(int j = 0; j<=i*2;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
