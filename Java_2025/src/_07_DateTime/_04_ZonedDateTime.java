package _07_DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class _04_ZonedDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime now  = ZonedDateTime.now();
		System.out.println(now);
		
		ZonedDateTime time = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(time);
		
		ZoneId.getAvailableZoneIds().forEach(System.out::println);

//		Convert to Another Time Zone
		ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		ZonedDateTime nyTime = indiaTime.withZoneSameInstant(ZoneId.of("America/New_York"));

		System.out.println(indiaTime);  // 2025-06-11T14:30+05:30[Asia/Kolkata]
		System.out.println(nyTime);     // 2025-06-11T05:00-04:00[America/New_York]

		
		

	}

}
