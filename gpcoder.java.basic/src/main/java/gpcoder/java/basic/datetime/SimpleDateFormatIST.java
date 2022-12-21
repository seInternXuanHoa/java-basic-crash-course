package gpcoder.java.basic.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatIST {
	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		// String to Date:
		String time = "23/04/2005 23:11:59";
		Date date = null;
		try {
			date = dateFormat.parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(date);
		
		// Date to String:
		String timeString = dateFormat.format(date);
		System.out.println(timeString);
	}
}
