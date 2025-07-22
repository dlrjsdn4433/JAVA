package com.ProjectNull.practice0721;

import java.util.Objects;

public class test1 {
    public static void main(String[] args) {
//        int[][] arr = {{1,2,3},{4,5,6,7},{8,9,10,11,12},{13,14,15,16,17,18}};
////        System.out.println(arr.length);
////        System.out.println(arr[0].length);
////        System.out.println(arr[1].length);
////        System.out.println(arr[2].length);
////        System.out.println(arr[3].length);
//        for(int i = 0; i<arr.length; i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        int[][][] arr={{{1,2},{3,4}},{{5,6},{7,8}},{{9,10},{11,12}}};
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                for (int k=0;k<arr[i][j].length;k++){
//                    System.out.print(arr[i][j][k]+" ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//        int r2= (int)(Math.random()*2);
//        int r3= (int)(Math.random()*3);
//        System.out.println(arr[r3][r2][r2]);

        String[] shapes = {"Spade","Clover","Heart","Diamond"};
        String[] numbers = {"Ace","2","3","4","5","6","7","8","9","Jack","Queen","King"};
        String[][] cardsCases = {shapes, numbers};

        String[] deck= new String[7];
        int[] rs = new int[7]; // 0~4번 인덱스의 모양
        int[] rc = new int[7];
        int PairStack=-1;
        int flushStack = 0;
        for ( int i = 0; i < 7;i++){
 // 0~4번 인덱스의 숫자
            // 중복되지 않는 카드 5장으로 패 구성하기
            int randomShapes = (int)(Math.random()*3);
            int randomCards = (int)(Math.random()*12);
            String drawCard = shapes[randomShapes] + " " + numbers[randomCards];
            if(!Objects.equals(deck[i], drawCard)) {
                deck[i] = drawCard;
                rs[i] = randomShapes;
                rc[i] = randomCards;
            }

//            if(){
//                flushStack++;
//                if(flushStack==5){
//                    System.out.println("flush");
//                    break;
//
//                }
//            }
            for (int j = 0; j < 7-i; j++){
                if(i!=j){
                                    }
            }

        }


        // 패 확인하기
        for ( int i = 0; i < 7; i++){
            System.out.print(deck[i]+" ");
            System.out.println();
//            System.out.println("flushStack = " + flushStack);
//            System.out.println(rs[i]+" ");
//            System.out.println(rc[i]+" ");
        }





    }
}
