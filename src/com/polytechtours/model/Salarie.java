package com.polytechtours.model;

public class Salarie extends Employe {
    private double salaireFixe;

    public Salarie(String nom, String id, int anneeEmbauche, double salaireFixe) {
        super(nom, id, anneeEmbauche);
        setSalaireFixe(salaireFixe);
    }

    public double getSalaireFixe() {
        return salaireFixe;
    }

    public void setSalaireFixe(double salaireFixe) {
        if (salaireFixe <= 0) {
            throw new IllegalArgumentException("Le salaire doit être supérieur à 0.");
        }
        this.salaireFixe = salaireFixe;
    }

    @Override
    public double calculerSalaire() {
        return salaireFixe;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Salarié, Salaire: " + calculerSalaire();
    }
}
