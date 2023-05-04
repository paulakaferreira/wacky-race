package wackyrace;

import wackyrace.Runner;
import java.util.ArrayList;

public class Team {
    private String name;
    private int number;
    public ArrayList<Runner> runners = new ArrayList<Runner>();

    public Team(String name, int number) {
        this.name = name;
        this.number = number;
    }
}