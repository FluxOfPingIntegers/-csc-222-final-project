package classes.src;

import classes.src.Lobbyist;

public class Company {
    private String name;
    private Lobbyist[] employees;
    private Company competitor;
    private double payoff;
    
    public Company(String name, Lobbyist[] employees, Company competitor) {
        this.name = name;
        this.employees = employees;
        this.competitor = competitor;
        this.payoff = 100.00;
    }
    
    // getters and setters for the name, employees, and competitor fields
    public String getName() {
        return this.name;
    }
    

    // set name of company.
    public void setName(String name) {
        this.name = name;
    }
    
    // return all Lobbyists employed by this company.
    public Lobbyist[] getEmployees() {
        return this.employees;
    }
    
    // list of Lobbyists who can add this Company to the Senator classes companies list.
    public void setEmployees(Lobbyist[] employees) {
        this.employees = employees;
    }
    
    // return the competing company for this instance.
    public Company getCompetitor() {
        return this.competitor;
    }
    
    // competing companies will not allow their lobbyists to interact with senators in league with their competitors.
    public void setCompetitor(Company competitor) {
        this.competitor = competitor;
    }

    // give money to Senator which will be multiplied by their influence.
    public double donate() {
        this.payoff *= 1.25;
        return this.payoff;
    }
}
