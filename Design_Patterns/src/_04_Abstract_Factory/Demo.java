// Abstract Product
package _04_Abstract_Factory;

public class Demo {
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
