package sn.uasz.m1.tp1.exo2;


public class Operation {

    private double nbre1 ;
    private double nbre2;

    public  Operation (){
        this.nbre1 = nbre1;
        this.nbre2 = nbre2;
    }
    public Operation (double nbre1, double nbre2){
        this.nbre1 = nbre1;
        this.nbre2 = nbre2;
    }

//    Division par le deuxieme nombre
    public double quotient() throws  OperationException{
            if (nbre2 == 0 ){
                throw new OperationException("Nombre null ne peut pas diviser ");
            }
            return (nbre1 / nbre2);
    }

    public double  racineDeLaSomme() throws  OperationException{
        double somme = nbre1 + nbre2;
        if (somme < 0){
            throw new OperationException("Somme negative");
        }
        return Math.sqrt(somme);
    }

    public boolean estDivisible() throws  OperationException{
        if (nbre1 <= 0 || nbre2 <= 0 ){
            throw new OperationException("Nombre null ne peut pas diviser ");
        }
        return nbre1 % nbre2 == 0;
    }
}
