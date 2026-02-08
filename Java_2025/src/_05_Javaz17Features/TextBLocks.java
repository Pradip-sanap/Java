package _05_Javaz17Features;

public class TextBLocks {

	public static void main(String[] args) {
		String text = """
				{
					"name":"Pradip",
					"age": 24,
					"email": "pradip@gmail.com"
				}	
				""".stripIndent();
		
		System.out.println(text);

	}

}
