package _06_ContactManagementSystem;

import java.util.List;
import java.util.Scanner;

public class MainClass {
	private static Scanner sc = new Scanner(System.in);
	private static ContactManager manager = new ContactManager("C:\\Users\\pradips\\Music\\Java Repo\\Java_File_Handling\\src\\_06_ContactManagementSystem\\ContactRecords.csv");
	
	
	public static void main(String[] args) {
		System.out.println("** welcome to Contact management system **\n");
		
		boolean running = true;
		while(running) {
			
			displayMenu();
			 
			int choice = getIntInput("Enter your Choise:");
			
			switch (choice) {
	            case 1:
	                addContactMenu();
	                break;
	            case 2:
	                manager.viewAllContacts();
	                break;
	            case 3:
	                searchContactMenu();
	                break;
	            case 4:
	                updateContactMenu();
	                break;
	            case 5:
	                deleteContactMenu();
	                break; 
	            case 6:
	                manager.exportContacts();
	                break; 
	            case 7:
	                System.out.println("\nThank you for using Contact Management System!");
	                running = false;
	                break;
	            default:
	                System.out.println("\nInvalid choice. Please try again.");
			}
        
	        if (running) {
	            System.out.println("\nPress Enter to continue...");
	            sc.nextLine();
	        } 	
	        
		} 
	}
	
	private static void addContactMenu() {
		System.out.println("\n-- Add new Contact --");
		
		String name = getStringInput("Enter Name : ");
		String phone = getStringInput("Enter Phone : ");
		String email = getStringInput("Enter Email : ");
		String address = getStringInput("Enter Address : ");
		String category = getCategoryInput();
		
		manager.addContact(name, phone, email, address, category);
		
	}
	
	private static String getStringInput(String prompt) {
		System.out.println(prompt);
		
		return sc.nextLine().trim();
	}
	
	private static String getCategoryInput() {
		System.out.println("\nSelect Category:");
        System.out.println("1. Family");
        System.out.println("2. Friend");
        System.out.println("3. Work");
        System.out.println("4. Other");
        int choice = getIntInput("Enter choice: ");
        switch (choice) {
            case 1: return "Family";
            case 2: return "Friend";
            case 3: return "Work";
            case 4: return "Other";
            default: return "Other";
        }
	}
	
	private static int getIntInput(String prompt) {
		while(true) {
			try {
				System.out.println(prompt);
				int value = Integer.parseInt(sc.nextLine().trim());
				return value;
			} catch (Exception e) {
				System.out.println("Invalid Input. Please Enter Number.");
			}
		}
	}
	
	private static void displayMenu() {
		System.out.println("\n"+"=".repeat(30));
		System.out.println("Contact Mngmt System\n");
		System.out.println("=".repeat(30));
		System.out.println("1. Add New Contact");
        System.out.println("2. View All Contacts");
        System.out.println("3. Search Contacts");
        System.out.println("4. Update Contact");
        System.out.println("5. Delete Contact"); 
        System.out.println("6. Export Contacts"); 
        System.out.println("7. Exit");
        System.out.println("=".repeat(50));
		
	}

	private static void searchContactMenu() {
        System.out.println("\n--- Search Contacts ---");
        System.out.println("1. Search by Name");
        System.out.println("2. Search by Phone");
        System.out.println("3. Search by Email");
        System.out.println("4. Search by Category");
        
        int choice = getIntInput("Enter search type: ");
        
        switch (choice) {
            case 1:
                String name = getStringInput("Enter name to search: ");
                List<Contact> nameResults = manager.searchByName(name);
                displaySearchResults(nameResults);
                break;
            case 2:
                String phone = getStringInput("Enter phone to search: ");
                Contact phoneResult = manager.searchByPhone(phone);
                if (phoneResult != null) {
                    System.out.println(phoneResult.toDetailedString());
                } else {
                    System.out.println("No contact found with this phone number.");
                }
                break;
            case 3:
                String email = getStringInput("Enter email to search: ");
                List<Contact> emailResults = manager.searchByEmail(email);
                displaySearchResults(emailResults);
                break;
            case 4:
                String category = getCategoryInput();
                List<Contact> catResults = manager.searchByCategory(category);
                displaySearchResults(catResults);
                break;
            default:
                System.out.println("Invalid choice.");
        } 
    }
	
	private static void displaySearchResults(List<Contact> results) {
        if (results.isEmpty()) {
            System.out.println("\nNo contacts found.");
            return;
        }
        
        System.out.println("\n" + "=".repeat(90));
        System.out.println("Found " + results.size() + " contact(s):");
        System.out.println("=".repeat(90));
        System.out.println(String.format("%-5s %-20s %-15s %-30s %-10s", "ID", "Name", "Phone", "Email", "Category"));
        System.out.println("=".repeat(90));
        
        for (Contact contact : results) {
            System.out.println(contact);
        }
        System.out.println("=".repeat(90));
    }

	private static void updateContactMenu() {
        System.out.println("\n--- Update Contact ---");
        int id = getIntInput("Enter Contact ID to update: ");
        
        Contact contact = manager.searchById(id);
        if (contact == null) {
            System.out.println("Contact not found.");
            return;
        }
        
        System.out.println("\nCurrent Details:");
        System.out.println(contact.toDetailedString());
        System.out.println("Leave blank to keep existing value.");
        
        String name = getStringInput("Enter new Name: ");
        String phone = getStringInput("Enter new Phone: ");
        String email = getStringInput("Enter new Email: ");
        String address = getStringInput("Enter new Address: ");
        
        System.out.println("\nUpdate Category? (y/n): ");
        String updateCat = sc.nextLine().trim();
        String category = null;
        if (updateCat.equalsIgnoreCase("y")) {
            category = getCategoryInput();
        }
        
        manager.updateContact(id, name, phone, email, address, category);
    }
	
	private static void deleteContactMenu() {
        System.out.println("\n--- Delete Contact ---");
        int id = getIntInput("Enter Contact ID to delete: ");
        
        Contact contact = manager.searchById(id);
        if (contact == null) {
            System.out.println("Contact not found.");
            return;
        }
        
        System.out.println("\nContact to be deleted:");
        System.out.println(contact.toDetailedString());
        
        String confirm = getStringInput("Are you sure you want to delete? (yes/no): ");
        if (confirm.equalsIgnoreCase("yes")) {
            manager.deleteContact(id);
        } else {
            System.out.println("Deletion cancelled.");
        }
    }

	



}
