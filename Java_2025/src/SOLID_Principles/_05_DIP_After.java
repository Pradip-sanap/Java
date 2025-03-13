package SOLID_Principles;

interface Switchable {
	void turnOn();
	void turnOff();
}

class LightBulb implements Switchable {
	@Override
	public void turnOn() {
		System.out.println("LightBulb is turned on");
	}

	@Override
	public void turnOff() {
		System.out.println("LightBulb is turned off");
	}
}

class Switch {
	private Switchable switchable;

	public Switch(Switchable switchable) {
		this.switchable = switchable;
	}

	public void flip(boolean on) {
		if (on) {
			switchable.turnOn();
		} else {
			switchable.turnOff();
		}
	}
}

public class _05_DIP_After {

	public static void main(String[] args) {
		Switchable lightBulb = new LightBulb();
		Switch lightSwitch = new Switch(lightBulb);
		lightSwitch.flip(true); // Output: LightBulb is turned on
		lightSwitch.flip(false); // Output: LightBulb is turned off

	}

}
