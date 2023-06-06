package wackyrace;

public class Main {
    public static void main(String[] args) {
        Avion avion = new Avion("Airbus A380");
        Bateau bateau = new Bateau("Queen Mary 2");
        Voiture voiture = new Voiture("Tesla Model S");

        avion.demarrer();
        System.out.println("Distance parcourue par l'avion: " + avion.getDistance() + " km");
        avion.avancer();
        System.out.println("Distance parcourue par l'avion: " + avion.getDistance() + " km");
        avion.arreter();

        System.out.println();

        bateau.demarrer();
        System.out.println("Distance parcourue par le bateau: " + bateau.getDistance() + " km");
        bateau.avancer();
        System.out.println("Distance parcourue par le bateau: " + bateau.getDistance() + " km");
        bateau.arreter();

        System.out.println();

        voiture.demarrer();
        System.out.println("Distance parcourue par la voiture: " + voiture.getDistance() + " km");
        voiture.avancer();
        System.out.println("Distance parcourue par la voiture: " + voiture.getDistance() + " km");
        voiture.arreter();
    }
}

