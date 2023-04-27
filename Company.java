public class Company {
    private String name;
    private Lobbyist[] employees;
    private Company competitor;
    
    public Company(String name, Lobbyist[] employees, Company competitor) {
        this.name = name;
        this.employees = employees;
        this.competitor = competitor;
    }
    
    // getters and setters for the name, employees, and competitor fields
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Lobbyist[] getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Lobbyist[] employees) {
        this.employees = employees;
    }
    
    public Company getCompetitor() {
        return this.competitor;
    }
    
    public void setCompetitor(Company competitor) {
        this.competitor = competitor;
    }
}
