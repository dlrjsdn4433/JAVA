package com.dlrjsdn4433.practice0724.last;

public class GraduateStudent extends Student{
    private String researchTopic;

    public GraduateStudent(){}
    public GraduateStudent(String name, int age, String studentId, String researchTopic){
        super(name,age,studentId);
        this.researchTopic=researchTopic;

    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("연구주제 : "+this.researchTopic);
    }

    //@Override
//    public final void study(){} // Student 클래스의 study 메서드는 final 이라서 오버라이딩이 안된다.
}
