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
    }
    public void turnRight(){
        robot.turnRight();
    }
    public void turnOff() {
        robot.turnoff();
    }

    public void checkPosition(){ robot.checkPosition();}

    public void checkDirection(){robot.checkDirection();}
    public void reset(){robot.reset();
    }
}

