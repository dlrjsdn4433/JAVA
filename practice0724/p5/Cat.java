package com.dlrjsdn4433.practice0724.p5;

public class Cat extends Animal{


    protected Cat(String name) {
        super(name);
    }

    public static void main(String[] args) {

        Animal a = new Animal("나비");
        System.out.println("고양이의 이름은 "+a.name+"입니다.");
    }



}
