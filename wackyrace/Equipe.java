package wackyrace;

import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.Random;

public class Equipe extends Thread {
    private String nom;
    private int numero;
    private Coureur[] coureurs;
    private Vehicule vehicule;
    private Circuit circuit;
    private Date heureArrivee;
    private int distanceParcourue;
    private CountDownLatch latch;

    public Equipe(String nom, int numero, Coureur[] coureurs, Vehicule vehicule, Circuit circuit) {
        if (coureurs == null || coureurs.length < 1 || coureurs.length > 2) {
            throw new IllegalArgumentException("Une équipe doit avoir de 1 à 2 coureurs.");
        }
        this.nom = nom;
        this.numero = numero;
        this.coureurs = coureurs;
        this.vehicule = vehicule;
        this.heureArrivee = null;
        this.distanceParcourue = 0;
        this.circuit = circuit;
    }

    @Override
    public void run() {
        while (this.distanceParcourue < circuit.getDistance()) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            avancer();
            if (this.distanceParcourue >= circuit.getDistance()){
                mauvais_coup();
            }
        }
        arreter();
        this.heureArrivee = new Date();
        latch.countDown();
    }

    public void demarrer() {
        Thread demarrerEquipeThread = new Thread(this);
        for (Coureur coureur : coureurs) {
            System.out.println("Le coureur " + coureur.getNom() + " monte dans le véhicule.");
        }
        System.out.println("Les équipiers de l'équipe " + this.nom + " (#" + this.numero + ") démarrent le véhicule: " +  vehicule.getNom());
        demarrerEquipeThread.start();
        vehicule.demarrer();
    }

    public void avancer() {
        System.out.println("L'équipe " + this.nom + " (#" + this.numero + ") avance dans son véhicule " + vehicule.getNom() + ".");
        vehicule.avancer();
        this.distanceParcourue += vehicule.getDistance();
        System.out.println(vehicule.getNom() + " est à " + this.distanceParcourue + "km");
    }

    public void arreter() {
        System.out.println("L'équipe " + this.nom + " (#" + this.numero + ") arrête le véhicule " +  vehicule.getNom());
        vehicule.arreter();
        for (Coureur coureur : coureurs) {
            System.out.println("Le coureur " + coureur.getNom() + " descend du véhicule.");
        }
    }

    public void mauvais_coup() {
        Random random = new Random();
        int randomDistance = random.nextInt(10) + 1;
        int randomEquipe = random.nextInt(2);

        if (randomEquipe < coureurs.length) {
            System.out.println("L'équipe " + this.nom + " (#" + this.numero + ") a subi un mauvais coup et recule de " + randomDistance + "km.");
            this.distanceParcourue -= randomDistance;
            System.out.println(vehicule.getNom() + " a reculé " + randomDistance + "km");
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

    public Circuit getCircuit() {
        return circuit;
    }

    public int getDistanceParcourue() {
        return distanceParcourue;
    }

    public Date getHeureArrivee() {
        return heureArrivee;
    }

    public void setLatch(CountDownLatch latch) {
        this.latch = latch;
    }
}
