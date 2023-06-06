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

        Circuit circuit = new Circuit("Circuit A", "Paris", "Berlin", "France", 1000);

        System.out.println("Circuit Name: " + circuit.getNom());
        System.out.println("Departure City: " + circuit.getVilleDepart());
        System.out.println("Arrival City: " + circuit.getVilleArrivee());
        System.out.println("Country: " + circuit.getPays());
        System.out.println("Distance: " + circuit.getDistance() + " km");

        Coureur coureur = new Coureur("John Doe", 25, "Humain", "beau gosse");

        System.out.println("Nom: " + coureur.getNom());
        System.out.println("Age: " + coureur.getAge());
        System.out.println("Espèce: " + coureur.getEspece());
        System.out.println("Qualificatif: " + coureur.getQualificatif());
    }
}

