package Learn;
class A{
	A(){
		System.out.println("A contructor");
	}
	void add() {
		System.out.println("AA");
	}
}
class B extends A{
	B(){
		System.out.println("B contructor");
	}
	void add() {
		System.out.println("BB");
	}
}
class C extends B{
	C(){
		System.out.println("C contructor");
	}
	void add() {
		super.add(); 
		System.out.println("CC");
	}
	
	public void callAAdd() {
         
    }
}

public class tut1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.add();
	}

}
