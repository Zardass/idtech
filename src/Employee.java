public class Employee {
    private String name;
    private double salary;
    Address address;

    public Employee(String name, double salary,Address address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public void showDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Address: " + this.address);
    }
}
