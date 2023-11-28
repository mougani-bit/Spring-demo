package fr.diginamic.demospring;

import java.util.ArrayList;

public class TestVilles {

    public static void main(String[] args) {
        // Créer une ArrayList de villes
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        // Reste du code inchangé...
    }

    private static Ville trouverVillePlusPeuplee(ArrayList<Ville> villes) {
        Ville villePlusPeuplee = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbHabitants() > villePlusPeuplee.getNbHabitants()) {
                villePlusPeuplee = ville;
            }
        }
        return villePlusPeuplee;
    }

    private static Ville trouverVilleMoinsPeuplee(ArrayList<Ville> villes) {
        Ville villeMoinsPeuplee = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbHabitants() < villeMoinsPeuplee.getNbHabitants()) {
                villeMoinsPeuplee = ville;
            }
        }
        return villeMoinsPeuplee;
    }
}
