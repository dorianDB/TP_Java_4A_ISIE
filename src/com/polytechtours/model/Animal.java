package com.polytechtours.model;

public class Animal {

    public static int nbAnimals;
    private String nom;

    public enum Sexe {
        MASCULIN, FEMININ, NEUTRE, INDETERMINE
    }

    protected Sexe sexe;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Animal(String nom) {
        if(nom.isEmpty() || nom == null) {
            throw new IllegalArgumentException("Le nom ne peut pas être null ou vide.");
        }
        this.nom = nom;
        nbAnimals++;
    }

    public Animal(String nom, Sexe sexe) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom ne peut pas être null ou vide.");
        }
        if(sexe == null){
            throw new IllegalArgumentException("Le sexe ne peut pas être null.");
        }
        this.nom = nom;
        this.sexe = sexe;
        nbAnimals++;
    }

    @Override
    public String toString(){
        return "Je suis un animal de nom " + nom + " et de sexe " + sexe + ".";
    }
}
