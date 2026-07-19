package sn.uasz.exception.exo4;



//On souhaite développer un programme en java pour gérer les membres du club
//informatique de l’UASZ. Un membre est une personne représentée par un identifiant,
//son nom, sa profession, son sexe (homme ou femme) et son numéro de téléphone.

public class Membre {

    private  String identifiant;
    private  String nom;
    private  String prefession;
    private  String sexe;
    private  long telephone ;

    public Membre(String identifiant, String nom, String prefession, String sexe, long telephone) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prefession = prefession;
        this.sexe = sexe;
        this.telephone = telephone;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrefession() {
        return prefession;
    }

    public void setPrefession(String prefession) {
        this.prefession = prefession;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Membre " +
                "identifiant ='" + identifiant + '\'' +
                ", nom ='" + nom + '\'' +
                ", prefession ='" + prefession + '\'' +
                ", sexe ='" + sexe + '\'' +
                ", telephone =" + telephone ;
    }

    public boolean equals(Object o) {
        if (!(o instanceof  Membre)) {
            return false;
        }
        Membre membre = (Membre) o;

        return this.identifiant.equals(membre.identifiant);
    }
}
