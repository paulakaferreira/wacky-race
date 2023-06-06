package wackyrace;

public class Circuit {
    private String nom;
    private String villeDepart;
    private String villeArrivee;
    private String pays;
    private int distance;

    public Circuit(String nom, String villeDepart, String villeArrivee, String pays, int distance) {
        this.nom = nom;
        this.villeDepart = villeDepart;
        this.villeArrivee = villeArrivee;
        this.pays = pays;
        this.distance = distance;
    }

    public String getNom() {
        return this.nom;
    }

    public String getVilleDepart() {
        return this.villeDepart;
    }

    public String getVilleArrivee() {
        return this.villeArrivee;
    }

    public String getPays() {
        return this.pays;
    }

    public int getDistance() {
        return this.distance;
    }

    public void setDistance(int distance) { // a voir si j'en ai besoin
        this.distance = distance;
    }

    public void afficherDetails() {
        System.out.println("Le circuit: " + nom);
        System.out.println("Ville de départ: " + villeDepart);
        System.out.println("Ville d'arrivée: " + villeArrivee);
        System.out.println("Pays: " + pays);
        System.out.println("Distance: " + distance + "km");
    }
}
