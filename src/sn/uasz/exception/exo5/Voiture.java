package sn.uasz.exception.exo5;


//On désire réaliser une application java permettant de gérer un parking automobile.
//Les voitures seront stationnées sur des places numérotées à partir de 1. La capacité (nombre de places) du parking est fixe. Une voiture est caractérisée par un numéro
//d’immatriculation, sa marque, son kilométrage, le type de carburant et sa couleur

public class Voiture {

    private long numero;
    private String marque;
    private int kilometrage;
    private String carburant;
    private String couleur;

    public Voiture(long numero, String marque, int kilometrage, String carburant, String couleur) {
        this.numero = numero;
        this.marque = marque;
        this.kilometrage = kilometrage;
        this.carburant = carburant;
        this.couleur = couleur;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    // Méthode toString()
    @Override
    public String toString() {
        return "Voiture [Numero Immatriculation=" + numero + ", Marque=" + marque +
                ", Kilométrage=" + kilometrage + ", Carburant=" + carburant +
                ", Couleur=" + couleur + "]";
    }

    public boolean equals(Object o) {
        if (!(o instanceof Voiture)) {
            return false;
        }
        Voiture v = (Voiture) o;

        return this.numero == v.numero && this.marque.equals(v.marque);
    }


}