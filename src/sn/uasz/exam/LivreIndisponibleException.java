package sn.uasz.exam;

public class LivreIndisponibleException extends Exception {
    public LivreIndisponibleException(Livre l ) {
        super("Aucun exemplaire disponible pour : " + l.getTitre());
    }
}
