package _08_Enum;

enum Days{
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

enum States{
	MAHARASHTRA, GUJRAT, GOA, DELHI, PUNJAB, HYDRABAD, BANGLORE
}

enum Status{
	CREATED(200), UNAUTHORIZED(401), SUCCESS(200);
	
	private final int code;
	
	Status(int code){
		this.code = code;
	}
	
	int getCode() {
		return code;	
	}
}

enum Planet{
	MERCURY(10),
	VENUS(20),
	MARSH(30);

	private  double mass;
	Planet(int i) {
		this.mass = i;
	}
	
	// Getter
    double getMass() { return mass; }
    
    void set(int i) {
    	this.mass = i;
    }
	
	
}
public class enums {

	public static void main(String[] args) {
//		Days day = Days.Friday;
//		System.out.println(Days.Friday );
//		
//		int code =Status.CREATED.getCode();
//		System.out.println(code);
		States var = States.MAHARASHTRA;
		System.out.println(var);
	}

}
