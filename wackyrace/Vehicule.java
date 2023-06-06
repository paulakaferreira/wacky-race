package wackyrace;

import java.util.Random;

abstract class Vehicule {
    private String nom;
    protected int distance;

    public Vehicule(String nom) {
        this.nom = nom;
        this.distance = 0;
    }

    public abstract void demarrer();
    public abstract void avancer();
    public abstract void arreter();

    public String getNom() {
        return this.nom;
    }

    public int getDistance() {
        return this.distance;
    }

    public void incrementerDistance(int increment) {
        this.distance += increment;
    }

    public int genererDistanceAleatoire() {
        Random aleatoire = new Random();
        return aleatoire.nextInt(10) + 1;
    }
}

class Avion extends Vehicule {
    private static final int NOMBRE_AILES = 2;
    private static final int NOMBRE_MOTEURS = 2;


    public Avion(String nom) {
        super(nom);
    }

    @Override
    public void demarrer() {
        System.out.println("L'avion " + super.getNom() + " décolle");
        super.distance = 0;
    }

    @Override
    public void avancer() {
        System.out.println("L'avion " + super.getNom() + " vole");
        super.incrementerDistance(super.genererDistanceAleatoire());
    }

    @Override
    public void arreter() {
        System.out.println("L'avion " + super.getNom() + " atterit");
    }

    public int getNombreAiles() {
        return NOMBRE_AILES;
    }

    public int getNombreMoteurs() {
        return NOMBRE_MOTEURS;
    }
}

class Bateau extends Vehicule {
    private int nombreVoiles;
    private static final int NOMBRE_MOTEURS = 1;

    public Bateau(String nom) {
        super(nom);
    }

    @Override
    public void demarrer() {
        System.out.println("Le bateau " + super.getNom() + " allume son moteur et hisse ses voiles");
        super.distance = 0;
    }

    @Override
    public void avancer() {
        System.out.println("Le bateau " + super.getNom() + " navigue en zigzagant le vent");
        super.incrementerDistance(super.genererDistanceAleatoire());
    }

    @Override
    public void arreter() {
        System.out.println("Le bateau " + super.getNom() + " jette l'ancre");
    }

    public int getNombreVoiles() {
        return nombreVoiles;
    }

    public int getNombreMoteurs() {
        return NOMBRE_MOTEURS;
    }
}

class Voiture extends Vehicule {
    private int nombreRoues;
    private static final int NOMBRE_MOTEURS = 1;

    public Voiture(String nom) {
        super(nom);
    }

    @Override
    public void demarrer() {
        System.out.println("Clef de contact inserée. La voiture " + super.getNom() + " démarre");
        super.distance = 0;
    }

    @Override
    public void avancer() {
        System.out.println("La voiture " + super.getNom() + " roule sur la route");
        super.incrementerDistance(super.genererDistanceAleatoire());
    }

    @Override
    public void arreter() {
        System.out.println("Frein à main activé ! Arrêt de la voiture " + super.getNom());
    }

    public int getNombreRoues() {
        return nombreRoues;
    }

    public int getNombreMoteurs() {
        return NOMBRE_MOTEURS;
    }
}