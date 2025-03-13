
public class StringBuilderLearing {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder();
		str.append("Mi ahe pradip.");
		str.append("Preparing for interview.");
		System.out.println(str.length());
		System.out.println(str.insert(3, "Sanny "));
		System.out.println(str.charAt(4));
		System.out.println(str.reverse());
		System.out.println(str.delete(3, 8));
		
		
	}

}
