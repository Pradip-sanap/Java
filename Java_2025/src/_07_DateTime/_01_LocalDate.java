package _07_DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class _01_LocalDate {

	public static void main(String[] args) {
		//--------------Local Date----------------
//		LocalDate now = LocalDate.now();
		LocalDate now = LocalDate.of(2025, 1, 29);
		System.out.println(now.getDayOfMonth());;
		System.out.println(now.getDayOfWeek());;
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now);
		
		
		LocalDate myDate = LocalDate.of(1990, 2, 7);
		
		System.out.println("------------------------------------------");
		//-------------Local TIme--------------
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.getNano());
		System.out.println(time.minusHours(12).minusMinutes(2));
		
		//----------------------------------
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		System.out.println("------------------------------------------");
		//-------------Zoned Date Time----------
		ZonedDateTime z = ZonedDateTime.now();
		System.out.println(z);
		System.out.println(z.getZone());
		
		Instant now2 = Instant.now();
		 
	}

}
