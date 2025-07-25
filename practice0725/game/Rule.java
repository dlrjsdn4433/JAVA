package com.ProjectNull.practice0725.game;

public class Rule implements RollDice {
    private int num2;
    private int hp=10;
    private int damage;
    private int defence;


    @Override
    public void RollDice(){
        this.num2 = (int)(Math.random()*6+1);
        System.out.println("당신의 숫자는 "+this.num2+"입니다.");
    }
}
