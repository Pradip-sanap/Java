package _17_Iterator_pattern;

import java.util.*;

class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public double getSalary() { return salary; }
    public String getName() { return name; }
}

// Iterator interface
interface Iterator<T> {
    boolean hasNext();
    T next();
}

// Aggregate interface
interface Aggregate<T> {
    Iterator<T> createIterator();
}

// Concrete Iterator
class EmployeeIterator implements Iterator<Employee> {
    private int currentIndex = 0;
    private List<Employee> employees;
    public EmployeeIterator(List<Employee> employees) {
        this.employees = employees;
    }
    public boolean hasNext() {
        return currentIndex < employees.size();
    }
    public Employee next() {
        if (!hasNext()) throw new NoSuchElementException();
        return employees.get(currentIndex++);
    }
}

// Concrete Aggregate
class Company implements Aggregate<Employee> {
    private List<Employee> employees;
    public Company(List<Employee> employees) {
        this.employees = employees;
    }
    public Iterator<Employee> createIterator() {
        return new EmployeeIterator(employees);
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 50000),
            new Employee("Bob", 60000),
            new Employee("Charlie", 70000)
        );
        Company company = new Company(employees);
        Iterator<Employee> iterator = company.createIterator();
        double totalSalary = 0;
        while (iterator.hasNext()) {
            totalSalary += iterator.next().getSalary();
        }
        System.out.println("Total salary: " + totalSalary);
    }
}
