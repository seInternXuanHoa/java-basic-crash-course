package gpcoder.java.basic.string;

import java.text.MessageFormat;
import java.util.Date;

public class StringFormatIST {
	public static void main(String[] args) {
		String name = "seInternXuanHoa";
		int age = 21;
		float salary = 1000;

		// Printf
		System.out.printf("Hi! I'm %s, %d year old, and has salary %f dollar!", name, age, salary);

		// String Format:
		System.out.println();
		String msg = String.format("Hi! I'm %s, %d year old, and has salary %f dollar!", name, age, salary);
		System.out.println(msg);

		// MessageFormat:
		String pattern = "Hi! I'm seInternXuanHoa, now at {0, time} on {0, date}";
		System.out.println(MessageFormat.format(pattern, new Date()));
	}
}
