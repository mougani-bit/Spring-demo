package fr.diginamic.demospring;

import java.util.List;

public interface VilleService {
    List<Ville> extractVilles();

    default Ville extractVille(int idVille) {
        return null;
    }

    default Ville extractVille(String nom) {
        return null;
    }

    List<Ville> insertVille(Ville ville);
    List<Ville> modifierVille(int idVille, Ville villeModifiee);
    List<Ville> supprimerVille(int idVille);

    Ville trouverVilleMoinsPeuplee();

    Ville trouverVillePlusPeuplee();
}
