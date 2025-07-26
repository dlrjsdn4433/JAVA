package com.ProjectNull.practice0725.vehicle;

public class Boat extends Vehicle implements VehicleTurn{
    @Override
    public void go(){
        System.out.print("노를 젓습니다.");
        super.go();
    }
    @Override
    public void stop(){
        System.out.print("노 젓기를 멈춥니다.");
        super.stop();
    }
    @Override
    public void turnL(){
        System.out.print("오른쪽 노만 젓습니다.");
        super.turnL();
    }
    @Override
    public void turnR(){
        System.out.print("왼쪽 노만 젓습니다");
        super.turnR();
    }

    public void motorOn(){
        System.out.print("모터를 켭니다. ");
        System.out.println("빠르게 전진합니다.");
    }
}
