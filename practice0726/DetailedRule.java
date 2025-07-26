package com.dlrjsdn4433.practice0726;

public class DetailedRule {
    Computer c = new Computer();
    Player p = new Player();
    private int pnum=p.RollDice();
    private int cnum=c.RollDice();

    public void PC(){ // p 공격 c 방어일때 사용

    }


    public void DRule(){

        DetailedRule d = new DetailedRule();

        System.out.println("pnum = " + pnum);
        System.out.println("cnum = " + cnum);




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
                    System.out.println("컴퓨터는 "+(pnum-cnum)+"만큼 피해를 입었습니다.");

                }
            }
        }else{ // c 공격일 때
            if(pnum%2==0){ // c공격 p 방어일 때
                if(cnum>pnum){ // p 방어 관통
                    //d.CP();
                    p.DiceNumClassification(pnum);
                    c.DiceNumClassification(cnum);
                    System.out.println();
                    System.out.println("플레이어는 "+(cnum-pnum)+"만큼 피해를 입었습니다.");
                }else{ // p 방어 성공
                    System.out.println("플레이어는 방어에 성공했습니다.");
                    System.out.println("아무일도 일어나지 않았습니다.");
                }
            }else{// c 공격 p 공격일 때
                p.DiceNumClassification(pnum);
                c.DiceNumClassification(cnum);
                System.out.println();
                System.out.println("플레이어는 "+cnum+"만큼 피해를 입었습니다.");
                System.out.println("컴퓨터는 "+pnum+"만큼 피해를 입었습니다.");
            }
        }

      // System.out.println("플레이어의 체력"+c.hp((cnum- pnum));
        //System.out.println("컴퓨터의 체력"+c.hp((pnum-cnum));



    }
}
