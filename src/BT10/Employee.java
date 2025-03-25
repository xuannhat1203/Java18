package BT10;

public class Employee {
    int id;
    String name;
    float salary;

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }
}
