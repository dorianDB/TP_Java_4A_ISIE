package com.polytechtours.model;
public class CarteAJouerV1 {
    private String couleur;

    private String valeur;

    private static final String[] COULEURS_VALIDES = {"PIQUE", "COEUR", "CARREAU", "TREFLE"};
    private static final String[] VALEURS_VALIDES = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
            "VALET", "DAME", "ROI", "AS"};

    public CarteAJouerV1(String coul, String val) {
        if (!couleurEstValide(coul)) {
            throw new IllegalArgumentException("Couleur invalide : " + coul);
        }
        if (!valeurEstValide(val)) {
            throw new IllegalArgumentException("Valeur invalide : " + val);
        }
        this.couleur = coul;
        this.valeur = val;
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
        for (String c : COULEURS_VALIDES) {
            if (c.equalsIgnoreCase(coul)) {
                return true;
            }
        }
        return false;
    }

    private static boolean valeurEstValide(String val) {
        for (String v : VALEURS_VALIDES) {
            if (v.equalsIgnoreCase(val)) {
                return true;
            }
        }
        return false;
    }


}