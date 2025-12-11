package _06_ContactManagementSystem;

public class Contact {
	private int id;
	private String name;
	private String phone;
	private String email;
	private String address;
	private String category;
	public Contact(int id, String name, String phone, String email, String address, String category) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String toCSV() {
		return id + "," + name + "," + phone + "," + email + "," + address + "," + category;
	}
	
	@Override
	public String toString() {
		return String.format("%-5d %-20s %-15s %-30s %-10s", id, name, phone, email, category);
	}
	
	public String toDetailedString() {
		return "\n==== Contact Details ====\n" +
				"ID			:"+ id + "\n" +
				"Name		:"+ name + "\n" +
				"Phone		:"+ phone + "\n" +
				"Email		:"+ email + "\n" +
				"Address	:"+ address + "\n" +
				"Category	:"+ category + "\n" +
				"==========================" ;
	}
	
	
	

}
