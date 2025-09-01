package _09_Decorator;

public abstract class IcecreamDecorator implements Icecream {

	protected Icecream specialIcecream;

	public IcecreamDecorator(Icecream specialIcecream) {
		this.specialIcecream = specialIcecream;
	}

//	@Override
//	public String makeIcecream();
}