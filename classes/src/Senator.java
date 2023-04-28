package classes.src;

import java.util.ArrayList;
import classes.src.Company;
import classes.src.Lobbyist;

public class Senator {
    private String name;
    private double money;
    private int influence;
    private ArrayList<Company> companies;
    private ArrayList<Lobbyist> lobbyists;

    public Senator(String name, double money, int influence) {
        this.name = name;
        this.money = money;
        this.influence = influence;
        this.companies = companies;
        this.lobbyists = lobbyists;
    }

    public boolean castVote(String input) {
        // Implementation of casting a vote in favor of companies for money
        return (input.equalsIgnoreCase("y"));
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return this.money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double subtractMoney(double money) {
        this.money -= money;
        return this.money;
    }

    public double addMoney(double money) {
        this.money += money;
        return this.money;
    }

    public char makeDecision(String decision) {
        // Implementation of making a multiple-choice decision
        return decision.charAt(0);
    }

    public boolean charmColleague(Senator colleague, Lobbyist lobbyist) {
        // Implementation of attempting to gain influence by introducing a lobbyist to a colleague
        return true;
    }

    public void addCompany(Company company) {
        this.companies.add(company);
    }

    public ArrayList<Company> getCompanies() {
        return this.companies;
    }

    public void addLobbyist(Lobbyist lobbyist) {
        this.lobbyists.add(lobbyist);
    }

    public ArrayList<Lobbyist> getLobbyists() {
        return this.lobbyists;
    }
}
