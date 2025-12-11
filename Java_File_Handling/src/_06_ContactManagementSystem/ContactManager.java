package _06_ContactManagementSystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ContactManager {
	private List<Contact> contacts;
	private String fileName;
	private int nextId;
	public ContactManager(String fileName) { 
		this.contacts = new ArrayList<Contact>();
		this.fileName = fileName;
		this.nextId = 1;
		
		loadContacts();
	}
	
	private void loadContacts() {
		File file = new File(fileName);
		
		if(!file.exists()) {
			System.out.println("No existing Contact file. Starting Fresh !!!");
			return;
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line = br.readLine();
			line = br.readLine();
			
			while(line!=null) {
				String[] records = line.split(",");
				if(records.length == 6) {
					int id = Integer.parseInt(records[0]);
					Contact contact = new Contact(id, records[1], records[2], records[3], records[4], records[5]);
					contacts.add(contact);
					if(id >= nextId) {
						nextId = id + 1;
					}
				}
				line = br.readLine();
				
			}
//			contacts.forEach(record ->{
//				System.out.println(record);
//			});
			System.out.println("Loaded " + contacts.size() + " contacts successfully.");
		} catch (Exception e) {
			System.out.println("Error loading contacts: " + e.getMessage());
		}
	}
	
	//save one contact
	private void saveContacts(Contact newContact) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
			if (new File(fileName).length() != 0) {
	            bw.newLine();  // This ensures we don't overwrite the first line
	        } 
			bw.write(newContact.toCSV());
			bw.flush();
		} catch (IOException e) {
			System.out.println("Error saving contacts: " + e.getMessage());
		}
	}
	
	// Save contacts to file
    private void saveContacts() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            // Write header
            bw.write("ID,Name,Phone,Email,Address,Category");
            bw.newLine();
            
            // Write all contacts
            for (Contact contact : contacts) {
                bw.write(contact.toCSV());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            System.out.println("Error saving contacts: " + e.getMessage());
        }
    }
	
	public boolean addContact(String name, String phone, String email, String address, String category) {
		//validation
		if(name == null || name.trim().isEmpty()) {
			System.out.println("Error: Name cannot be empty");
			return false;
		}
		
		if(!isValidPhone(phone)) {
			System.out.println("Error: Phone number must be exactly 10 digits");
			return false;
		}
		
		if(!isValidEmail(email)) {
			System.out.println("Error: Invalid email provided");
		}
		
		if(phoneExists(phone)) {
			System.out.println("Error: Phone already exists.");
			return false;
		}
		
		// validation successful. Now save it.
		Contact newContact = new Contact(nextId++, name, phone, email, address, category);
		contacts.add(newContact);
		
		saveContacts(newContact);
		System.out.println("\n✓ Contact added successfully! ID: " + newContact.getId());
		
		
		return true;
	}
	
	private boolean isValidPhone(String phone) {
		return phone.matches("\\d{10}");
	}
	
	private boolean isValidEmail(String email) {
		return email.contains("@") && email.contains(".");
	}
	
	private boolean phoneExists(String phone) {
		long alreadyExists = contacts.stream().filter(contact ->{
			if(contact.getEmail().equals(phone)) {
				return true;
			}
			return false;
		}).count();
		
		return alreadyExists > 0;
	}
	
	public void viewAllContacts() {
		if(contacts.isEmpty()) {
			System.out.println("No records found!!!");
		}
		
		Comparator<Contact> sortByName = (c1, c2) -> {
//			Comparator.comparing()
			return c1.getName().compareToIgnoreCase(c2.getName());
		};
		Collections.sort(contacts, sortByName);
		
		contacts.forEach(contact-> System.out.println(contact));
		System.out.println("=".repeat(30));
		System.out.println("Total contacts : "+contacts.size());
	}

	// Search contacts
    public List<Contact> searchByName(String name) {
        List<Contact> results = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().toLowerCase().contains(name.toLowerCase())) {
                results.add(contact);
            }
        }
        return results;
    }

    public Contact searchByPhone(String phone) {
        for (Contact contact : contacts) {
            if (contact.getPhone().equals(phone)) {
                return contact;
            }
        }
        return null;
    }

    public Contact searchById(int id) {
        for (Contact contact : contacts) {
            if (contact.getId() == id) {
                return contact;
            }
        }
        return null;
    }

    public List<Contact> searchByCategory(String category) {
        List<Contact> results = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getCategory().equalsIgnoreCase(category)) {
                results.add(contact);
            }
        }
        return results;
    }

    public List<Contact> searchByEmail(String email) {
        List<Contact> results = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getEmail().toLowerCase().contains(email.toLowerCase())) {
                results.add(contact);
            }
        }
        return results;
    }

 // Update contact
    public boolean updateContact(int id, String name, String phone, String email, String address, String category) {
        Contact contact = searchById(id);
        if (contact == null) {
            System.out.println("Contact not found.");
            return false;
        }

        // Validate if updating
        if (name != null && !name.trim().isEmpty()) {
            contact.setName(name);
        }

        if (phone != null && !phone.isEmpty()) {
            if (!isValidPhone(phone)) {
                System.out.println("Error: Invalid phone number format.");
                return false;
            }
            if (phoneExists(phone) && !contact.getPhone().equals(phone)) {
                System.out.println("Error: Phone number already exists.");
                return false;
            }
            contact.setPhone(phone);
        }

        if (email != null && !email.isEmpty()) {
            if (!isValidEmail(email)) {
                System.out.println("Error: Invalid email format.");
                return false;
            }
            contact.setEmail(email);
        }

        if (address != null) {
            contact.setAddress(address);
        }

        if (category != null && !category.isEmpty()) {
            contact.setCategory(category);
        }

        saveContacts();
        System.out.println("\n✓ Contact updated successfully!");
        return true;
    }

    // Delete contact
    public boolean deleteContact(int id) {
        Contact contact = searchById(id);
        if (contact == null) {
            System.out.println("Contact not found.");
            return false;
        }

        contacts.remove(contact);
        saveContacts();
        System.out.println("\n✓ Contact deleted successfully!");
        return true;
    }

 // Export contacts
    public boolean exportContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts to export.");
            return false;
        }

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String path = "C:\\Users\\pradips\\Music\\Java Repo\\Java_File_Handling\\src\\_06_ContactManagementSystem\\";
        String exportFilename = path + "contacts_backup_" + LocalDateTime.now().format(dtf) + ".csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(exportFilename))) {
            bw.write("ID,Name,Phone,Email,Address,Category");
            bw.newLine();
            
            for (Contact contact : contacts) {
                bw.write(contact.toCSV());
                bw.newLine();
            }
            bw.flush();
            System.out.println("\n✓ Contacts exported successfully to: " + exportFilename);
            return true;
        } catch (IOException e) {
            System.out.println("Error exporting contacts: " + e.getMessage());
            return false;
        }
    }

}
