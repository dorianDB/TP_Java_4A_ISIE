package com.polytechtours.model;

import static java.lang.Math.PI;

public class Circle {
    private float x;
    private float y;
    private float rayon;

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

    public float getRayon() {
        return rayon;
    }

    public void setRayon(float rayon) {
        this.rayon = rayon;
    }

    public float calculateDiameter(){
        return rayon*rayon;
    }

    public Circle() {
        this.x = 0;
        this.y = 0;
        rayon = 2;
    }

    public Circle(float x, float y, float rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public float calculatePerimeter(){
        return (float) (PI*rayon);
    }

    public float calculateSurface(){
        return (float) (PI*rayon*rayon);
    }

    public void printMe(){
        System.out.println("Je suis un cercle dont voici les caractéristiques : ");
        System.out.println("cordonnées de mon centre : ("+getX()+", "+getY()+")");
        System.out.println("rayon : "+getRayon());
        System.out.println("périmètre : "+calculatePerimeter());
        System.out.println("surface : "+calculateSurface());
    }
}
