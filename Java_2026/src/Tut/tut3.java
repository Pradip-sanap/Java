package Tut;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

class AgeNotCompatibleException extends Exception{
	
	public AgeNotCompatibleException() {
		super();
	}
	
	public AgeNotCompatibleException(String mesg) {
		super(mesg);
	}
	
	public AgeNotCompatibleException(String mesg, Throwable cause) {
		super(mesg, cause);
	}
}

class Dummy {

	public void process() throws Exception{
		int age = 15;
		try {
//			int ans = 10 / 0;
//			System.out.println(ans);
			
			if(age < 18) {
//				throw new Exception("Under-age");
				throw new AgeNotCompatibleException("Your age in under 18");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getCause());
			System.out.println(e.getClass());
			StackTraceElement[] stackTrace = e.getStackTrace();
			System.out.println(Arrays.toString(stackTrace));
			Throwable[] suppressed = e.getSuppressed();
			System.out.println(Arrays.toString(suppressed));

		} finally {
			System.out.println("Resource clean up");

		}
	}
	
	public Object process2() {
		try {
			throw new Exception("Api fails");
		}catch(Exception e) {
			e.printStackTrace();
			return "pradip";
		}finally {
			System.out.println("Resource cleaned");
//			return "sanap";
		}
	}
	
	public void process3() {
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {	//This catch block can only declare with exceptions which may thrown from try block body.
			e.printStackTrace();																	//Checked Excpetions never get thrown from try body.
		}
	}
}

public class tut3 {

	public static void main(String[] args) {
		Dummy d = new Dummy();
		try {
//			d.process();
			Object result = d.process2();
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("App terminated smoothly.");

	}

}
