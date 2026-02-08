package _05_Java8Features;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product {
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + " (" + price + ")";
    }
}

public class _07_streamExcersize3 {

	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
	            new Product("Laptop", "Electronics", 80000),
	            new Product("Smartphone", "Electronics", 25000),
	            new Product("Shirt", "Clothing", 1500),
	            new Product("Jeans", "Clothing", 3000),
	            new Product("Apple", "Fruits", 120),
	            new Product("Banana", "Fruits", 60)
	        );
		
//		Grouping products by category using Streams
		Map<String, List<Product>> grpByCategory = products.stream()
										.collect(Collectors.groupingBy(Product::getCategory));
		System.out.println(grpByCategory);
		System.out.println(grpByCategory.values());
		
		Collection<List<Product>> values = grpByCategory.values();
		System.out.println(values);
		values.forEach(list -> {
			System.out.println(list);
			for(Product obj : list) {
				System.out.println(obj.getPrice());
			}
		});
		
//		Group and count products in each category
		Map<String, Long> grpAndCount = products.stream()
					.collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));
		System.out.println(grpAndCount);
		 
//		Partition a list of integers into evens and odds using streams.
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                								.collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> evens = partitioned.get(true);
        System.out.println(evens);
        List<Integer> odds = partitioned.get(false);
        System.out.println(odds);

	}

}
