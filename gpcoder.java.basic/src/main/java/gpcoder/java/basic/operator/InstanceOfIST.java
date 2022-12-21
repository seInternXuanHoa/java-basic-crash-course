package gpcoder.java.basic.operator;

public class InstanceOfIST {
	public static void main(String[] args) {
		int age = 21;
		Integer iwAge = Integer.valueOf(age);

		if (iwAge instanceof Integer) {
			System.out.println("iwAge type is Integer!");
		} else {
			System.out.println("iwAge type is not Integer!");
		}
	}
}
