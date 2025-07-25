package string_programs;

//check palindrome in string
public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		int strLen = str.length() - 1;
		for (int i = 0; i < strLen / 2; i++) {

			if (str.charAt(i) != str.charAt(strLen - i)) {
				System.out.println("Not a palindrome");
			}

		}
		System.out.println("Palindrome");

	}

}
