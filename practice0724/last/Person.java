package com.dlrjsdn4433.practice0724.last;

public class Person {

    private String name;
    private int age;

    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public void printInfo(){
        System.out.println("이름 : "+this.name+", 나이 : "+this.age);
    }

}
