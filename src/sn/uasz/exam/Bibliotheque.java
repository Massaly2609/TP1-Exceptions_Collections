package sn.uasz.exam;


import java.util.*;

public class Bibliotheque {

    private static final int LIMITE_EMPRUNTS = 3;

    private Set<Livre> livres = new HashSet<>();
    private Set<Adherent> adherents = new HashSet<>();

    public void ajouterLivre(Livre l) { livres.add(l); }
    public void inscrire(Adherent a) { adherents.add(a); }

    public void emprunter(Adherent a, Livre l)
            throws LivreIndisponibleException, TropDEmpruntsException {
        if (!livres.contains(l)) {
            throw new LivreIndisponibleException(l);
        }
        if (l.getExemplaires() <= 0) {
            throw new LivreIndisponibleException(l);
        }
        if (a.nombreEmprunts() >= LIMITE_EMPRUNTS) {
            throw new TropDEmpruntsException(a);
        }
        // Toutes les conditions sont OK : on procède
        l.setExemplaires(l.getExemplaires() - 1);
        a.getEmprunts().add(l);
    }

    public void retourner(Adherent a, Livre l) {
        if (a.getEmprunts().remove(l)) {
            l.setExemplaires(l.getExemplaires() + 1);
        }
    }

    public static void main(String[] args) {
        Bibliotheque b = new Bibliotheque();

        Livre l1 = new Livre("978-1", "Java avancé",     "DRAME", 2);
        Livre l2 = new Livre("978-2", "Algorithmique",   "DIENG", 1);
        Livre l3 = new Livre("978-3", "Réseaux",         "FAYE", 3);
        Livre l4 = new Livre("978-4", "Bases de données","DIAGNE", 1);

        b.ajouterLivre(l1);
        b.ajouterLivre(l2);
        b.ajouterLivre(l3);
        b.ajouterLivre(l4);

        Adherent a = new Adherent("A001", "DIOUF", "Khadim");
        b.inscrire(a);

        try {
            b.emprunter(a, l1);
            b.emprunter(a, l2);
            b.emprunter(a, l3);
            b.emprunter(a, l4); // 💥 4ème emprunt

        } catch (LivreIndisponibleException | TropDEmpruntsException e) {
            System.out.println("⚠ " + e.getMessage());
        } finally {
            System.out.println("Livre emprunter avec sucees, limite atteinte");
        }
    }
}