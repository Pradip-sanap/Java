package _13_Observer_pattern;

import java.util.*;

//Step 1: Observer interface
interface Observer {
	void update(String stockName, double price);
}

//Step 2: Subject interface
interface Subject {
	void attach(Observer observer);

	void detach(Observer observer);

	void notifyObservers();
}

//Step 3: Concrete Subject
class Stock implements Subject {
	private String name;
	private double price;
	private List<Observer> observers = new ArrayList<>();

	public Stock(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(name, price);
		}
	}

	// business logic: change price
	public void setPrice(double price) {
		this.price = price;
		System.out.println("\nStock price updated: " + name + " → ₹" + price);
		notifyObservers();
	}
}

//Step 4: Concrete Observers
class MobileApp implements Observer {
	private String appName;

	public MobileApp(String appName) {
		this.appName = appName;
	}

	@Override
	public void update(String stockName, double price) {
		System.out.println(appName + " received update → " + stockName + " is now ₹" + price);
	}
}

class WebApp implements Observer {
	private String siteName;

	public WebApp(String siteName) {
		this.siteName = siteName;
	}

	@Override
	public void update(String stockName, double price) {
		System.out.println(siteName + " displays: " + stockName + " is now ₹" + price);
	}
}

//Step 5: Client
public class Demo {
	public static void main(String[] args) {
		Stock tesla = new Stock("Tesla", 900.00);

		Observer mobileApp = new MobileApp("TradingApp");
		Observer webApp = new WebApp("MoneyControl");

		tesla.attach(mobileApp);
		tesla.attach(webApp);

		tesla.setPrice(950.00);
		tesla.setPrice(970.50);
	}
}
