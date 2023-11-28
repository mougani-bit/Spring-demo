package fr.diginamic.demospring;

import java.util.List;

public interface VilleService {
    List<Ville> extractVilles();
    Ville extractVille(int idVille);
    Ville extractVille(String nom);
    List<Ville> insertVille(Ville ville);
    List<Ville> modifierVille(int idVille, Ville villeModifiee);
    List<Ville> supprimerVille(int idVille);
}
