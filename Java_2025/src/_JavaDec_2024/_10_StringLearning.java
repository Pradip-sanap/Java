package _JavaDec_2024;
import java.util.Arrays;

public class _10_StringLearning {
	
	public static void print(Object str) {
		System.out.println(str);
	}

	public static void main(String[] args) {

		String str = "Salubai Sankul society";
		
//		for(int i=0; i<str.length(); i++) {
//			System.out.print(str.charAt(i));
//		}
		
		print(str);
		print(str.length());
		print(str.charAt(3));
		print(str.substring(4, 7));
		print(str.toUpperCase());
		print(str.toLowerCase());
		print(str.replace('S', 'k').replace('s', 'k'));
		print(str.contains("society"));
		print(str.indexOf("society"));
		print(str.equals("lsdkjf"));
		
		String fruitsString = "apple,banana,mango,citaphal";
		String[] fruits = fruitsString.split(",");
		print(Arrays.toString(fruits));
		

	}

}
