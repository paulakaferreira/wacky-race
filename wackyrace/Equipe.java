package wackyrace;

public class Equipe {
    private String nom;
    private int numero;
    private Coureur[] coureurs;
    private Vehicule vehicule;

    public Equipe(String nom, int numero, Coureur[] coureurs, Vehicule vehicule) {
        if (coureurs == null || coureurs.length < 1 || coureurs.length > 2) {
            throw new IllegalArgumentException("Une équipe doit avoir de 1 à 2 coureurs.");
        }
        this.nom = nom;
        this.numero = numero;
        this.coureurs = coureurs;
        this.vehicule = vehicule;
    }

    public void demarrer() {
        System.out.println("L'équipe " + nom + " (#" + numero + ") démarre la course.");
        vehicule.demarrer();
        for (Coureur coureur : coureurs) {
            System.out.println("Le coureur " + coureur.getNom() + " démarre le véhicule.");
        }
    }

    public void avancer() {
        System.out.println("L'équipe " + nom + " (#" + numero + ") avance dans son véhicule.");
        vehicule.avancer();
    }

    public void arreter() {
        System.out.println("L'équipe " + nom + " (#" + numero + ") arrête le véhicule.");
        vehicule.arreter();
        for (Coureur coureur : coureurs) {
            System.out.println("Le coureur " + coureur.getNom() + " descend du véhicule.");
        }
    }

    public String getNom() {
        return nom;
    }

    public int getNumero() {
        return numero;
    }

    public Coureur[] getCoureurs() {
        return coureurs;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }
}
