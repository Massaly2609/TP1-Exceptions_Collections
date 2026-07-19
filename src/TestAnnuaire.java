import sn.uasz.interfacecollection.tp2.Annuaire;
import sn.uasz.interfacecollection.tp2.Civilite;
import sn.uasz.interfacecollection.tp2.Employe;
import sn.uasz.interfacecollection.tp2.UnAnnuaire;

void main() {
    // Création d'un annuaire vide
    Annuaire an = new UnAnnuaire();

    // Création de listes de numéros de téléphone
    List<Long> lst1 = new ArrayList<>(); lst1.add(7701L);
    List<Long> lst2 = new ArrayList<>(); lst2.add(7702L); lst2.add(3301L);
    List<Long> lst3 = new ArrayList<>(); lst3.add(7703L);
    List<Long> lst4 = new ArrayList<>(); lst4.add(7704L);

    // Ajout de quatre employés à l'annuaire
    Employe e1 = new Employe(Civilite.Mlle, "DIOUF", "Nafissatou", "Caissière");
    an.ajouter(e1, lst1);
    an.ajouter(new Employe(Civilite.M,  "FALL",   "Aliou",  "Chauffeur"), lst2);
    an.ajouter(new Employe(Civilite.Mme, "DIATTA", "Jeanne", "Receveur"),  lst3);
    an.ajouter(new Employe(Civilite.M,  "NDIAYE", "Lamine", "Chauffeur"), lst4);

    // Impression de l'annuaire (trié par nom grâce à TreeMap + Comparable)
    System.out.println("------------------------------");
    System.out.println(an);
    System.out.println("------------------------------");

    // Recherche des numéros de Mlle Nafissatou DIOUF
    System.out.println("Numeros de :" + e1);
    System.out.println(an.getNumeros(e1));

    // Recherche des numéros de M. Aliou FALL avec un NOUVEL objet
    // Fonctionne grâce à equals/hashCode redéfinis
    Employe e2 = new Employe(Civilite.M, "FALL", "Aliou", "Chauffeur");
    System.out.println("Numeros de :" + e2);
    System.out.println(an.getNumeros(e2));
}