package sn.uasz.exam;

import java.util.ArrayList;
import java.util.List;



/** Écrivez la classe Adherent avec numéro, nom, prénom
 * et la liste de ses emprunts en cours (List<Livre>).
 * Deux adhérents sont égaux ssi ils ont le même numéro.
 */

public class Adherent {
    private String numero;
    private String nom;
    private String prenom;
    private List<Livre> emprunts = new ArrayList<>();

    public Adherent(String numero, String nom, String prenom) {
        this.numero = numero;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Livre> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(List<Livre> emprunts) {
        this.emprunts = emprunts;
    }

    public int nombreEmprunts() { return emprunts.size(); }

    @Override
    public String toString(){
        return "Adherent [ numero : " + numero +
                "|, prenom : " + prenom +
                "|, nom :" + nom +
                "|, Livre empreunter " + emprunts ;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Adherent a )) return false ;
        return this.numero.equals(a.numero);

    }

    @Override
    public int hashCode(){
        return (numero).hashCode();
    }
}
