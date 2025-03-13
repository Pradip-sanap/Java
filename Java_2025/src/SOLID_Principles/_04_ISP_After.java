package SOLID_Principles;


interface _Workable {
    void work();
}

interface _Eatable {
    void eat();
}

class _Developer implements _Workable, _Eatable {
    @Override
    public void work() {
        System.out.println("Developer is coding.");
    }

    @Override
    public void eat() {
        System.out.println("Developer is eating.");
    }
}

class _Robot implements _Workable {
    @Override
    public void work() {
        System.out.println("Robot is working.");
    }
}
public class _04_ISP_After {


	public static void main(String[] args) {
		_Workable developer = new _Developer();
        developer.work();

        _Eatable eatableDeveloper = (_Eatable) developer;
        eatableDeveloper.eat();

        _Workable robot = new _Robot();
        robot.work();

	}

}
