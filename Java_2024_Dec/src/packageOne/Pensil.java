package packageOne;

class PensilDefault{
	String name = "Radhe Radhe";
	public int age = 23;
	protected int salary = 100;
	private int token = 19;
	@Override
	public String toString() {
		return "PensilDefault [name=" + name + ", age=" + age + ", salary=" + salary + ", token=" + token + "]";
	}
	
	
	
}
class PensilProtect extends PensilDefault{
	public void show() {
		System.out.println("salary->"+ salary);
//		System.out.println("salary->"+ token);
	}
}

public class Pensil {
	String name = "Ram";
	public int age = 23;
	protected int salary = 50000;
	private String pass = "passkey";

	public static void main(String[] args) {

		PensilDefault p = new PensilDefault();
		String name = p.name;
		int myage = p.age;
		int mysalary = p.salary;
	

	}

}
