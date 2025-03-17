package com.polytechtours.model;
public class CompteBancaire {
    private String numeroCompte;
    private String titulaire;
    private double solde;
    private double decouvertAutorise;

    public CompteBancaire(String numeroCompte, String titulaire, double solde, double decouvertAutorise) {
        if (numeroCompte == null || numeroCompte.length() != 12) {
            throw new IllegalArgumentException("Le numéro de compte doit être une chaîne de 12 caractères.");
        }
        if (titulaire == null || titulaire.isBlank()) {
            throw new IllegalArgumentException("Le titulaire ne peut pas être null ou vide.");
        }
        if (solde < 0) {
            throw new IllegalArgumentException("Le solde initial doit être supérieur ou égal à 0.");
        }
        if (decouvertAutorise > 0) {
            throw new IllegalArgumentException("Le découvert autorisé doit être inférieur ou égal à 0.");
        }

        this.numeroCompte = numeroCompte;
        this.titulaire = titulaire;
        this.solde = solde;
        this.decouvertAutorise = decouvertAutorise;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void deposer(double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant du dépôt doit être positif.");
        }
        this.solde += montant;
        System.out.println("Dépôt de " + montant + " euros sur le compte num " + numeroCompte);
    }

    public void retirer(double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant du retrait doit être positif.");
        }
        if (solde - montant < decouvertAutorise) {
            throw new IllegalArgumentException("Fonds insuffisants pour effectuer ce retrait.");
        }
        this.solde -= montant;
        System.out.println("Retrait de " + montant + " euros du compte numéro " + numeroCompte);
    }

    public void virer(double montant, CompteBancaire compteCible) {
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant du virement doit être positif.");
        }
        if (solde - montant < decouvertAutorise) {
            throw new IllegalArgumentException("Fonds insuffisants pour effectuer ce virement.");
        }
        this.retirer(montant);
        compteCible.deposer(montant);
        System.out.println("Virement de " + montant + " euros du compte num " + numeroCompte + " vers le compte numéro " + compteCible.getNumeroCompte());
    }

    public void afficherSolde() {
        System.out.println("Solde du compte num " + numeroCompte + " : " + solde + " euros");
    }

    @Override
    public String toString() {
        return "Compte bancaire : " +
                "numeroCompte='" + numeroCompte + '\'' +
                ", titulaire='" + titulaire + '\'' +
                ", solde=" + solde +
                ", decouvertAutorise=" + decouvertAutorise;
    }
}