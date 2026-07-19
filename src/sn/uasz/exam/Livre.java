package sn.uasz.exam;


/**
     Énoncé global
     Une bibliothèque universitaire souhaite informatiser la gestion des emprunts de livres.

     Chaque livre est caractérisé par un ISBN, un titre, un auteur et son nombre d'exemplaires.
     Chaque adhérent est caractérisé par un numéro, un nom et un prénom.
     Un adhérent peut emprunter au maximum 3 livres en même temps.
     Vous devez écrire les classes Java permettant cette gestion.
 */

//        Écrivez la classe Livre (ISBN, titre, auteur, exemplaires).
//        Deux livres sont égaux ssi ils ont le même ISBN.
//        Implémentez equals, hashCode et toString.


public class Livre {
//     Les Attributs de Livres
    private String isbn;
    private String titre;
    private String auteur;
    private int exemplaires;

    public Livre(String isbn, String titre, String auteur, int exemplaires) {
        this.isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
        this.exemplaires = exemplaires;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getExemplaires() {
        return exemplaires;
    }

    public void setExemplaires(int exemplaires) {
        this.exemplaires = exemplaires;
    }

    //    equals, hashCode et toString.
    @Override
    public String toString(){
        return "Livre [ " +
                "ISBN " + isbn +
                ", titre" + titre +
                ", auteur " + auteur +
                ",exemplaire " + exemplaires ;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Livre l)) return false;
        return this.isbn.equals(l.isbn);
    }

    @Override
    public int hashCode() { return (isbn).hashCode(); }

}
