package com.dlrjsdn4433.practice0726;

public class Player extends Rule{
    private int hp = 10;
    private int defence;
    private int offence;

    public void who(){
        System.out.print("플레이어는 ");
    }
    public void whose(){
        System.out.print("플레이어의 ");
    }
    @Override
    public int RollDice(){
        return (int)(Math.random()*6+1);

    }

    public void hp(int damage){
        this.hp-=damage;
    }

    @Override
    public void DiceNumClassification(int num){
        who();
        super.DiceNumClassification(num);
    }
}
