package wackyrace;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Véhicules disponibles
        Vehicule vehicule1 = new Voiture("Huyndai HB20");
        Vehicule vehicule2 = new Avion("Airbus 360");
        Vehicule vehicule3 = new Bateau("Queen Mary 2");

        // Création du circuit
        Circuit circuit = new Circuit("Circuit Sud", "Paris - Gare de Lyon", "Nice", "France", 50);

        // Creéation première équipe
        Coureur coureur1 = new Coureur("Alice", 25, "Humain", "Beau gosse");
        Coureur coureur2 = new Coureur("Bob", 28, "Mort vivant", "Sournois");
        Coureur[] coureurs12 = {coureur1, coureur2};
        Equipe equipe1 = new Equipe("AliceBob", 1, coureurs12, vehicule1, circuit);

        // Création deuxième équipe
        Coureur coureur3 = new Coureur("Jon Doe", 35, "Humain", "Bûcheron");
        Coureur[] coureurs3 = {coureur3};
        Equipe equipe2 = new Equipe("JonSolo", 2, coureurs3, vehicule2, circuit);

        // Création troisième équipe
        Coureur coureur4 = new Coureur("Teddy", 2, "Chien", "Diabolique");
        Coureur coureur5 = new Coureur("Picker", 2, "Chien", "Diabolique");
        Coureur[] coureurs45 = {coureur4, coureur5};
        Equipe equipe3 = new Equipe("Teddy Picker", 3, coureurs45, vehicule3, circuit);

        // Liste les équipes
        ArrayList<Equipe> equipes = new ArrayList<>();
        equipes.add(equipe1);
        equipes.add(equipe2);
        equipes.add(equipe3);

        // Création de la course
        Date dateCourse = new Date();
        Course course = new Course(dateCourse, equipes, circuit);

        // Commence la course
        course.demarrer();
    }
}

