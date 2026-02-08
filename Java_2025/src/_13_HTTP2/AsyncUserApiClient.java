package _13_HTTP2;

import java.net.URI;
import java.net.http.*;
import java.time.Duration;
import java.util.concurrent.CompletableFuture; 

public class AsyncUserApiClient {

    private static final HttpClient CLIENT = HttpClient.newBuilder()
									            .version(HttpClient.Version.HTTP_2)
									            .connectTimeout(Duration.ofSeconds(5))
									            .build();
 
    
    public static void main(String[] args) { 
        AsyncUserApiClient client = new AsyncUserApiClient(); 
        client.fetchUserAsync(1)
              .thenAccept(user -> System.out.println("User received: " + user))
              .exceptionally(ex -> {
                  System.err.println("Error: " + ex.getMessage());
                  return null;
              });
        
        System.out.println("Log 1");

        // Prevent JVM exit for demo
        try { Thread.sleep(3000); } catch (InterruptedException e) {}
    }

    public CompletableFuture<Object> fetchUserAsync(int id) {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users/" + id))
                .timeout(Duration.ofSeconds(5))
                .GET()
                .build();

        return CLIENT.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(response -> {
                    if (response.statusCode() != 200) {
                        throw new RuntimeException("API failed with status " + response.statusCode());
                    }
                    return response.body();
                })
                .thenApply(body -> {
                    try {
                        return body;
                    } catch (Exception e) {
                        throw new RuntimeException("JSON parsing failed", e);
                    }
                });
    }
}

class User {
    public int id;
    public String name;
    public String email;

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }
}