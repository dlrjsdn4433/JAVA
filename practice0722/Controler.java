package com.dlrjsdn4433.practice0722;

public class Controler {
    private final Robot robot = new Robot();

    public void startup(){
        robot.startup();
    }
    public void go(){
        robot.go();
    }
    public void turnLeft(){
        robot.turnLeft();
        robot.checkDirection();
    }
    public void turnRight(){
        robot.turnRight();
        robot.checkDirection();
    }
    public void turnOff() {
        robot.turnoff();
    }

}
