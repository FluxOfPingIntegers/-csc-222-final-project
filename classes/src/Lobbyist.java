package classes.src;

import classes.src.Company;

public class Lobbyist {
    private String name;
    private Company employer;
    
    public Lobbyist(String name, Company employer) {
        this.name = name;
        this.employer = employer;
    }
    
    // ToDo: create typical slimely greeting for lobbyist.
    public String greet() {
        return "Hello, my name is " + this.name + ". How can I assist you?";
    }
    
    // give influence to Senator who is interested.
    public int charm() {
        return 10;
    }
    
    // getters and setters for the name and employer fields.
    public String getName() {
        return name;
    }
    
    // set name of Lobbyist.
    public void setName(String name) {
        this.name = name;
    }
    
    // return Company that employs Lobbyist.
    public Company getEmployer() {
        return this.employer;
    }
    
    // set the Company that this Lobbyist works for.
    public void setEmployer(Company employer) {
        this.employer = employer;
    }
}
