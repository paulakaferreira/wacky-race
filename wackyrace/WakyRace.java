package wackyrace;

import java.util.Scanner;
import java.util.ArrayList;

public class WakyRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the team's name and number
        System.out.println("Enter the team's name:");
        String teamName = scanner.nextLine();
        // To do: make teamNumber random
        int teamNumber = 0;
        // Create a new team
        Team team = new Team(teamName, teamNumber);
    }
}
