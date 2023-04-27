import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = "";

    // Create a new company with two employees (lobbyists)
    Lobbyist[] employees = {new Lobbyist("John Smith", null), new Lobbyist("Jane Doe", null)};
    Company company = new Company("Acme Corporation", employees, null);
    
    // Create a new lobbyist
    Lobbyist lobbyist = new Lobbyist("Bob Johnson", company);
    
    // Create a new senator
    Senator senator = new Senator("John Smith", 10000.0, 5, new Company[]{company}, new Lobbyist[]{lobbyist});

    while (!input.equals("q")) {
        System.out.print("Enter a command (q to quit): ");
        input = scanner.nextLine();
        
        // Do something based on the user's input
        // ...
    }
    
    System.out.println("Farewell!");
}
