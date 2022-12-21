package gpcoder.java.basic.datetime;

import java.util.Calendar;
import java.util.Date;

public class CalenderIST {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Date of week: " + calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("Date of month: " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Date of year: " + calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println("Hours of date: " + calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Date: " + calendar.get(Calendar.DATE));
		System.out.println("Month: " + calendar.get(Calendar.MONTH));
		System.out.println("Year: " + calendar.get(Calendar.YEAR));
		System.out.println("Hours: " + calendar.get(Calendar.HOUR));
		System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
		System.out.println("Second: " + calendar.get(Calendar.SECOND));
		System.out.println("Milisecond: " + calendar.get(Calendar.MILLISECOND));
		System.out.println("AM: " + calendar.get(Calendar.AM_PM));
		System.out.println("ERA: " + calendar.get(Calendar.ERA));
		System.out.println("Offset: " + calendar.get(Calendar.ZONE_OFFSET));

		// Roll
		calendar.roll(Calendar.DATE, false);
		System.out.println("Roll: " + calendar.getTime());
		
		// Add
		calendar.add(Calendar.YEAR, 1);
		System.out.println("Add: " + calendar.getTime());
		
		// Calendar to Date
		System.out.println("Calendar to Date: " + calendar.getTime());
		
		// Date to Calendar
		Date currentDate = new Date();
		calendar.setTime(currentDate);
		System.out.println("Date to Calendar: " + calendar.getTime());
		
	}
}
