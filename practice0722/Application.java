package com.dlrjsdn4433.practice0722;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        /* 1. 로봇은 9*9([0~8]*[0~8])크기의 판 위를 움직인다.
        *  2. 로봇의 시작 위치는 정 중앙(4,4)이다.
        *  3. 한 차례당 할 수 있는 행위는 전진,반시계방향으로 90도 돌기, 시계방향으로 90도 돌기이다.
        *  4. 판 위를 벗어나려는 행위를 할 경우 안내메시지를 호출한다.
        *  */
        Controler con  = new Controler();

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("============로봇 조종시스템===============");
            System.out.println("1. 전원 켜기");
            System.out.println("2. 전진");
            System.out.println("3. 좌회전");
            System.out.println("4. 우회전");
            System.out.println("5. 방향 확인");
            System.out.println("6. 좌표 확인");
            System.out.println("7. 전원 끄기");
            System.out.println("8. 위치 초기화");
            System.out.println("9. 시스템 종료");
            int no = sc.nextInt();
            System.out.println();


            switch(no){
                case 1: con.startup(); break;
                case 2: con.go(); break;
                case 3: con.turnLeft(); break;
                case 4: con.turnRight(); break;
                case 5: con.checkDirection(); break;
                case 6: con.checkPosition();break;
                case 7: con.turnOff(); break;
                case 8: con.reset(); break;
                case 9:
                    System.out.println("조종시스템을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");
            }

            if(no==9){
                break;
            }
        }

    }
}
