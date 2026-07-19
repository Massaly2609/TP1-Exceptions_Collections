package sn.uasz.exception.exo5;

public class GestionParking {

    public static void main(String[] args) throws Exception {

        Parking parking = new Parking(3);

        Voiture v1 = new Voiture(1, "Toyota", 50000, "Essence", "Rouge");
        Voiture v2 = new Voiture(2, "BMW", 30000, "Diesel", "Noir");


        parking.garer(v1, 1);
        parking.garer(v2, 2);
        parking.afficher();

        System.out.println("La voiture "+ v1.getNumero() +" est à la place : " + parking.placeOccupee(1));
        System.out.println("La voiture "+ v2.getNumero() +" est à la place : " + parking.placeOccupee(2));


        parking.retirer(1);
        parking.afficher();

    }
}
