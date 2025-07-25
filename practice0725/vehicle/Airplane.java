package com.ProjectNull.practice0725.vehicle;

public class Airplane extends Vehicle{

    private boolean flight;

    @Override
    public void go(){
        System.out.print("양쪽 터빈을 돌립니다.");
        super.go();
    }
    @Override
    public void stop(){
        System.out.print("양쪽 터빈을 멈춥니다.");
        super.stop();
    }
    @Override
    public void turnL(){
        System.out.print("오른쪽날개 터빈을 세게 합니다.");
        super.turnL();
    }
    @Override
    public void turnR(){
        System.out.print("왼쪽 날개 터빈을 세게 합니다.");
        super.turnR();
    }

    public void fly(){
        if(flight){
            System.out.println("이미 이륙했습니다.");
        }else{
            System.out.println("이륙합니다.");
            this.flight=true;
        }
    }
    public void land(){
        if(flight){
            System.out.println("착륙합니다.");
            this.flight = false;
        }else{
            System.out.println("이미 착륙했습니다.");

        }
    }
}
