package com.dlrjsdn4433.review0715;

public class review4 {
    public static void main(String[] args) {

        // 형 변환시 주의할 점

        // 1. 의도하지 않은 데이터 손실
        int inum = 290;
        byte bnum = (byte) inum;
        System.out.println("inum = " + inum);
        System.out.println("bnum = " + bnum); // 34로 데이터 손실 나면서 출력됨;;

        // 2. 의도한 데이터 손실
        double height = 175.5;
        int floorHeight = (int) height; // 실수형을 정수형으로 변환하면서 소숫점 아래 데이터를 손실함

        System.out.println("height : " + height);
        System.out.println("floorHeight : " + floorHeight); // ㅇㅇ
    }
}
