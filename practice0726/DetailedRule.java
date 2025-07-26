package com.dlrjsdn4433.practice0726;

public class DetailedRule {
    private int chp = 10;
    private int php = 10;

    public void DRule(){

        // 메소드 밖에서 인스턴스랑 필드(변수)를 초기화하면 메소드를 아무리 반복해도 같은 값만 나오므로
        // 메소드 안에서 하면 계속 다른 실행값을 낼 수 있음.
        DetailedRule d = new DetailedRule();
        Player p = new Player();
        Computer c = new Computer();
        int pnum=p.RollDice();
        int cnum=c.RollDice();
        int damage = (int)(Math.abs(pnum-cnum));

        System.out.println("--------------------------------");

        // 주사위 확인
        System.out.println("플레이어의 주사위 : " + pnum);
        System.out.println("컴퓨터의 주사위 : " + cnum);
        System.out.println("--------------------------------");


        if(cnum%2==0){ // c 방어일 때
            if (pnum%2==0) { // c 방어 p 방어일 때
                System.out.println("아무일도 일어나지 않았습니다.");
            }else{// c 방어 p 공격일 때;
                if(cnum>pnum){ // c 방어 성공
                    System.out.println("컴퓨터는 방어에 성공했습니다.");
                    System.out.println("아무일도 일어나지 않았습니다.");
                }else{
                    //d.PC();// c 방어 관통
                    p.DiceNumClassification(pnum);
                    c.DiceNumClassification(cnum);
                    System.out.println();
                    System.out.println("컴퓨터는 "+damage+" 만큼 피해를 입었습니다.");
                    this.chp-=damage;
                    if (chp<0){
                        this.chp=0;
                    }
                }
            }
        }else{ // c 공격일 때
            if(pnum%2==0){ // c공격 p 방어일 때
                if(cnum>pnum){ // p 방어 관통
                    //d.CP();
                    p.DiceNumClassification(pnum);
                    c.DiceNumClassification(cnum);
                    System.out.println();
                    System.out.println("플레이어는 "+damage+" 만큼 피해를 입었습니다.");
                    this.php-=damage;
                    if(php<0){
                        this.php=0;
                    }
                }else{ // p 방어 성공
                    System.out.println("플레이어는 방어에 성공했습니다.");
                    System.out.println("아무일도 일어나지 않았습니다.");
                }
            }else{// c 공격 p 공격일 때
                p.DiceNumClassification(pnum);
                c.DiceNumClassification(cnum);
                System.out.println();
                System.out.println("플레이어는 "+cnum+" 만큼 피해를 입었습니다.");
                System.out.println("컴퓨터는 "+pnum+" 만큼 피해를 입었습니다.");
                this.php-=cnum;
                this.chp-=pnum;
                if(php<0){
                    this.php=0;
                }
                if (chp<0){
                    this.chp=0;
                }
            }
        }
        System.out.println("--------------------------------");
        System.out.println("플레이어의 체력 : "+php);
        System.out.println("컴퓨터의 체력 : "+chp);
        System.out.println("--------------------------------");
    }

    public void setChp(int chp){
        this.chp=chp;
    }
    public void setPhp(int php){
        this.php=php;
    }

    public int getChp(){
        return chp;
    }
    public int getPhp(){
        return php;
    }
}
