package classes.src;

import java.util.ArrayList;

import classes.src.Company;

public class Lobbyist {
    private String name;
    private Company employer;
    private static ArrayList<Lobbyist> list = new ArrayList<Lobbyist>();
    
    public Lobbyist(String name) {
        this.name = name;
        this.employer = employer;
        list.add(this);
    }
    
    // ToDo: create typical slimely greeting for lobbyist.
    public void greet() {
        System.out.println("*Hiss* Hello, my name is " + this.name + ". I believe we can help each other...");
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

    public static ArrayList<Lobbyist> getList() {
        return list;
    }
}
