package com.polytechtours.model;

public class Rectangle {

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getLargeur() {
        return largeur;
    }

    public Rectangle(float y, float x, float largeur, float hauteur) {
        this.y = y;
        this.x = x;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public float getHauteur() {
        return hauteur;
    }

    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }

    private float x,y;
    private float largeur;
    private float hauteur;

    public float calculatePerimeter() {
        return (largeur + hauteur)*2;
    }

    public float calculateArea() {
        return largeur * hauteur;
    }

    public void printMe() {
        System.out.println("Je suis un rectangle dont voici les caractéristiques : " +
                "\ncoordonnées de mon coin inférieur gauche : (" + getX() + ", " + getY() + ") " +
                "\nlargeur : " + getLargeur() +
                "\nhauteur : " + getHauteur() +
                "\npérimètre : " + calculatePerimeter() +
                "\nsurface : " + calculateArea());
    }
}
