package com.polytechtours.model;

import java.util.regex.Pattern;
import java.time.Year;

public abstract class Employe {
    private String nom;
    private String id;
    private int anneeEmbauche;

    private static final Pattern ID_PATTERN = Pattern.compile("^[A-Z]\\d{3}$");

    public Employe(String nom, String id, int anneeEmbauche) {
        setNom(nom);
        setId(id);
        setAnneeEmbauche(anneeEmbauche);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom == null || nom.isEmpty()) {
            throw new IllegalArgumentException("Nom invalide");
        }
        this.nom = nom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (!ID_PATTERN.matcher(id).matches()) {
            throw new IllegalArgumentException("ID invalide. Format attendu : une majuscule et 3 chiffres (ex: F439)");
        }
        this.id = id;
    }

    public int getAnneeEmbauche() {
        return anneeEmbauche;
    }

    public void setAnneeEmbauche(int anneeEmbauche) {
        int anneeCourante = Year.now().getValue();
        if (anneeEmbauche < 1950 || anneeEmbauche > anneeCourante) {
            throw new IllegalArgumentException("Année d'embauche invalide");
        }
        this.anneeEmbauche = anneeEmbauche;
    }

    public abstract double calculerSalaire();

    @Override
    public String toString() {
        return "Nom: " + nom + ", ID: " + id + ", Année d'embauche: " + anneeEmbauche;
    }
}
