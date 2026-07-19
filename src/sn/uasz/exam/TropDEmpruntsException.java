package sn.uasz.exam;

public class TropDEmpruntsException extends  Exception{
    public TropDEmpruntsException(Adherent a){
        super("L'adhérent " + a.getNom() + " a déjà 3 emprunts en cours. ");
    }
}
