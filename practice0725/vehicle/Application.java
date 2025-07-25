package com.ProjectNull.practice0725.vehicle;

public class Application {

    public static void main(String[] args) {
        Vehicle V = new Vehicle();
        Airplane A = new Airplane();
        Boat B = new Boat();


        V.go();
        A.go();
        B.go();
        System.out.println();

        V.stop();
        A.stop();
        B.stop();
        System.out.println();

        V.turnL();
        A.turnL();
        B.turnL();
        System.out.println();

        V.turnR();
        A.turnR();
        B.turnR();
        System.out.println();

        Vehicle VA = new Airplane();
        Vehicle VB = (Vehicle) new Boat();

        ((Airplane)VA).fly();
        ((Airplane)VA).fly();

        A.fly();

        A.fly();
        System.out.println();

        ((Airplane)VA).land();
        ((Airplane)VA).land();

        A.land();
        A.land();
        System.out.println();

        A.land();
        A.fly();
        A.fly();
        A.land();
        System.out.println();

        ((Boat)VB).motorOn();
        B.motorOn();





    }
}
