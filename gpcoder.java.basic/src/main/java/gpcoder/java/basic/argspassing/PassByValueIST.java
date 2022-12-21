package gpcoder.java.basic.argspassing;

public class PassByValueIST {
	public static void main(String[] args) {
		int number = 10;
		System.out.println("Number: " + number);
		increase(number);
		System.out.println("Number: " + number);
	}
	
	public static int increase(int number) {
		return ++number;
	}
}
