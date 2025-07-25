package _02_Abstract_Factory;

public class FactoryProducer {
	public static MobileFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("Apple")) {
			return new AppleMobileFactory();
		} else if (choice.equalsIgnoreCase("Android")) {
			return new AndroidMobileFactory();
		}
		return null;
	}
}
