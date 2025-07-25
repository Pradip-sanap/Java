package _02_Abstract_Factory;

public class AndroidMobileFactory implements MobileFactory {
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