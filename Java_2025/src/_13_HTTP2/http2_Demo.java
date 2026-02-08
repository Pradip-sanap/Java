package _13_HTTP2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class http2_Demo {

	public static void main(String[] args) throws IOException, InterruptedException {
		HttpClient httpClient = HttpClient.newBuilder()
				.connectTimeout(Duration.ofSeconds(5))
				.version(HttpClient.Version.HTTP_2)
				.build();
		
		HttpRequest request = HttpRequest.newBuilder()
		        .uri(URI.create("https://jsonplaceholder.typicode.com/users/1"))
		        .header("Accept", "application/json")
		        .header("x-api-version", "api-v1")
		        .timeout(Duration.ofSeconds(5))
		        .GET()
		        .build();
		
		System.out.println(request);
		System.out.println(request.method());
		System.out.println(request.toString());
		System.out.println(request.headers());
		System.out.println(request.timeout());
		System.out.println(request.uri());
		System.out.println(request.version()); 
		
		
		
		HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
		
		if (response.statusCode() != 200) {
		    throw new RuntimeException("Failed API call: " + response.statusCode());
		}
		

		String responseBody = response.body();
		System.out.println(responseBody);

		System.out.println(response.statusCode());
		System.out.println(response.headers());
		System.out.println(response.previousResponse());
		System.out.println(response.request());
		System.out.println(response.sslSession());
		System.out.println(response.version());
		
		
		
	}

}
