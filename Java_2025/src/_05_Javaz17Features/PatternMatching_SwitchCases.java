package _05_Javaz17Features;

public class PatternMatching_SwitchCases {

	public static void main(String[] args) {
		//Pattern matching
		// before
		Object obj = "MyString";
		if(obj instanceof String) {
			String s = (String) obj;
			System.out.println(s);
		}
		
		//after 
		if(obj instanceof String str) {
			System.out.println(str);
		}
		
		//Pattern matching in switch cases:
		switch(obj) {
		case Integer i -> System.out.println(i * 10);
		case String str -> System.out.println(str.toUpperCase());
		case Double d -> System.out.println(d + 10.5);
		case null -> System.out.println("Null value provided");
		default -> System.out.println("Unknown type!!");
		}

	}

}
