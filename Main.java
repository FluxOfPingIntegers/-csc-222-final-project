import classes.src.Company;
import classes.src.Lobbyist;
import classes.src.Scenario;
import classes.src.Senator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        
        // Initialize Senator.
        Senator senator = new Senator("John Smith", 100.00, 5);

        Senator[] senators = {
            new Senator("Alvin Bobby", 1000.00, 20),
            new Senator("James Chesterfield", 10000.00, 50),
            new Senator("Jarold Lewis", 500.00, 15),
            new Senator("Martha Harris", 1000.00, 20),
            new Senator("Alyssa San-Marco", 9000.00, 25),
            new Senator("Beth Marriot", 10000.00, 45),
            new Senator("Rick Tilman", 500.00, 10),
            new Senator("Robert Cambell", 200.00, 3),
        };

        Lobbyist lobbyist1 = new Lobbyist("Lilith");
        Lobbyist lobbyist2 = new Lobbyist("Damien");
        Lobbyist lobbyist3 = new Lobbyist("Vlad");
        Lobbyist lobbyist4 = new Lobbyist("Luther");
        Lobbyist lobbyist5 = new Lobbyist("Pandora");
        Lobbyist lobbyist6 = new Lobbyist("Brim");

        new Company("McWeapons", lobbyist1);
        new Company("ACME-Weapons", lobbyist2);
        new Company("McTech", lobbyist3);
        new Company("ACME-Tech", lobbyist4);
        new Company("McBuilder", lobbyist5);
        new Company("ACME-Builder", lobbyist6);

        int turn = 1;
        boolean isReplay = false;

        while (!input.equalsIgnoreCase("q")) {
            System.out.println();
            System.out.println("NEW SCENARIO - (enter q to quit anytime)");
            Scenario scenario = new Scenario(senators, senator);
            String message = scenario.issue();
            System.out.println(message);
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n")) {
                scenario.resolve(input, isReplay);
            }
            senator.printStats();

            turn += 1;
            if (turn >= 9) {
                System.out.println("Time for reelection!");
                if (senator.getInfluence() < 50) {
                    System.out.println("Sorry you are not a Senate Star and have lost reelection!");
                    input = "q";
                } else {
                    System.out.println("You are a Senate Star!");
                    System.out.println("Would you like to run for reelection?");
                    System.out.println("Enter y for yes or n for no:");
                    input = scanner.nextLine();
                    boolean acceptAnswer = true;
                    while (acceptAnswer) {
                        if (input.equalsIgnoreCase("y")) {
                            System.out.println("Very well, lets redraw your voting district and go again!");
                            System.out.println("Also lets reinvest some of your earnings so no one cries scandal.");
                            System.out.println("Don't worry, Senators make money faster the longer they're in office.");
                            double dollars = senator.getMoney() - 100;
                            senator.subtractMoney(dollars);
                            acceptAnswer = false;
                            turn = 1;
                            isReplay = true;
                            break;
                        } else if (input.equalsIgnoreCase("n")) {
                            System.out.println("Very well, maybe someone in your family can run instead!");
                            acceptAnswer = false;
                            input = "q";
                            break;
                        } else {
                            System.out.println("Invalid input please select y to run again or n to retire.");
                            System.out.println("You can also simple type q to quit:");
                            input = scanner.nextLine();
                            if (input.equalsIgnoreCase("q")) {
                                acceptAnswer = false;
                                break;
                            }
                        }
                    }
                }
            }
        }
        
        System.out.println("Here are your current stats at the end of the game!");
        senator.printStats();
        System.out.println("Farewell!");
        scanner.close();
    }
}

