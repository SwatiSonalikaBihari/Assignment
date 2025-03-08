import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID:"+id + ",Name:" +name + ",Salary:"+ salary);
    }

    public static void main(String[] args) {
        List<Employee> e = new ArrayList<>();
        e.add(new Employee(1, "Swati", 98765));
        e.add(new Employee(2, "Sonalika",45678));
        e.add(new Employee(3, "Bihari", 876543));

        for (Employee emp : e) {
            emp.displayDetails();
        }
    }
}
