package delete_strings;

import java.util.ArrayList;
import java.util.Collections;

public class code_06 {

	public static void main(String[] args) {
		String str = "Java is powerful";
		ArrayList<String> list = new ArrayList<>();
		int i=0;
		while(i < str.length()) {
			while(i < str.length() && Character.isWhitespace(str.charAt(i))) {
				i++;
			}
			if(i == str.length()) {
				break;
			}
			StringBuilder s = new StringBuilder();
			while(i < str.length() && Character.isLetterOrDigit(str.charAt(i))) {
				s.append(str.charAt(i));
				i++;
			}
			if (s.length() > 0) {
                list.add(s.toString());
            }
			
		}
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

	}

}
