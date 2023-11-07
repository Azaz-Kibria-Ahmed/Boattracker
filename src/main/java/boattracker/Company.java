package boattracker;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Employee> employees;
    
    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }
    
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    
    // Other Company-related methods and properties
}
