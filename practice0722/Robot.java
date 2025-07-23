package com.dlrjsdn4433.practice0722;

public class Robot {

    private boolean isOn;
    private int direction;
    private int robotX=4;
    private int robotY=4;


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
            if(direction%4==0){
                if (robotY==8){
                    System.out.println("앞은 낭떠러지입니다.");
                }else{
                    System.out.println("로봇이 앞으로 움직입니다.");
                    robotY++;
                }
            }else if(direction%4==1||direction%4==-3){
                if(robotX==8){
                    System.out.println("앞은 낭떠러지입니다.");
                }else{
                    System.out.println("로봇이 오른쪽으로 움직입니다.");
                    robotX++;
                }
            }else if (direction%4==2||direction%4==-2){
                if (robotY==0){
                    System.out.println("앞은 낭떠러지입니다.");
                }else {
                    System.out.println("로봇이 후방으로 움직입니다.");
                    robotY--;
                }

            }else {
                if(robotX==0){
                    System.out.println("앞은 낭떠러지입니다.");
                }else{
                    System.out.println("로봇이 왼쪽으로 움직입니다.");
                    robotX--;
                }

            }

        }else{
            System.out.println("로봇의 전원이 꺼져있습니다.");
        }
    }
    public void checkPosition(){
        System.out.println("로봇의 현재 좌표는 "+robotX+", "+robotY+"입니다.");
    }

    public void turnLeft(){
        if(isOn){

                System.out.println("로봇이 반시계방향으로 90도 회전했습니다.");
                this.direction--;
                checkDirection();

        }else{
            System.out.println("로봇의 전원이 꺼져있습니다.");
        }
    }

    public void turnRight(){
        if(isOn){

                System.out.println("로봇이 시계방향으로 90도 회전했습니다.");
                this.direction++;
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
    public void reset(){
        if(isOn){
            this.isOn=false;
            this.robotY=4;
            this.robotX=4;
            this.direction=0;
            System.out.println("로봇의 전원을 끄고, 위치를 초기화 했습니다.");
        }else if(!isOn&&robotY==4&&robotX==4){
            System.out.println("이미 로봇은 꺼져있고, 위치도초기화 되었습니다..");
        }

    }


}
