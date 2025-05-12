// Abstract Product
package Abstract_Factory;

interface Mobile {
	void brandName();
}

//Concrete Product 1
class IPhone implements Mobile {
	@Override
	public void brandName() {
		System.out.println("This is an iPhone.");
	}
}

//Concrete Product 2
class OnePlus implements Mobile {
	@Override
	public void brandName() {
		System.out.println("This is a OnePlus phone.");
	}
}

//Concrete Product 3
class Sony implements Mobile {
	@Override
	public void brandName() {
		System.out.println("This is a Sony phone.");
	}
}

//Abstract Factory
interface MobileFactory {
	Mobile createMobile(String type);
}

//Apple Factory (Produces iPhones)
class AppleMobileFactory implements MobileFactory {
	@Override
	public Mobile createMobile(String type) {
		if (type.equalsIgnoreCase("iPhone")) {
			return new IPhone();
		}
		return null;
	}
}

//Android Factory (Produces OnePlus and Sony)
class AndroidMobileFactory implements MobileFactory {
	@Override
	public Mobile createMobile(String type) {
		if (type.equalsIgnoreCase("OnePlus")) {
			return new OnePlus();
		} else if (type.equalsIgnoreCase("Sony")) {
			return new Sony();
		}
		return null;
	}
}

class FactoryProducer {
	public static MobileFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("Apple")) {
			return new AppleMobileFactory();
		} else if (choice.equalsIgnoreCase("Android")) {
			return new AndroidMobileFactory();
		}
		return null;
	}
}

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		// Get Apple Factory
		MobileFactory appleFactory = FactoryProducer.getFactory("Apple");
		Mobile iphone = appleFactory.createMobile("iPhone");
		iphone.brandName();

		// Get Android Factory
		MobileFactory androidFactory = FactoryProducer.getFactory("Android");
		Mobile onePlus = androidFactory.createMobile("OnePlus");
		Mobile sony = androidFactory.createMobile("Sony");

		onePlus.brandName();
		sony.brandName();
	}
}
