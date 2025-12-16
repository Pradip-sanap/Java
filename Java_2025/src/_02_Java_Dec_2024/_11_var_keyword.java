package _02_Java_Dec_2024;
import java.io.*;

import java.lang.Runtime.Version;

public class _11_var_keyword {

	public static void main(String[] args) {
		var num = 10;
		var name  = "pradip"; 
		System.out.println(name);
		
		var version = Runtime.version();
		System.out.println(version);
		
		System.out.println("Enter passsword");
		Console console = System.console();
		char[] readPassword = console.readPassword();
		String password = new String(readPassword);
		System.out.println(password);

	}

}
