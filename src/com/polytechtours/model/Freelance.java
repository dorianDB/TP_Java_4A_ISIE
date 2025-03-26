package com.polytechtours.model;
public class Freelance extends Employe {
    private int heuresTravaillees;
    private double tauxHoraire;

    public Freelance(String nom, String id, int anneeEmbauche, int heuresTravaillees, double tauxHoraire) {
        super(nom, id, anneeEmbauche);
        setHeuresTravaillees(heuresTravaillees);
        setTauxHoraire(tauxHoraire);
    }

    public int getHeuresTravaillees() {
        return heuresTravaillees;
    }

    public void setHeuresTravaillees(int heuresTravaillees) {
        if (heuresTravaillees < 0) {
            throw new IllegalArgumentException("Nombre d'heures invalide.");
        }
        this.heuresTravaillees = heuresTravaillees;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        if (tauxHoraire <= 0) {
            throw new IllegalArgumentException("Taux horaire invalide.");
        }
        this.tauxHoraire = tauxHoraire;
    }

    @Override
    public double calculerSalaire() {
        return heuresTravaillees * tauxHoraire;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Freelance, Salaire: " + calculerSalaire();
    }
}
