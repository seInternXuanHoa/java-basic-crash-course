package gpcoder.java.basic.whileloop;

public class WhileIST {
	public static void main(String[] args) {
		int index = 0;

		// While
		while (index < 10) {
			System.out.println("Index (by while): " + index);
			index++;
		}

		// Do While
		do {
			System.out.println("Index (by do while): " + index);
			index++;
		} while (index < 10);
	}
}
