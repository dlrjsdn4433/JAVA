package com.dlrjsdn4433.practice0724.last;

public class Student extends Person{

    private String studentId;

    public Student(){
        super();
    };

    public Student(String name, int age, String studentId){
        super(name,age);
        this.studentId = studentId;

    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("학번 : "+this.studentId);
    }

    public final void study(){
        System.out.println("공부중입니다.");
    }
}
