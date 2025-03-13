package SOLID_Principles;

// THis voilating SRP because multiple functionality are 
// define in same class.
class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void saveUser() {
        // Code to save user to database
        System.out.println("User saved to database.");
    }

    public void sendEmail(String message) {
        // Code to send email
        System.out.println("Email sent to " + email + " with message: " + message);
    }

    // Getters and setters
}

public class _01_SRP_Before {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
