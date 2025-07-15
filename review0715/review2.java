package com.dlrjsdn4433.review0715;

public class review2 {
    public static void main(String[] args) {
        //강제 형변환
        // 정수끼리
        long lnum = 8L;
//        int inum = lnum; // 컴파일 오류나는데 long이 int보다 커서 데이터 손실 가능성을 알려주면서 오류가 나는거래요
        int inum = (int) lnum;
        System.out.println(inum); // 8로 잘 나옵니다.

        // ex)
        short snum = (short) inum;
        byte bnum = (byte) snum;
        System.out.println(bnum); // long > int > short > byte 순이라서 8 그대로 잘 나온다.
        // 반대로는 어떤가?
        byte b = 10;
        short s = b;
        System.out.println(s); // 이 경우에는 컴파일 오류 나지않는데 데이터 타입도 변경된건지 모르겠네요

        // 실수끼리
        double dnum = 8.0;
//        float fnum = dnum; // 얘도 double이 float보다 커서 데이터 손실때문ㅇ ㅔ오류나는듯
        float fnum = (float) dnum;
        System.out.println(fnum); // 굿

        // 실수 -> 정수
        float fnum2 = 5.3f;
//        long lnum2 = fnum2; // -> 실수에서 정수로 바꾸는 과정에서 소숫점 이하 데이터 손실 가능성을 컴파일 오류로 알려준다.
        long lnum2 = (long)fnum2;
        System.out.println(lnum2); // 소숫점 이하 데이터 자르고 정수형으로 변환

        // 문자형을 intal만 크기 변수에 저장?
        char ch = 'a';
        byte bnum2 = (byte) ch;
        short snum2 = (short) ch;

        int num1 = 97;
        int num2 = -97;

        char ch2 = (char) num1;
        char ch3 = (char) num2;
        System.out.println(num1);
        System.out.println(num2);

        // 논리형은 강제 형변환 규칙에서도 제외
        boolean inTrue = true;
//        byte b= (byte) isTrue;



    }
}
