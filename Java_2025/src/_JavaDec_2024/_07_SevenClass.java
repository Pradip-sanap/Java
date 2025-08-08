package _JavaDec_2024;


class Worker{
	private int privateVar = 10;
	protected int protectedVar = 20;
	public int publicVar = 30;
	int defaultVar = 40;
}

class BMC extends Worker {
	protected void print() {
//		System.out.println("privateVar->", privateVar);
		System.out.println("protectedVar->"+ protectedVar);
		System.out.println("publicVar->"+ publicVar);
		System.out.println("defaultVar->"+ defaultVar);
	}
}


public class _07_SevenClass {
	
	private int privateVar = 10;
	protected int protectedVar = 20;
	public int publicVar = 30;
	int defaultVar = 40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		BMC b = new BMC();
//		b.print();
		
		Worker w = new Worker();
//		System.out.println(w.protectedVar);
//		System.out.println("publicVar->"+ w.publicVar);
//		System.out.println("defaultVar->"+ w.defaultVar);

	}

}
