package com.polytechtours;

import com.polytechtours.model.*;

import com.polytechtours.model.Animal.Sexe;
import static com.polytechtours.model.Animal.nbAnimals;


public class Main {
    public static void main(String[] args) {
        /*
        Person p1 = new Person();
        p1.setName("Smith");
        p1.setForeName("Jane");
        p1.setAge(21);
        p1.setPolytechStudent(true);

        System.out.println("Je suis " + p1.getForeName() + " " + p1.getName() + ", j'ai " + p1.getAge() + " ans. ");
        if (p1.isPolytechStudent())
            System.out.println("Je suis étudiant(e) de Polytech.");
        else
            System.out.println("Je ne suis pas étudiant(e) de Polytech.");

        p1.addOneYearToAge();
        System.out.println("Je suis " + p1.getForeName() + " " + p1.getName() + ", j'ai " + p1.getAge() + " ans. ");

        Circle circle = new Circle(34F, 12.3f, 18);
        circle.printMe();

        Rectangle rectangle = new Rectangle(0, 0, 2, 3);
        rectangle.printMe();

        try {
            CarteAJouerV1 carte4 = new CarteAJouerV1("BLEU", "ROI");
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        try {
            CarteAJouerV1 carte5 = new CarteAJouerV1("PIQUE", "15");
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }


        String s1 = "toto";
        String s2 = "toto";

        boolean result1 = s1 == s2;

        System.out.println("Result avec s1 == s2 : " + result1);

        String s3 = new String("toto");

        boolean result2 = s1 == s3;

        System.out.println("Result avec s1 == s3 : " + result2);

        boolean resultEquals1 = s1.equals(s2);

        System.out.println("Result avec s1 equals s2 : " + resultEquals1);

        boolean resultEquals2 = s1.equals(s3);

        System.out.println("Result avec s1 equals s3 : " + resultEquals2);

        System.out.println("S1 : " + s1 + "\nS2 : " + s2 + "\nS3 : " + s3);
        */
//        CompteBancaire compte1 = new CompteBancaire("37F458FES901", "Dorian Brisson", 2500, -500);
//        CompteBancaire compte2 = new CompteBancaire("37F458FES817", "Victor Rivet", 1500, -300);
//
//        System.out.println(compte1);
//        System.out.println(compte2);
//
//        compte1.deposer(500);
//        compte1.afficherSolde();
//
//        compte1.virer(500, compte2);
//
//        compte1.afficherSolde();
//        compte2.afficherSolde();


        /*
        try {
            Heure heure1 = new Heure(14, 30);
            System.out.println("Heure initiale : " + heure1);

            heure1.setHeuresMinutes(15, 10);
            System.out.println("Heure après modification : " + heure1);

            try {
                heure1.setHeuresMinutes(-34, 72);
            } catch (Exception e) {
                System.out.println("Erreur détectée : " + e.getMessage());
            }

            heure1.avancerMinutes(120);
            System.out.println("Heure après avancer de 120 minutes : " + heure1);

            heure1.avancerMinutes(-(48*60));
            System.out.println("Heure après reculer de 59 minutes : " + heure1);
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }*/

        Employe salarie = new Salarie("Jane Doe", "F439", 2010, 3200.0);
        Employe freelance = new Freelance("John Smith", "H051", 2022, 120, 25.5);

        System.out.println(salarie);
        System.out.println(freelance);

        Animal[] animaux = new Animal[5];
        animaux[0] = new Animal("Rex", Sexe.MASCULIN);
        animaux[1] = new Mammifere("Médor", Sexe.INDETERMINE);
        animaux[2] = new Humain("Jacques", Sexe.MASCULIN);
        animaux[3] = new Vache("Noiraude", Sexe.FEMININ);
        animaux[4] = new Vache("Gnnnnn", Sexe.NEUTRE);
        for(Animal animal : animaux)
            System.out.println(animal);
        System.out.println("Nombre d'animaux : " + nbAnimals);
    }
}
