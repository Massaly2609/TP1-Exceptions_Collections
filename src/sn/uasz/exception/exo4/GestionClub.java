package sn.uasz.exception.exo4;

import java.lang.reflect.Member;

public class GestionClub {

    public static void main(String[] args) {
        Club c = new Club();

        try {
            c.ajouter( new Membre ("M01", "Massaly", "Ingenieur", "M", 782670789));
            c.ajouter( new Membre ("M02", "Ndiaye", "Ingenieur en SEO", "f", 782672389));
            c.ajouter( new Membre ("M03", "Sarr", "Ingenieur Design", "M", 702670712));
            c.ajouter( new Membre ("M01", "KA", "Ingenieur Marketing", "f", 770970789));
        } catch (IdentifiantExistantException e){
            System.out.println(e.getMessage());
        }

        c.afficher();
        try {
            c.supprimer("M02");
            c.supprimer("M02");
        } catch (IdentifiantExistantException e) {
            System.out.println(e.getMessage());
        }

        c.afficher();
    }


}

