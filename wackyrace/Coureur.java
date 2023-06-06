package wackyrace;

public class Coureur {
    private String nom;
    private int age;
    private String espece;
    private String qualificatif;

    public Coureur(String nom, int age, String espece, String qualificatif) {
        this.nom = nom;
        this.age = age;
        this.espece = espece;
        this.qualificatif = qualificatif;
    }

    public String getNom() {
        return this.nom;
    }

    public int getAge() {
        return this.age;
    }

    public String getEspece() {
        return this.espece;
    }

    public String getQualificatif() {
        return this.qualificatif;
    }

    public void afficherDetails() {
        System.out.println("Coureur " + this.nom);
        System.out.println("Age: " + this.age);
        System.out.println("Espèce: " + this.espece);
        System.out.println("Qualificatif: " + this.qualificatif);
    }
}
