package delete_strings;

import java.util.HashSet;

public class code_03 {
	
	private static HashSet<String> set = new HashSet<>();
	
	public  void permute(String prefix, String remaining) {
		
		if(remaining.isEmpty()) {
			set.add(prefix);
			return;
		}
		
		for(int i=0; i<remaining.length(); i++) {
			char ch = remaining.charAt(i);
			String ros = remaining.substring(0, i) + remaining.substring(i+1);
			permute(prefix + ch, ros);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC";
		code_03 obj = new code_03();
		obj.permute("", str);
		try {
			System.out.println(set.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String ssss = "hdfa";
		System.out.println(ssss.substring(0, 0));
		
	}

}
