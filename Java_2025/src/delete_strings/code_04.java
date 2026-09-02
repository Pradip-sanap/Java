package delete_strings;

import java.util.ArrayList;

public class code_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC";
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i< str.length(); i++) {
//			char ch = str.charAt(i);
			
			for(int j=i+1; j< str.length()+1; j++) {
				list.add(str.substring(i, j));
			}
		}
		
		System.out.println(list);

	}

}
