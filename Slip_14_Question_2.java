// Write a Java program to create an Employee class is the base class, and it has two 
// subclasses, Manager and Programmer. The Employee class has private instance 
// variables name and role, along with getter methods for retrieving their values. It 
// also has a method calculateSalary() which returns a double.



// Base class
class Employee {
    private String name;
    private String role;

    // Constructor
    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    // Method to calculate salary (to be overridden)
    public double calculateSalary() {
        return 0.0;
    }
}

// Subclass: Manager
class Manager extends Employee {
    public Manager(String name) {
        super(name, "Manager");
    }

    @Override
    public double calculateSalary() {
        return 80000.0; // example fixed salary
    }
}

// Subclass: Programmer
class Programmer extends Employee {
    public Programmer(String name) {
        super(name, "Programmer");
    }

    @Override
    public double calculateSalary() {
        return 60000.0; // example fixed salary
    }
}

// Main class
public class Slip_14_Question_2 {
    public static void main(String[] args) {
        Manager m = new Manager("Alice");
        Programmer p = new Programmer("Bob");

        System.out.println(m.getRole() + " " + m.getName() + " has salary: $" + m.calculateSalary());
        System.out.println(p.getRole() + " " + p.getName() + " has salary: $" + p.calculateSalary());
    }
}
