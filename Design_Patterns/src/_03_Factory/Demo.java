package _03_Factory;

 

public class Demo {

	public static void main(String[] args) {
		MobileFactory factory = new MobileFactory();

		Lenovo len = (Lenovo) factory.createMobile("len");
		len.batteryPower();

		Samsung sam = (Samsung) factory.createMobile("sam");
		sam.cost();

	}

}
