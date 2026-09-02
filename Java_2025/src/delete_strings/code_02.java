package delete_strings;

public class code_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		check two strings are rotation of each other
		String s1 = "ABCD";
		String s2 = "BCDA";
		
		if(s1.length() != s2.length()) {
			System.out.println("Strings are not equal length.");
			return;
		}
		
		s1 = s1.repeat(2);
		System.out.println(s1);
		boolean contains = s1.contains(s2);
		System.out.println(contains);
		
		
		
		
//		String name = "pradip";
//		
//		System.out.println(name.substring(2));;
		
		
		//find lognest word in string
		String s = "I love programming very much";
		String[] words = s.split("\\s+");
		String result = "";
		int maxLengthWord = Integer.MIN_VALUE;
		for(String word : words) {
			int isMax = Integer.max(word.length(), maxLengthWord);
			if(isMax > result.length()) {
				result = word;
			}
		}
		
		System.out.println(result);
		
		
		
		
		 
		

	}

}
