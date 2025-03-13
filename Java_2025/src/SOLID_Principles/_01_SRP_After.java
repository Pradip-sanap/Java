package SOLID_Principles;

class User1 {
    private String name;
    private String email;

    public User1(String name, String email) {
        this.name = name;
        this.email = email;
    }
 // Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    
}

class UserRepository {
    public void saveUser(User1 user) {
        // Code to save user to database
        System.out.println("User " + user.getName() + " saved to database.");
    }
}

class EmailService {
    public void sendEmail(User1 user, String message) {
        // Code to send email
        System.out.println("Email sent to " + user.getEmail() + " with message: " + message);
    }
}

public class _01_SRP_After {

	public static void main(String[] args) {
		User1 user = new User1("John Doe", "john.doe@example.com");

        UserRepository userRepository = new UserRepository();
        userRepository.saveUser(user);

        EmailService emailService = new EmailService();
        emailService.sendEmail(user, "Welcome to our platform!");

	}

}
