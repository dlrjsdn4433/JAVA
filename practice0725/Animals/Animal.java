package com.ProjectNull.practice0725.Animals;

public class Animal implements AnimalEat,AnimalSleep{

    private String food;
    private int hour;
    private String behave;

    @Override
    public void eat(String food) {
        System.out.println(food+"를 먹습니다.");
    }

    @Override
    public void sleep(int hour){
        System.out.println(hour+"시간동안 잡니다.");
    }

    public void feelHappy(String behave){
        System.out.println("기분이 좋으면 "+behave+"를 합니다.");
    }
}
