package _01_Basics;

import java.math.BigInteger;
import java.util.HashMap;
 

class AA{
	public int one=1;
	protected int two=2;
	private int three=3;
	int four=4;
	
}

class C extends AA{
	void foo2() {
		System.out.println(this.four);
	}
}

class BB{
	
	void foo() {
		AA a = new AA();
		
	}
}

class Account{
	Account getAccount() {
		return this;
	}
}

public class temp {
	
	public int one=1;
	protected int two=2;
	private int three=3;
	int four=4;

	public static void main(String[] args) {
		
		Account aa = new Account();
		Account account = aa.getAccount();
		// TODO Auto-generated method stub
		BigInteger num1 = new BigInteger("12345678987654332934903432434334234234234234");
		BigInteger num2 = new BigInteger("6");
		
		BigInteger ans = num1.add(num2);
		System.out.println(ans);
		
		System.out.println(num1.bitCount());
		System.out.println(num1.gcd(num2));
		
		Integer num = Integer.MAX_VALUE;
		System.out.println(num);
		System.out.println(num+2);
		
		int n1= 30;
		int n2= 40;
		int n3 = 20;
		
		if(n1 >= n2) {
			if(n1 > n3) {
				System.out.println(n1);
			}
		} else if( n2 >= n3) {
			System.out.println(n2);
		} else {
			System.out.println(n3);
		}
		
		
		// leap year checker
		int year = 2024;
		
		if((year % 400 ==0) || (year % 4==0 && year % 100 !=0)) {
			System.out.println("Leap");
		}
		
		// loan eligibility
		
		int age = 24;
		int salary = 60000;
		int creditScore = 700;
		
		if(age>21 && salary>30000 && creditScore>400) {
			System.out.println("You can avail loan");
		}
		
		
		// switch case
		int ch = 3;
		
		switch(ch) {
		case 1: 
			break;
		case 2: 
			break;
		case 3:
			break;
		default:
			System.out.println("Invalid Input");
		}
		
		
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		HashMap<Integer, String> name = new HashMap<Integer, String>();
		
		name.put(1, "Sharayu");
		name.put(2,  "Shreyash");
		name.put(3,  "vivek");
		
		for(var ele : name.entrySet()) {
			System.out.println(ele.getKey());
			System.out.println(ele.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
