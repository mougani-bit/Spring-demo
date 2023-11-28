package fr.diginamic.demospring;

import java.util.List;

public class TestVilles {

    public static void main(String[] args) {
        // Créer une instance de VilleService (si vous l'avez implémentée)
        VilleService villeService = new VilleService() {
            @Override
            public List<Ville> extractVilles() {
                return null;
            }

            @Override
            public List<Ville> insertVille(Ville ville) {
                return null;
            }

            @Override
            public List<Ville> modifierVille(int idVille, Ville villeModifiee) {
                return null;
            }

            @Override
            public List<Ville> supprimerVille(int idVille) {
                return null;
            }

            @Override
            public Ville trouverVilleMoinsPeuplee() {
                return null;
            }

            @Override
            public Ville trouverVillePlusPeuplee() {
                return null;
            }
        };

        // Création villes à la base de données
        ajouterVilles(villeService);

        // Affichage des villes de la liste
        List<Ville> villes = villeService.extractVilles();
        afficherVilles(villes);

        // la ville la plus peupléegitgit
        Ville villePlusPeuplee = villeService.trouverVillePlusPeuplee();
        System.out.println("La ville la plus peuplée est : " + villePlusPeuplee.getNom());

        //  la ville la moins peuplée
        Ville villeMoinsPeuplee = villeService.trouverVilleMoinsPeuplee();
        System.out.println("La ville la moins peuplée est : " + villeMoinsPeuplee.getNom());
    }

    private static void ajouterVilles(VilleService villeService) {
        villeService.insertVille(new Ville("Nice", "06", 343000));
        villeService.insertVille(new Ville("Carcassonne", "11", 47800));
        villeService.insertVille(new Ville("Narbonne", "11", 53400));
        // Ajoutez d'autres villes selon vos besoins
    }

    private static void afficherVilles(List<Ville> villes) {
        System.out.println("Liste des villes :");
        for (Ville ville : villes) {
            System.out.println(ville.getNom() + ", " + ville.getNbHabitants() + " hab.");
        }
    }
}
