package delete;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product {

    String category;
    double price;

    Product(String c, double p) {
        category = c;
        price = p;
    }
    

    public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
    public String toString() {
        return "Product{category='" + category + "', price=" + price + "}";
    }
}

public class code5 {

    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product("Electronics", 1200.00),
                new Product("Electronics", 850.50),
                new Product("Clothing", 450.00),
                new Product("Clothing", 1200.00),
                new Product("Grocery", 150.75),
                new Product("Grocery", 300.00),
                new Product("Books", 250.00),
                new Product("Books", 550.00),
                new Product("Furniture", 2500.00),
                new Product("Furniture", 1800.00)
        );

        products.forEach(System.out::println);
        
        
        Map<String, List<Product>> ans = products.stream()
        		.collect(Collectors.groupingBy(obj -> obj.getCategory()));
        System.out.println(ans);
    }
}