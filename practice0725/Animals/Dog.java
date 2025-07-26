package com.ProjectNull.practice0725.Animals;

public class Dog extends Animal{

    private String food;
    private int hour;

    public void who(){
        System.out.print("강아지는 ");
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

    public void shakeTail(){
        this.who();
        System.out.println("기분이 좋으면 꼬리를 흔듭니다.");
    }
}
