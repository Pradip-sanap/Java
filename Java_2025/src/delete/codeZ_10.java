package delete;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Customer {
    String name;
    List<Order> orders;

    Customer(String name, List<Order> orders) {
        this.name = name;
        this.orders = orders;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", orders=" + orders + "]";
	}
	
}



class Order {
    int orderId;
    double amount;

    Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", amount=" + amount + "]";
	}
	
}
public class codeZ_10 {

	public static void main(String[] args) {
		List<Customer> customers = List.of(

			    new Customer("Rahul", List.of(
			        new Order(101, 500),
			        new Order(102, 1200)
			    )),

			    new Customer("Amit", List.of(
			        new Order(103, 800),
			        new Order(104, 1500)
			    )),

			    new Customer("Sneha", List.of(
			        new Order(105, 300)
			    ))
			);
		
		//Get all orders from all customers.
		List<Order> all_orders = customers.stream()
				.flatMap(cust -> cust.getOrders().stream()) 
				.collect(Collectors.toList());
		System.out.println(all_orders);
		
		//Get all orders from all customers whose amount is greate than 1000.
		List<Order> all_orders_above_1000 = customers.stream()
				.flatMap(cust -> cust.getOrders().stream()) 
				.filter(order -> order.getAmount() > 1000)
				.collect(Collectors.toList());
		System.out.println(all_orders_above_1000);
		
		
		//Get all orders from all customers and calculate sum of amount.
		 double sum = customers.stream()
				.flatMap(cust -> cust.getOrders().stream()) 
				.mapToDouble(Order::getAmount)
				.sum();
		System.out.println(sum);
		
		
		//Count products by category
		List<Productt> products = List.of(
			    new Productt("Laptop", List.of("Electronics", "Computer")),
			    new Productt("Phone", List.of("Electronics", "Mobile")),
			    new Productt("Tablet", List.of("Electronics", "Mobile")),
			    new Productt("Chair", List.of("Furniture", "Home"))
			);
		Map<String, Long> count_prodByCategory = products.stream()
			.flatMap(prod -> prod.categories.stream())
			.collect(Collectors.groupingBy(category -> category, Collectors.counting()));
		System.out.println(count_prodByCategory);
		

	}

}
class Productt {
    String name;
    List<String> categories;

    Productt(String name, List<String> categories) {
        this.name = name;
        this.categories = categories;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", categories=" + categories + "]";
	}
    
}