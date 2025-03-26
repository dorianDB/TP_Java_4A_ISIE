package com.polytechtours.model;

public class Mammifere extends Animal {
    protected int nbMamelles;
    public Mammifere(String nom) {
        super(nom);
    }
    public Mammifere(String nom, Sexe sexe) {
        super(nom, sexe);
    }

    @Override
    public String toString(){
        return super.toString() + " Je suis un mammifère.";
    }
}
