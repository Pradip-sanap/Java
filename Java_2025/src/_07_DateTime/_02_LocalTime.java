package _07_DateTime;

import java.time.LocalTime;

public class _02_LocalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime now = LocalTime.now();                    // Current time
		LocalTime specificTime = LocalTime.of(14, 30, 22, 1232);      // 14:30 
		LocalTime parsed = LocalTime.parse("10:15:30");     // From string
		
		System.out.println(now);
		System.out.println(specificTime);
		System.out.println(parsed);
		
		LocalTime time = LocalTime.of(14, 30, 15, 123456789);
//		System.out.println(time.getHour());      // 14
//		System.out.println(time.getMinute());    // 30
//		System.out.println(time.getSecond());    // 15
//		System.out.println(time.getNano());      // 123456789
		
//		System.out.println(now.toSecondOfDay());
//		System.out.println(now.toNanoOfDay());

//		LocalTime time = LocalTime.of(10, 0);
//		System.out.println(time.plusHours(2));      // 12:00
//		System.out.println(time.plusMinutes(45));   // 10:45

//		LocalTime time = LocalTime.of(12, 30);
//		System.out.println(time.minusHours(1));     // 11:30
//		System.out.println(time.minusMinutes(15));  // 12:15
		
//		LocalTime t1 = LocalTime.of(10, 30);
//		LocalTime t2 = LocalTime.of(11, 00);
//
//		System.out.println(t1.isBefore(t2));   // true
//		System.out.println(t1.isAfter(t2));    // false
		
//		LocalTime midnight = LocalTime.MIDNIGHT;   // 00:00
//		LocalTime noon = LocalTime.NOON;           // 12:00
//		LocalTime min = LocalTime.MIN;             // 00:00:00.000
//		LocalTime max = LocalTime.MAX;             // 23:59:59.999999999

		
		




	}

}
