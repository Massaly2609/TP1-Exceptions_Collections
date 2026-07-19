package sn.uasz.interfacecollection.tp2;


import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UnAnnuaire implements Annuaire {

    private Map<Employe, List<Long>> tables;

    public UnAnnuaire() {
      super();
        tables = new TreeMap<>(); // Ordre Alphabetique
    }

    @Override
    public boolean ajouter(Employe e, List<Long> numeros) {
        if (!tables.containsKey(e)){
            tables.put(e, numeros);
            return true;
        }
        return false;
    }

    @Override
    public void ajouterNumero(Employe e, long numero) {
        if (tables.containsKey(e)){
            tables.get(e).add(numero);
        }
    }

    @Override
    public void retirerNumero(Employe e, long numero) {
        if(tables.containsKey(e)){
            tables.get(e).remove(numero);
        }
    }

    @Override
    public void supprimer(Employe e) {
            tables.remove(e);
    }

    @Override
    public List<Long> getNumeros(Employe e) {
        return tables.get(e);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Employe, List<Long>> entry : tables.entrySet()) {
            sb.append(entry.getKey())
                    .append(" → ")
                    .append(entry.getValue())
                    .append('\n');
        }
        return sb.toString();
    }
}
