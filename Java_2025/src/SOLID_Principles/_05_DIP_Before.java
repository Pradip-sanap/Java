package SOLID_Principles;

class LightBulb_ {
	public void turnOn() { /* Light turns on */ }

	public void turnOff() { /* Light turns off */ }
}

class Switch_ {
	private LightBulb_ bulb;

	public Switch_(LightBulb_ bulb) {
        this.bulb = bulb;
    }

	public void toggle() {
		bulb.turnOn();
	}
}

public class _05_DIP_Before {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
