package com.ProjectNull.practice0725.game;

public class Application extends Rule{

    public static void main(String[] args) {



        //
        //
        // 컴퓨터도 1~6 나도 1~6
        // 주사위를 컴퓨터 하나 굴려 짝수가나오면 방어 홀수가나오면 공격

        Player player = new Player();
        Computer com = new Computer();
        player.RollDice();
        com.RollDice();





    }


}
