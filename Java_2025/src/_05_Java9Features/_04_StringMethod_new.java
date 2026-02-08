package _05_Java9Features;

public class _04_StringMethod_new {

	public static void main(String[] args) {
		// isBlack(), lines(), strip(), repeat()
		
		String str = "Hello world, I learning java 11";
		System.out.println(str.isBlank());;
		System.out.println(str.isEmpty());;
		
		String str2 =  "   ";
		System.out.println(str2.isBlank());;
		System.out.println(str2.isEmpty());;
		
		// lines() method break the each line of string into stream. 
		String textBlock = """
			    It was the best of times, it was the worst of times,
			    it was the age of wisdom, it was the age of foolishness,
			    it was the epoch of belief, it was the epoch of incredulity.
			    """;
		textBlock.lines().forEach(line -> System.out.println(line));
		
		// strip() : remove blank spaces from start and end
		String str3 = "  hello   ";
		String ans = str3.strip();
		System.out.println(ans);
		System.out.println(ans.length());
		
		//repeat() 
		System.out.println("-".repeat(40));
		System.out.println("*".repeat(7));

	}

}
