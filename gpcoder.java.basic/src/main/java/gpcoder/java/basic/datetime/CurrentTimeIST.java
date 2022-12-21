package gpcoder.java.basic.datetime;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class CurrentTimeIST {
	public static void main(String[] args) {
		System.out.println("Local time: " + LocalTime.now());
		System.out.println("Local date time: " + LocalDateTime.now());
		System.out.println("Clock: " + Clock.systemUTC().instant());
		System.out.println("Date: " + new Date());
		System.out.println("Calender: " + Calendar.getInstance().getTime());
	}
}
