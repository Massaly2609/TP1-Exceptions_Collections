package sn.uasz.m1.tp1.exo2;

import sn.uasz.exam.Adherent;

public class TropDEmpruntsException extends  Exception{
    public TropDEmpruntsException(Adherent a){
        super("L'adhérent \" + a.getNom() + \" a déjà 3 emprunts en cours. ");
    }
}
