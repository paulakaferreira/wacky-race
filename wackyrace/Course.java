package wackyrace;

import java.util.ArrayList;
import java.util.Date;

public class Course {
    private Date dateCourse;
    private ArrayList<String> equipes;
    private Circuit circuit;

    public Course(Date dateCourse, ArrayList<String> equipes, Circuit circuit) {
        this.dateCourse = dateCourse;
        this.equipes = equipes;
        this.circuit = circuit;
    }

    public void demarrer() {
        System.out.println("La course démarre !");
    }

    public void terminer() {
        System.out.println("La course se termine !");
    }

    public Date getDateCourse() {
        return this.dateCourse;
    }

    public ArrayList<String> getEquipes() {
        return this.equipes;
    }

    public Circuit getCircuit() {
        return this.circuit;
    }
}
