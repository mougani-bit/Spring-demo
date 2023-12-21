package fr.diginamic.demospring.services;

import jakarta.persistence.*;

@Entity
public class Ville {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @ManyToOne
    @JoinColumn(name = "departement_id")
    private Departement departement;

    public Ville() {
    }

    public Ville(String nom, Departement departement) {
        this.nom = nom;
        this.departement = departement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
}
