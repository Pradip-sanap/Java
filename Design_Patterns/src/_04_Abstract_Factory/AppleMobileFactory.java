package _04_Abstract_Factory;

public class AppleMobileFactory implements MobileFactory {

	@Override
	public Mobile createMobile(String type) {
		if (type.equalsIgnoreCase("iPhone")) {
			return new IPhone();
		}
		return null;
	}

}
