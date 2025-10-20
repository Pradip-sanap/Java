package _06_Composite;

import java.util.ArrayList;
import java.util.List;

// Component
interface Employee {
    void showDetails();  // common operation
}

// Leaf
class Developer implements Employee {	
    private String name;
    private String position;

    public Developer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println(position + ": " + name);
    }
}

// Composite
class Manager implements Employee {
    private String name;
    private String position;
    private List<Employee> subordinates = new ArrayList<>();

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    @Override
    public void showDetails() {
        System.out.println(position + ": " + name);
        for (Employee e : subordinates) {
            System.out.print("   ");  // indentation
            e.showDetails();
        }
    }
}

// Client
public class EmployeeCompositeDemo {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Alice", "Frontend Developer");
        Employee dev2 = new Developer("Bob", "Backend Developer");
        Employee dev3 = new Developer("Charlie", "Fullstack Developer");

        Manager engManager = new Manager("David", "Engineering Manager");
        engManager.add(dev1);
        engManager.add(dev2);
        engManager.add(dev3);

        Employee qa1 = new Developer("Eva", "QA Engineer");
        Employee qa2 = new Developer("Frank", "Automation Engineer");

        Manager qaManager = new Manager("Grace", "QA Manager");
        qaManager.add(qa1);
        qaManager.add(qa2);

        Manager ceo = new Manager("Henry", "CEO");
        ceo.add(engManager);
        ceo.add(qaManager);

        // Print full company structure
        ceo.showDetails();
    }
}

