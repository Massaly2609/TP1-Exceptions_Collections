package sn.uasz.m1.tp1.exo2;

public class Principale {
    public static void main(String[] args) throws Exception {
        Operation op1 = new Operation (20, 10);
        Operation op2 = new Operation (8, 2);
        Operation op3 = new Operation (3, 0);

        System.out.println(op2.quotient());
        System.out.println(op1.racineDeLaSomme());
        System.out.println(op3.estDivisible());

    }
}
