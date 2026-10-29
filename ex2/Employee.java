public class Employee {
    private String id;
    private String name;
    private double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        if (baseSalary < 0) {
            System.out.println("Base salary cannot be negative");
        }
        this.baseSalary = Math.max(0, baseSalary);

    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setName(String name) {
        if (name!=null && !name.trim().isEmpty()) {
            this.name = name;
        } else  {
            System.out.println("Name cannot be empty");
        }
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        }   else {
            System.out.println("Base salary cannot be negative");
        }
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("salary: " + calculateSalary());
    }


}
