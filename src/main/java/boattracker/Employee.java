package boattracker;

public class Employee {
    private String name;
    private Company company;
    private Boat boat;

    public Employee(String name) {
        this.name = name;
    }
    
    public void setCompany(Company company) {
        this.company = company;
    }
    
    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    // Other Employee-related methods and properties
}
