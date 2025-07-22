package com.dlrjsdn4433.practice0722;

public class Robot {

    private boolean isOn;
    int speed;
    private int direction;

    public void startup(){
        if(isOn){
            System.out.println("이미 로봇이 켜져있습니다.");
        }else{
            this.isOn = true;
            System.out.println("로봇의 전원을 켰습니다.");
        }
    }

    public void go(){
        if(isOn){
            System.out.println("로봇이 앞으로 움직입니다.");
        }else{
            System.out.println("로봇의 전원이 꺼져있습니다.");
        }
    }

    public void turnLeft(){
        if(isOn){

                System.out.println("왼쪽으로 방향을 틀었습니다.");
                this.speed--;
                checkDirection();

        }else{
            System.out.println("로봇의 전원이 꺼져있습니다.");
        }
    }

    public void turnRight(){
        if(isOn){

                System.out.println("오른쪽으로 방향을 틀었습니다.");
                this.speed++;
                checkDirection();

        }else{
            System.out.println("로봇의 전원이 꺼져있습니다.");
        }
    }

    public void checkDirection(){
        if(isOn){
            if(this.direction%4==0){
                System.out.println("정면을 바라보고 있습니다.");
            } else if(this.direction%4==1||this.direction%4==-3){
                System.out.println("오른쪽을 바라보고 있습니다.");
            } else if (this.direction%4==2||this.direction%4==-2){
                System.out.println("후방을 바라보고 있습니다.");
            } else{
                System.out.println("왼쪽을 바라보고 있습니다.");
            }
        }
    }
    public void turnoff(){
        if(isOn){
            this.isOn=false;
            System.out.println("로봇의 전원을 끕니다.");
        }else{
            System.out.println("이미 로봇은 꺼져있습니다.");
        }
    }


}
