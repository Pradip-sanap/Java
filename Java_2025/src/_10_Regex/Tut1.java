package _10_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tut1 {

	public static void main(String[] args) {
		String str = "42a23";
//		System.out.println(str.matches("[a-z0-9]+"));;

		
		
		String s2 = "JavaDeveloper";
		String s3 = "PythonDeveloper";
		
		System.out.println(s2.matches("^Java.*"));
		System.out.println(s3.matches("^Java.*"));

		String text = "I bought 5 apples and 20 bananas";
		
		Pattern ptn = Pattern.compile("\\d+");
		Matcher m = ptn.matcher(text);
		while(m.find()) {
			System.out.println(m.group());
		}
		
		String text2 = "Hello    World   from   Java";
		String update = text2.replaceAll("\\s+", " ");
		System.out.println(update);
		
		
		String mobile1 = "9876543210";
		String mobile2 = "12a3456789";
		String regex = "^[0-9]{10}$";
		System.out.println(mobile1.matches(regex));
		System.out.println(mobile2.matches(regex));
		
	}

}
