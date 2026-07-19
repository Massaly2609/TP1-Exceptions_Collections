package sn.uasz.interfacecollection.tp2;

public class Employe implements Comparable{

    private String prenom;
    private String nom;
    private String fonction;
    private Civilite civilite;

    /** Constructeur principal. */
    public Employe (Civilite civilite, String prenom, String nom, String fonction){
        this.prenom = prenom ;
        this.nom = nom ;
        this.fonction = fonction ;
        this.civilite = civilite;
    }

    /** Constructeur sans civilité (initialisée à INCONNU). */
    public Employe (String prenom, String nom, String fonction ){
       super();
        this.civilite = Civilite.INCONNU;
        this.prenom = prenom;
        this.nom = nom ;
        this.fonction = fonction;

    }

    public String getNom(){
        return nom;
    }
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public Civilite getCivilite() {
        return civilite;
    }

    public void setCivilite(Civilite civilite) {
        this.civilite = civilite;
    }


    @Override
    public String toString() {
        return "Civilite : " + civilite + " | Prenom : " + prenom + " | Nom : " + nom + " (" + fonction + ")";
    }


    @Override
    public boolean equals (Object o){
        if (!(o instanceof Employe e)) {
            return false;
        }
//        Employe e = (Employe) o; // Casting l'Object o -> Employer
        return this.nom.equals(e.nom) && this.prenom.equals(e.prenom) && this.civilite.equals(e.civilite);
    }


    public int hashcode (){
        return (nom + prenom + fonction + civilite ).hashCode();
    }

    @Override
    public int compareTo(Object o) {
        Employe autre = (Employe) o;
        return (this.nom + this.prenom).compareTo(autre.nom + autre.prenom);
    }
}
