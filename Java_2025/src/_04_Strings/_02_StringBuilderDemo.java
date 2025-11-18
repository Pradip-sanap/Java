package _04_Strings;

public class _02_StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		str.append("India");
		str.append(" is country");
		str.insert(9, "my ");

//		str.append(88);		// append integer

//		System.out.println(str.charAt(3));
//		
//		System.out.println(str.capacity());
//		System.out.println(str.length());

//		str.append("aabb");
//		System.out.println(str);
//		System.out.println(str.delete(19, 24));

//		str.deleteCharAt(2);

		str.reverse();
		System.out.println(str);
		
		

//		--------------GPT code snippet-----------------
		// Create a StringBuilder
		StringBuilder sb = new StringBuilder("Hello");

		// Append a string to the end
		sb.append(" World");
		System.out.println("After append: " + sb);

		// Insert a string at a specific position
		sb.insert(6, "Java ");
		System.out.println("After insert: " + sb);

		// Replace a part of the string
		sb.replace(6, 10, "Beautiful");
		System.out.println("After replace: " + sb);

		// Delete a part of the string
		sb.delete(6, 15);
		System.out.println("After delete: " + sb);

		// Reverse the entire string
		sb.reverse();
		System.out.println("After reverse: " + sb);

		// Get the current length of the StringBuilder
		System.out.println("Length: " + sb.length());

		// Get the capacity of the StringBuilder
		System.out.println("Capacity: " + sb.capacity());

		// Ensure capacity
		sb.ensureCapacity(50);
		System.out.println("Capacity after ensuring: " + sb.capacity());

		// Set a new length (truncate or pad with null characters)
		sb.setLength(10);
		System.out.println("After setLength (truncate or pad): " + sb);

		// Append a character
		sb.append('!');
		System.out.println("After append char: " + sb);

		// Get a character at a specific index
		System.out.println("Character at index 2: " + sb.charAt(2));

		// Set a character at a specific index
		sb.setCharAt(2, 'X');
		System.out.println("After setCharAt: " + sb);

		// Substring
		String sub = sb.substring(0, 5);
		System.out.println("Substring (0 to 5): " + sub);

		// Delete a single character
		sb.deleteCharAt(4);
		System.out.println("After deleteCharAt: " + sb);

		// Replace with a StringBuilder itself
		StringBuilder newSb = new StringBuilder("Replacement String");
		sb.replace(0, sb.length(), newSb.toString());
		System.out.println("After replace with another StringBuilder: " + sb);
	}

}
