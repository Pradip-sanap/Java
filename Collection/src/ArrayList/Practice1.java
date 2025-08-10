package ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class EmployeeDirectory {
	private ArrayList<String> employees = new ArrayList<>();
	
	public void addEmployee(String name) {
		employees.add(name);
		System.out.println("Employee added successfully.");
	}
	
	public void removeEmployee(String name) {
		if(employees.remove(name)) {
			System.out.println("Employee removed.");			
		}else {
			System.out.println("Employee not found.");
		}
	}
	
	public void searchEmployee(String name) {
        if (employees.contains(name)) {
            System.out.println(name + " is found in the directory.");
        } else {
            System.out.println(name + " not found.");
        }
    }
	
	public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees in the directory.");
        } else {
            System.out.println("Employee List:");
            for (String emp : employees) {
                System.out.println(emp);
            }
        }
    }
	
	public void printEmployeesAlphabetically() {
		if (employees.isEmpty()) {
            System.out.println("No employees to sort.");
            return;
        }
		
		ArrayList<String> sortedEmployees = new ArrayList<>(employees);
		sortedEmployees.sort(Comparator.naturalOrder());
		System.out.println("Employees (Alphabetically):");
        for (String emp : sortedEmployees) {
            System.out.println(emp);
        }
        for (String emp : employees) {
        	System.out.println(emp);
        }
		
	}
}

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee Directory Implementation in Java
//		Use ArrayList<String> to store employee names.
//
//		Add new employees 
//		Remove employees by name 
//		Display all employees 
//		Search for an employee by name 
//		Print employees in alphabetical order
		
		EmployeeDirectory directory = new EmployeeDirectory();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== Employee Directory Menu ===");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Print Alphabetically");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();  // flush newline

            switch (choice) {
                case 1:
                    System.out.print("Enter employee name to add: ");
                    directory.addEmployee(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter employee name to remove: ");
                    directory.removeEmployee(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter employee name to search: ");
                    directory.searchEmployee(sc.nextLine());
                    break;
                case 4:
                    directory.displayEmployees();
                    break;
                case 5:
                    directory.printEmployeesAlphabetically();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
		

	}

}
