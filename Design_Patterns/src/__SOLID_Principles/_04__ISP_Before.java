package __SOLID_Principles;
interface Worker {
    void work();
    void eat();
}

class Developer implements Worker {
    @Override
    public void work() {
        System.out.println("Developer is coding.");
    }

    @Override
    public void eat() {
        System.out.println("Developer is eating.");
    }
}

class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working.");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot does not eat.");		//<-----
    }
}
public class _04__ISP_Before {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
