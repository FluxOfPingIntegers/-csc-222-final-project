public class Lobbyist {
    private String name;
    private Company employer;
    
    public Lobbyist(String name, Company employer) {
        this.name = name;
        this.employer = employer;
    }
    
    public String greet() {
        return "Hello, my name is " + name + ". How can I assist you?";
    }
    
    public double donate() {
        double donationAmount = Math.random() * 10000; // generate a random donation amount
        employer.addDonation(donationAmount); // add the donation to the employer's contributions
        return donationAmount;
    }
    
    // getters and setters for the name and employer fields
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Company getEmployer() {
        return this.employer;
    }
    
    public void setEmployer(Company employer) {
        this.employer = employer;
    }
}
