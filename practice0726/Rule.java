package com.dlrjsdn4433.practice0726;

public class Rule implements RollDice{

    private int rn;
    private int hp=10;
    private int defence;
    private int offence;

    @Override
    public int RollDice() {
        this.rn=(int)(Math.random()*6+1);

        return rn;
    }

    @Override
    public void attack(int offence) {
        System.out.println(offence+" 의 데미지를 가합니다.");

    }

    @Override
    public void defence(int defence) {
        System.out.println(defence +" 의 데미지를 방어합니다.");

    }



    public void showHp(){
        System.out.println("현재 체력은 "+this.hp+"입니다.");
    }

    public void DiceNumClassification(int num){
        if(num%2==0){
            defence(num);
        }else{
            attack(num);
        }
    }





}
