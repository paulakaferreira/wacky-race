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
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String getEspece() {
        return espece;
    }

    public String getQualificatif() {
        return qualificatif;
    }
}
