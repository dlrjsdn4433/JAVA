package com.ProjectNull.practice0725.vehicle;

public class Vehicle implements VehicleMove,VehicleTurn{


    @Override
    public void go() {
        System.out.println("전진합니다.");
    }

    @Override
    public void stop() {
        System.out.println("멈춥니다.");

    }


    @Override
    public void turnL() {
        System.out.println("왼쪽으로 돕니다.");

    }

    @Override
    public void turnR() {
        System.out.println("오른쪽으로 돕니다.");
    }
}
