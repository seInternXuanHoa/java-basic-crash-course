package gpcoder.java.basic.operator;

public class OperatorIST {
	public static void main(String[] args) {
		double x = 20;
		double y = 15;

		System.out.println("Value of x + y: " + (x + y));
		System.out.println("Value of x - y: " + (x - y));
		System.out.println("Value of x * y: " + (x * y));
		System.out.println("Value of x / y: " + (x / y));
		System.out.println("Value of x / y (int): " + ((int) x / (int) y));
		System.out.println("Value of x % y: " + (x % y));
		System.out.println("Next value of x: " + (++x));
		System.out.println("Previous value of y: " + (--y));
	}
}
