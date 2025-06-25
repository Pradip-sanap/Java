package DateTime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Period;

public class _02_DateTime_exersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate datenow = LocalDate.now();
//		System.out.println(datenow);
		
		LocalDate specificDate = LocalDate.of(2023, 12, 25);
//		System.out.println(specificDate);
		
		LocalDate parseDate = LocalDate.parse("2025-05-19");
//		System.out.println(parseDate);
		
//		LocalDate date = LocalDate.of(2025, 6, 11);
//		System.out.println(date.getYear());         // 2025 
//		System.out.println(date.getDayOfMonth());   // 11 
//		System.out.println(date.getDayOfYear());    // 162
 
		
//		LocalDate date = LocalDate.of(2025, 1, 1);
//		System.out.println(date.plusDays(5));      // 2025-01-06
//		System.out.println(date.plusWeeks(2));     // 2025-01-15
//		System.out.println(date.plusMonths(1));    // 2025-02-01
//		System.out.println(date.plusYears(1));     // 2026-01-01

//		LocalDate date = LocalDate.of(2025, 3, 15);
//		System.out.println(date.minusDays(10));    // 2025-03-05
//		System.out.println(date.minusMonths(1));   // 2025-02-15
		
//		System.out.println(LocalDate.of(2024, 1, 1).isLeapYear()); // true
//		System.out.println(LocalDate.of(2025, 1, 1).isLeapYear()); // false

//		LocalDate d1 = LocalDate.of(2025, 6, 10);
//		LocalDate d2 = LocalDate.of(2025, 6, 11);
//		System.out.println(d1.isBefore(d2));    // true
//		System.out.println(d1.isAfter(d2));     // false
//		System.out.println(d1.isEqual(d2));
		
//		LocalDate feb2024 = LocalDate.of(2024, 2, 1);  // Leap year
//		System.out.println(feb2024.lengthOfMonth());   // 29
//		System.out.println(feb2024.lengthOfYear());    // 366
		
		LocalDate start = LocalDate.of(2023, 1, 1);
		LocalDate end = LocalDate.of(2025, 6, 11);

		Period diff = start.until(end);
		System.out.println(diff.getYears() + " years, " + diff.getMonths() + " months, " + diff.getDays() + " days");



		
		
		

	}

}
