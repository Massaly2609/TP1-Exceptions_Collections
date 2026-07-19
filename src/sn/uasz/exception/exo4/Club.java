package sn.uasz.exception.exo4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//2. Créer la classe Club avec un seul attribut, la liste de ses membres représentée
//   par une collection de type Map (e.g HashMap) dont la clé est l’identifiant du
//   membre. Cette classe comporte les méthodes suivantes :

public class Club {

    private Map<String, Membre> members;

//    Construteur par default
    public Club() {
         members = new HashMap<>();
    }

//    permettant d’ajouter un nouveau membre au club

    public void ajouter (Membre member) throws IdentifiantExistantException {

        if (members.containsKey(member.getIdentifiant()))
          throw new IdentifiantExistantException("Cet identifiant existe deja");
        members.put(member.getIdentifiant(), member);
    }

//    une méthode supprimer(String identifiant) qui permet de supprimer un membre.

    public  void  supprimer (String id) throws IdentifiantExistantException {
        if (!members.containsKey(id))
         throw new IdentifiantExistantException("Cet identifiant non existe deja");
        {
            members.remove(id);
        }
    }

//  une méthode modifier(String identifiant) permettant de mettre à jour les informations d’un membre

    public void modifier (String id) throws IdentifiantExistantException {
        if (!members.containsKey(id))
            throw new IdentifiantExistantException("Ce Membre non existe deja");

        Membre m = (Membre) members.get(id);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nom du membre : ");
        String nom = scanner.nextLine();

        System.out.print("La Profession du membre : ");
        String profession = scanner.nextLine();

        System.out.print("Le numero du Telephone du membre : ");
        long telephone = scanner.nextLong();

        System.out.print("Le Sexe du membre : ");
        String sexe = scanner.nextLine();

//      Modifier en utilisant les Setters
        m.setNom(nom);
        m.setPrefession(profession);
        m.setSexe(sexe);
        m.setTelephone(telephone);

        scanner.close();

    }

//    Afficher les membres
    public void afficher (){
        for (Membre m : members.values()){
            System.out.println(m);
        }
    }

}
