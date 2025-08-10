package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters and setters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + '}';
    }
}

public class _01_practical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> products = new ArrayList();
		products.add(new Product(1, "Laptop", 58000.0d));
		products.add(new Product(2, "smartphone", 23000.0d));
		products.add(new Product(3, "smartwatch", 6700.0d));
		
		// sort object base on price
		products.sort(Comparator.comparingDouble(Product::getPrice));
		
		System.out.println(products);  
		
		List<Product> expensiveProducts = products.stream()
				.filter((obj)-> obj.getPrice() > 20000.0)
				.collect(Collectors.toList());
		System.out.println(expensiveProducts);
		
	}
}
