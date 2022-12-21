package gpcoder.java.basic.datetime;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("deprecation")
public class DateTimeIST {
	public static void main(String[] args) {
		// Current Time Millis
		System.out.println("Current time mili: " + System.currentTimeMillis());

		// Time Unit
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println("To Minute: " + TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis));
		System.out.println("To Day: " + TimeUnit.MILLISECONDS.toDays(currentTimeMillis));
		System.out
				.println("To Microsecond: " + TimeUnit.MILLISECONDS.convert(currentTimeMillis, TimeUnit.MICROSECONDS));

		// Date
		Date currentDate = new Date();
		Date currentDateMillis = new Date(currentTimeMillis);
		Date dayOfBirth = new Date(2001, 1, 16);
		System.out.println("Current date: " + currentDate);
		System.out.println("Current date (millis): " + currentDateMillis);
		System.out.println("Date of birth: " + dayOfBirth);
		System.out.println("Compare: " + currentDate.compareTo(currentDateMillis));
		System.out.println("dateOfBirth before currentDate: " + dayOfBirth.before(currentDate));
		System.out.println("dateOfBirth after currentDate: " + dayOfBirth.after(currentDate));
	}
}
