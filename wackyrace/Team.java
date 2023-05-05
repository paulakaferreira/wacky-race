package wackyrace;

import wackyrace.Runner;
import java.util.ArrayList;

public class Team {
    private String name;
    private int number;
    public ArrayList<Runner> runners = new ArrayList<Runner>(2);

    public Team(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void addRunner(Runner runner) {
        if (runners.size() > 2) {
            runners.add(runner);
        } else {
            System.out.println("L'équipe est limitée à deux coureurs");
        }
    }
}