package _07_DateTime;

import java.time.LocalDateTime;

public class _03_LocalDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now = LocalDateTime.now();                             // Current date & time
		LocalDateTime specific = LocalDateTime.of(2025, 6, 11, 14, 30);      // 2025-06-11T14:30
		LocalDateTime parsed = LocalDateTime.parse("2025-06-11T14:30:15");   // From ISO String

		System.out.println(now);
		
		LocalDateTime time = LocalDateTime.of(2025,  01, 01, 02, 15, 30);
		System.out.println(time);
		System.out.println(time.getDayOfMonth());
		System.out.println(time.getDayOfYear());
		
		LocalDateTime dt1 = LocalDateTime.of(2025, 6, 11, 10, 0);
		LocalDateTime dt2 = LocalDateTime.of(2025, 6, 11, 14, 0);

		System.out.println(dt1.isBefore(dt2));  // true
		System.out.println(dt1.isAfter(dt2));   // false
		System.out.println(dt1.isEqual(dt2));   // false
		
		LocalDateTime min = LocalDateTime.MIN;
		LocalDateTime max = LocalDateTime.MAX;



	}

}
