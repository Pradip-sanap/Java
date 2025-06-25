package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class _06_Period {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dobDate = LocalDate.of(2001, 06, 01);
		LocalTime dobTime = LocalTime.of(18, 05, 45);
		LocalDateTime dob = LocalDateTime.of(dobDate, dobTime);
		System.out.println(dob);
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		Period diff = Period.between(dob.toLocalDate(), today.toLocalDate());
		System.out.println("You live for : ");
		System.out.println(diff.getYears() + " Years " + diff.getMonths() + " Months " + diff.getDays() + " Minutes");
		 
		long totalDays = dob.toLocalDate().until(today.toLocalDate(), ChronoUnit.DAYS);
		System.out.println(totalDays);
		long totalHours = dob.until(today, ChronoUnit.HOURS);
		System.out.println(totalHours);
		long totalMinutes = dob.until(today, ChronoUnit.MINUTES);
		System.out.println(totalMinutes);
		long totalMonth = dob.until(today, ChronoUnit.MONTHS);
		System.out.println(totalMonth);
		
		
		

	}

}
