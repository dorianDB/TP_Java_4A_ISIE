package com.polytechtours.model;

public class Humain extends Mammifere {
    public Humain(String nom) {
        super(nom);
    }

    public Humain(String nom, Sexe sexe) {
        super(nom, sexe);
        this.nbMamelles = 2;
    }

    @Override
    public String toString(){
        return super.toString() + " Je suis un humain.";
    }
}
