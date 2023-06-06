package wackyrace;

public class Main {
    public static void main(String[] args) {
        Avion avion = new Avion("Airbus A380");
        Bateau bateau = new Bateau("Queen Mary 2");
        Voiture voiture = new Voiture("Tesla Model S");

        avion.demarrer();
        avion.avancer();
        avion.arreter();

        System.out.println();

        bateau.demarrer();
        bateau.avancer();
        bateau.arreter();

        System.out.println();

        voiture.demarrer();
        voiture.avancer();
        voiture.arreter();
    }
}

