package Java8Features;

import java.util.Optional;

public class _04_OptionalExample {

    public static void main(String[] args) {
        Optional<String> userName = getUserNameById("123"); // Assume database call

        userName.ifPresentOrElse(
            name -> System.out.println("User's name: " + name),
            () -> System.out.println("User not found, logging error...")
        );
    }

    private static Optional<String> getUserNameById(String userId) {
        // Simulating database behavior
        if ("123".equals(userId)) {
            return Optional.of("Alice");
        }
        return Optional.empty();
    }
}

