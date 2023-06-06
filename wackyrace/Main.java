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

        Circuit circuit = new Circuit("Circuit A", "Paris", "Berlin", "France", 50);

        System.out.println("Circuit Name: " + circuit.getNom());
        System.out.println("Departure City: " + circuit.getVilleDepart());
        System.out.println("Arrival City: " + circuit.getVilleArrivee());
        System.out.println("Country: " + circuit.getPays());
        System.out.println("Distance: " + circuit.getDistance() + " km");

        // Coureur coureur = new Coureur("John Doe", 25, "Humain", "beau gosse");

        //System.out.println("Nom: " + coureur.getNom());
        //System.out.println("Age: " + coureur.getAge());
        //System.out.println("Espèce: " + coureur.getEspece());
        //System.out.println("Qualificatif: " + coureur.getQualificatif());

        Coureur coureur1 = new Coureur("Alice", 25, "Humain", "Beau gosse");
        Coureur coureur2 = new Coureur("Bob", 28, "Mort vivant", "Sournois");

        Vehicule vehicule = new Voiture("Huyndai HB20");

        Coureur[] coureurs = {coureur1, coureur2};
        Equipe equipe = new Equipe("AliceBob", 1, coureurs, vehicule, circuit);

        equipe.demarrer();

        try {
            equipe.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Distance parcourue: " + equipe.getDistanceParcourue());
        System.out.println("Heure d'arrivée: " + equipe.getHeureArrivee());
    }
}

