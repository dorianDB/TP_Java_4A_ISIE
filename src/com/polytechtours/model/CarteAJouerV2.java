package com.polytechtours.model;

public class CarteAJouerV2 {
    private String couleur;
    private String valeur;

    private enum COULEURS_VALIDES {
        PIQUE, COEUR, CARREAU, TREFLE
    }

    private enum VALEURS_VALIDES {
        DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI, AS
    }

    public CarteAJouerV2(String coul, String val) {
        if (!couleurEstValide(coul)) {
            throw new IllegalArgumentException("Couleur invalide : " + coul);
        }
        if (!valeurEstValide(val)) {
            throw new IllegalArgumentException("Valeur invalide : " + val);
        }
        this.couleur = coul.toUpperCase();
        this.valeur = val.toUpperCase();
    }

    public String getValeur() {
        return valeur;
    }

    public String getCouleur() {
        return couleur;
    }

    @Override
    public String toString() {
        return valeur + " de " + couleur;
    }

    private static boolean couleurEstValide(String coul) {
        try {
            COULEURS_VALIDES.valueOf(coul.toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    private static boolean valeurEstValide(String val) {
        try {
            VALEURS_VALIDES.valueOf(val.toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}