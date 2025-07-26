package com.dlrjsdn4433.practice0726;

public class Computer extends Rule{
    private int hp = 10;
    private int defence;
    private int offence;


    public void who(){
        System.out.print("컴퓨터는 ");
    }

    @Override
    public int RollDice(){
        return (int)(Math.random()*6+1);
    }

    @Override
    public void DiceNumClassification(int num){
        who();
        super.DiceNumClassification(num);

    }

}
