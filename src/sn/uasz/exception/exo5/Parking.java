package sn.uasz.exception.exo5;

import java.util.HashMap;
import java.util.Map;

public class Parking {

    private int capacite;
    private Map<Integer, Voiture> voitures;

    public Parking(int capacite) {
        this.capacite = capacite;
        voitures =  new HashMap<>();
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public Map<Integer, Voiture> getVoitures() {
        return voitures;
    }

    public void setVoitures(Map<Integer, Voiture> voitures) {
        this.voitures = voitures;
    }


    public void garer(Voiture v, int place) throws PlaceOccupeeException, PlaceInexistanteException{

        if (place < 1 || place > capacite) {
            throw new PlaceInexistanteException("Place " + place + " inexistante !");
        }

        if(voitures.containsKey(place)){
            throw new PlaceOccupeeException("Place " + place + " déjà occupée !");
        }

        voitures.put(place,v);

    }

    public void retirer(int place) throws PlaceOccupeeException, PlaceInexistanteException, PlaceNonOccupeeException {

        if(place > capacite){
            throw new PlaceInexistanteException("Place " + place + " inexistante !");
        }

        if(!voitures.containsKey(place)){
            throw new PlaceNonOccupeeException("Place " + place + " est libre !");
        }

        voitures.remove(place);
    }

    // Méthode afficher()
    public void afficher() {
        for (int i = 1; i <= capacite; i++) {
            if (voitures.containsKey(i)) {
                System.out.println("Place " + i + " : " + voitures.get(i));
            } else {
                System.out.println("Place " + i + " : libre");
            }
        }
    }

    public int placeOccupee(long numero) {

        int p = -1 ;
        for (int k : voitures.keySet()) {
            Voiture v = voitures.get(k);

            if (v.getNumero() == numero) {
                return k;
            }
        }

        return p;
    }

    public int placeOccupee2(long numero){

        for(Map.Entry e : voitures.entrySet()){
            int k = (int) e.getKey();

            Voiture v = (Voiture) e.getValue();
            if (v.getNumero() == numero) {
                return k;
            }
        }
        return -1;
    }

    // Méthode placeOccupee()
//    public int placeOccupee(String immatriculation) {
//        for (Map.Entry<Integer, Voiture> entry : places.entrySet()) {
//            if (entry.getValue().getNumero().equals(immatriculation)) {
//                return entry.getKey();
//            }
//        }
//        return -1;
//    }
}
