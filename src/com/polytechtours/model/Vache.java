package com.polytechtours.model;

public class Vache extends Mammifere {
    public Vache(String nom) {
        super(nom);
    }

    public Vache(String nom, Sexe sexe) {
        super(nom, sexe);
        this.nbMamelles = 4;
    }

    @Override
    public String toString(){
        return super.toString() + " Je suis une vache.";
    }
}
