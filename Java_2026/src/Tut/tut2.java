package Tut;

import java.math.BigInteger;

//Important operators that i dont know. PRACT
public class tut2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		System.out.println(a++);
		System.out.println(a);
		
		String result = (a > 18) ? "Vote": "No vote";
		System.out.println(result);
		
		int b = 30;					//011110
		int c = 23;					//010111
		
		System.out.println(b & c);	//010110
		System.out.println(b | c);	//011111
		System.out.println(b ^ c);	//001001
		
		int d = 17;
		System.out.println(~d);
		
		System.out.println("---------------------------------");
		
		byte n1 = -1;
		int ans = n1 & 0xFF;
		System.out.println(ans); 
		
//		String binaryString = Integer.toBinaryString(n1);
//		System.out.println(binaryString);

		int myInt = -1;
		long mylong = Integer.toUnsignedLong(myInt);
		System.out.println("Int Max value:"+ Integer.MAX_VALUE);
		System.out.println(mylong);
		
		// Example 2: Parsing an unsigned integer from a string
        String unsignedIntStr = "4294967295"; // Maximum unsigned int value (2^32 - 1)
        int parsedUnsignedInt = Integer.parseUnsignedInt(unsignedIntStr);
        System.out.println("Parsed unsigned int from string: " + parsedUnsignedInt);
        
        // Example 3: Comparing two unsigned int values
        int x = -1; // This will be treated as 2^32 - 1
        int y = 1;  // This will be treated as 1
        int compareResult = Integer.compareUnsigned(x, y);
        if (compareResult < 0) {
            System.out.println(x + " is less than " + y + " when treated as unsigned.");
        } else if (compareResult > 0) {
            System.out.println(x + " is greater than " + y + " when treated as unsigned.");
        } else {
            System.out.println(x + " is equal to " + y + " when treated as unsigned.");
        }
        
     // Example 4: Converting a long to its unsigned string representation
//        long myLong = -1L; // A negative long value, but we treat it as unsigned
//        String unsignedLongStr = Long.toUnsignedString(myLong);
//        System.out.println("Unsigned string representation of long " + myLong + " is: " + unsignedLongStr);

     // Example 5: Parsing an unsigned long from a string
//        String unsignedLongStr = "18446744073709551615"; // Maximum unsigned long value (2^64 - 1)
//        long parsedUnsignedLong = Long.parseUnsignedLong(unsignedLongStr);
//        System.out.println("Parsed unsigned long from string: " + parsedUnsignedLong);
        
        
        // Big Integer hands on
        BigInteger isprime = new BigInteger("19");
        System.out.println(isprime.isProbablePrime(1));;
        
        BigInteger bigNum1 = new BigInteger("8738782889289218919283927329839232");
        System.out.println(bigNum1.compareTo(new BigInteger("9")));
        BigInteger bigNum2 = new BigInteger("8");
        BigInteger add = bigNum1.add(bigNum2);
        System.out.println(add);
		
        
        
	}

}
