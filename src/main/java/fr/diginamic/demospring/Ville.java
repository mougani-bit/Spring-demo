package fr.diginamic.demospring;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ville {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String codeDept;
    private int nbHabitants;

    public Ville() {
    }

    public Ville(String nom, String codeDept, int nbHabitants) {
        this.nom = nom;
        this.codeDept = codeDept;
        this.nbHabitants = nbHabitants;
    }



    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getCodeDept() {
        return codeDept;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCodeDept(String codeDept) {
        this.codeDept = codeDept;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }
}
