package com.dlrjsdn4433.review0715;

public class review3 {
    public static void main(String[] args) {
        // 자동 형 변환과 강제 형 변환을 이용하여 ㅅ ㅓ로 다른 자료형의 연산을 수행할 수 있다.
        int inum =10;
        long lnum = 100L;
        // 1. 두 수의 연산결과를 int형으로 변환 후 int 자료형 변수에 리턴받는다.
//        int isum = inum + lnum; // 이러허게 되면 자료형이 통일되지 않아서 연산불가 -> 컴파일 에러
        int isum = (int) (inum + lnum); // 성공!
        System.out.println(isum);
        // 2. long 형 값을 int로 강제 형변환 한다.
        int isum2 = inum + (int) lnum; // inum은 이미 int형이고 long형인 lnum만 강제 형변환 후 연산 할 수도 있음!!
        System.out.println(isum2);
        // 3. 결과값을 long 자료형으로 받는다 (자동 형변환)
        long lsum = inum + lnum ; // 작은거(int)에서 큰거(long)로 변환 될때는 데이터 손실 가능성이 없어서 자동으로 형변환이 되는건가
        System.out.println(lsum);

        // **주의사항** int미만의 연산 처리 결과는 int 형이다.
        byte bnum1 = 1;
        byte bnum2 = 2;
        short snum1 = 3;
        short snum2 = 4;

        int result1 = bnum1 + bnum1;
        int result2 = bnum1 + snum1;
        int result3 = snum1 + snum1;
        int result4 = snum1 + snum2;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
