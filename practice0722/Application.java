package com.dlrjsdn4433.practice0722;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Controler con  = new Controler();

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("============로봇 조종시스템===============");
            System.out.println("1. 전원 켜기");
            System.out.println("2. 전진");
            System.out.println("3. 좌회전");
            System.out.println("4. 우회전");
            System.out.println("5. 전원 끄기");
            System.out.println("9. 시스템 종료");
            int no = sc.nextInt();
            System.out.println();


            switch(no){
                case 1: con.startup(); break;
                case 2: con.go(); break;
                case 3: con.turnLeft(); break;
                case 4: con.turnRight(); break;
                case 5: con.turnOff(); break;
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
