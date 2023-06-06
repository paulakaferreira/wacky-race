package wackyrace;

import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;


public class Course {
    private Date dateCourse;
    private ArrayList<Equipe> equipes;
    private Circuit circuit;
    private CountDownLatch latch;


    public Course(Date dateCourse, ArrayList<Equipe> equipes, Circuit circuit) {
        this.dateCourse = dateCourse;
        this.equipes = equipes;
        this.circuit = circuit;
    }

    public void demarrer() {
        System.out.println("La course démarre !");
        System.out.println("---------------------------");
        competition();
    }

    public void terminer() {
        System.out.println("La course se termine !");
    }

    public Date getDateCourse() {
        return this.dateCourse;
    }

    public ArrayList<Equipe> getEquipes() {
        return this.equipes;
    }

    public Circuit getCircuit() {
        return this.circuit;
    }

    public void competition() {
        latch = new CountDownLatch(equipes.size());

        System.out.println("Équipes :");
        for (Equipe equipe : equipes) {
            System.out.println(equipe.getNom());
        }
        System.out.println("---------------------------");


        for (Equipe equipe : equipes) {
            equipe.setLatch(latch);
            equipe.demarrer();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        terminer();
        System.out.println("Classement final :");
        Map<Date, Equipe> classement = new TreeMap<>();
        for (Equipe equipe : equipes) {
            classement.put(equipe.getHeureArrivee(), equipe);
        }
        int position = 1;
        for (Equipe equipe : classement.values()) {
            System.out.println(position + ". Équipe : " + equipe.getNom() + " - Heure d'arrivée : " + equipe.getHeureArrivee());
            position++;
        }
    }
}
