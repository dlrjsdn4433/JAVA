package com.ProjectNull.practice0725.Animals;

public class Cat extends Animal{

    private String food;
    private int hour;
    private String behave;

    public void who(){
        System.out.print("고양이는 ");
    }

    @Override
    public void eat(String food){
        this.food = food;
        this.who();
        super.eat(this.food);
    }

    @Override
    public void sleep(int hour){
        this.hour = hour;
        this.who();
        super.sleep(this.hour);
    }
    @Override
    public void feelHappy(String behave){
        this.behave = behave;
        this.who();
        super.feelHappy(this.behave);

    }

    public void ggukgguk(){
        this.who();
        System.out.println("기분이 좋으면 꾹꾹이를 합니다.");
    }
}
