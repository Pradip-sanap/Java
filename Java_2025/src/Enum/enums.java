package Enum;

enum Days{
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
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
public class enums {

	public static void main(String[] args) {
		Days day = Days.Friday;
		System.out.println(Days.Friday );
		
		int code =Status.CREATED.getCode();
		System.out.println(code);
	}

}
