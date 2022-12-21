package gpcoder.java.basic.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionIST {
	public static void main(String[] args) {
		String pattern = "seInternXuanHoa";
		String regex = String.valueOf("a");

		System.out.println("String match: " + pattern.matches(regex));
		System.out.println("Split string: " + Arrays.toString(pattern.split(regex)));
		System.out.println("Replace all: " + pattern.replaceAll(regex, "-"));

		Pattern pt = Pattern.compile(pattern);
		Matcher matcher = pt.matcher(regex);
		if (matcher != null) {
			System.out.println("Match!");
		} else {
			System.out.println("Not match!");
		}
	}
}
