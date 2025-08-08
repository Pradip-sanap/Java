package Strings_programs_Java_Guides;

import java.util.ArrayList;

// Calculate vovels and consonants in string
class NotValidVowel extends Exception{

	public NotValidVowel() {
		super();
	}
	public NotValidVowel(String mesg) {
		super(mesg);
	}
	
}


public class Prog6 {
	
	public static boolean checkVowel(char ch) throws NotValidVowel {
		 
		if( (ch>=65 && ch <=90) || (ch>=97 && ch <=122)) {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				return true;
			}
			return false;			
		}else {
			throw new NotValidVowel("Enter vowel is not correct");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str =  "Java Pro4gramming"; 
		int vowels = 0;
		int consonents = 0;
		
		for (char ch : str.replace(" ", "").toCharArray()) {
			try {
				if (checkVowel(ch)) {
					vowels += 1;
					continue;
				} 			
				consonents += 1;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(vowels);
		System.out.println(consonents);
		

	}

}
