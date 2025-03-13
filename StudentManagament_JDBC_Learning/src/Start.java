import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Start {
	
	// Database URL, username, and password
    private static final String URL = "jdbc:mysql://localhost:3306/testdb?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "Pass@123";
    
	public static void main(String[] args) {
		try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                System.out.println("Connected to the database!");

                // Perform Insert operation
                insertUser(connection, "JohnDoe", "john@example.com");

                // Perform Update operation
                updateUserEmail(connection, "JohnDoe", "john.doe@example.com");

                // Perform Delete operation
                deleteUser(connection, "JohnDoe");
                connection.close();
            }
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("SQL Exception occurred!");
            e.printStackTrace();
        } 
		
	}
	
	// Method to insert a user into the database
    private static void insertUser(Connection connection, String username, String email) throws SQLException {
        String sql = "INSERT INTO users (username, email) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, username);
            statement.setString(2, email);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }
        }
    }

    // Method to update a user's email in the database
    private static void updateUserEmail(Connection connection, String username, String newEmail) throws SQLException {
        String sql = "UPDATE users SET email = ? WHERE username = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, newEmail);
            statement.setString(2, username);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("The user's email was updated successfully!");
            }
        }
    }

    // Method to delete a user from the database
    private static void deleteUser(Connection connection, String username) throws SQLException {
        String sql = "DELETE FROM users WHERE username = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, username);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("The user was deleted successfully!");
            }
        }
    }

}
