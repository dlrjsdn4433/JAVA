package com.dlrjsdn4433.review0715;

public class review1 {
    public static void main(String[] args) {
        // 정수끼리
        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        int num1 = 10;
        long num2 = 20L;
//        int result1 = num1 + num2; // 자동으로 큰 쪽 자료형인 long으로 변경후 계산하기 때문이 int 에 값을 담을 수 없다.
        long result2 = num1 + num2;
        System.out.println(result2); // result2의 자료형은 long?

        // 실수끼리
        float fnum = 4.0f;
        double dnum = fnum;

        double result3 = fnum + dnum;
        System.out.println(result3); // result3의 자료형을 float 보다 큰 double로 선언해서 요류가 안나는듯?

        // 정수와 실수
        long eight = 8L;
        float four = eight;
        System.out.println(four); // 정수 자료형인 eight를 실수 자료형인 four에 넣어서 sout(four)하면 eight의 값이 실수형인 8.0으로 나온다

        //문자형와 int형 : 문자형은 int형으로 자동 형변환 된다.
        char ch1 = 'a';
        int charNumber = ch1;
        System.out.println(charNumber); // 문자형인 ch를 int형인 charNumber로 할당해서 문자 a가 유니코드값인 97로 나옴

        // 논리형 : 논리형은 형변환 규칙에서 제외 -> 어느 자료형이든 boolean을 형변환해서 담을 수 없다.
        boolean isTrue = true;
//        byte b = isTrue; // 컴파일 오류
//        short s = isTrue; // 이것도 컴파일 오류
//        int i = isTrue; // 문자형 정수형 등 전부 안되는듯?



    }
}
