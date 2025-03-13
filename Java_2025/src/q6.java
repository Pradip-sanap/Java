
public class q6 {
	int x, y;
	

	public q6(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	@Override
	public String toString() {
		return "q6 [x=" + x + ", y=" + y + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q6 p1 = new q6(3, 4);
		q6 p2 = new q6(5, 6);
		
		System.out.println(p1);
		System.out.println(p1.toString());

	}

}
