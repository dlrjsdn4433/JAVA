package com.dlrjsdn4433.practice0726;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* 컴퓨터와 플레이어는 1~6 눈을 가진 정육면체 주사위를 굴린다.
         * 컴퓨터와 플레이어는 각 10의 hp를 가지며 hp가 0이되면 패배한다.
         * 굴린 주사위의 눈이 짝수면 방어, 홀수면 공격을 주사위의 눈만큼 행동한다.
         * 주사위를 굴리는 RollDice 인터페이스를 만들고 추상메소드 RollDice를 만든다.
         * RollDice를 상속받는 Rule 클래스를 만들고 RollDice 메소드를 오버라이딩 하여 1부터6까지의 숫자를 리턴하게 한다.
         *                                     DiceNum 메소드를 작성하여 짝수일땐 방어, 홀수일땐 공격을 할 수있게한다.
         * Player 클래스와 Computer 클래스는 Rule 클래스를 상속받는다.
         *
         * */

        Player p = new Player();
        Computer c = new Computer();
        DetailedRule dr = new DetailedRule();
        int i=1;
        Scanner sc = new Scanner(System.in);

        System.out.println("test");


        System.out.println("====================주사위게임======================");
        System.out.println("컴퓨터와 플레이어는 1~6 눈을 가진 정육면체 주사위를 굴린다.");
        System.out.println("컴퓨터와 플레이어는 각 10의 hp를 가지며 hp가 0이되면 패배한다.");
        System.out.println("굴린 주사위의 눈이 짝수면 방어, 홀수면 공격을 주사위의 눈만큼 행동한다.");
        System.out.println("==================================================");

        while(true){
            System.out.println();
            System.out.println(i+"번째 실행");
            System.out.println("1. 시작하기");
            System.out.println("2. 다시하기");
            System.out.println("9. 포기하고 종료하기");
            System.out.print("숫자를 눌러주세요 : ");

            int num = sc.nextInt();
            System.out.println();

            switch(num){
                case 1:
                    dr.DRule();
                    i++;
                case 2:
                case 9:
                    break;
                default :
                    System.out.println("잘못된 숫자가 입력되었습니다.");
                    break;
            }

            if(num==9){
                System.out.println("게임을 포기하고 종료하셨습니다.");
                break;
            }


        }





//        System.out.println(pnum);;
//        p.DiceNumClassification();
//        p.showHp();
//
//        System.out.println(cnum);
//        c.DiceNumClassification();
//        c.showHp();
////        System.out.println(c.hp()-1);






    }



}
