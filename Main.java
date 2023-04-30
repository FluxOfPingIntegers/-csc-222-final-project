import classes.src.Company;
import classes.src.Lobbyist;
import classes.src.Scenario;
import classes.src.Senator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        // Create a new company with two employees (lobbyists).
        Lobbyist[] employees = {new Lobbyist("John Smith", null), new Lobbyist("Jane Doe", null)};
        Company company = new Company("Acme Corporation", employees, null);
        
        // Create a new lobbyist.
        Lobbyist lobbyist = new Lobbyist("Bob Johnson", company);

        // Create ArrayLists for Lobbyists and Companies in order to initialize Senator.
        // ArrayList<Lobbyist> lobbyists = {lobbyist};
        // ArrayList<Company> companies = {company};
        
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

        while (!input.equals("q")) {
            Scenario scenario = new Scenario(company, senators);
            System.out.println("Enter a command (q to quit): ");
            String message = scenario.issue();
            System.out.println(message);
            input = scanner.nextLine();
            
            // Do something based on the user's input
            // ...
            String senatorName = senator.getName();
            String lobbyistName = lobbyist.getName();

            System.out.println("The senator name is: " + senatorName + " " + "The lobbyist name is: " + lobbyistName);
        }
        
        System.out.println("Farewell!");
        scanner.close();
    }
}

