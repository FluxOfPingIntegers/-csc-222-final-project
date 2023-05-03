package classes.src;

import java.util.ArrayList;

import classes.src.Lobbyist;

public class Company {
    private String name;
    private Lobbyist employee;
    private Company competitor;
    private double payoff;
    private static ArrayList<Company> list = new ArrayList<Company>();
    
    public Company(String name, Lobbyist employee) {
        this.name = name;
        this.employee = employee;
        this.competitor = competitor;
        this.payoff = 100.00;
        list.add(this);
    }
    
    // getters and setters for the name, employees, and competitor fields
    public String getName() {
        return this.name;
    }
    

    // set name of company.
    public void setName(String name) {
        this.name = name;
    }
    
    // return Lobbyist employed by this company.
    public Lobbyist getEmployee() {
        return this.employee;
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

    public static ArrayList<Company> getList() {
        return list;
    }
}
