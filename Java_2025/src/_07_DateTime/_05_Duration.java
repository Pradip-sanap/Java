package _07_DateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

public class _05_Duration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Instant now = Instant.now();
//		System.out.println(now);
//		
//		Instant t1 = Instant.now();
//		for(int i=0; i<10000; i++) {
//			if(i%43==0) {
//				System.out.println("hello");				
//			}
//		}
//		Instant t2 = Instant.now();
//		
//		Duration diff = Duration.between(t1, t2);
//		System.out.println(diff.getNano());
		
		
		LocalTime t1 = LocalTime.of(10, 0);
		LocalTime t2 = LocalTime.of(12, 30);
		Duration diff = Duration.between(t1, t2);
		System.out.println(diff.toMinutes());  // 150 minutes

	}

}
