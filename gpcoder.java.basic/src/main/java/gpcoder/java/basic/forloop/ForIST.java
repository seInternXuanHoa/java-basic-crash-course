package gpcoder.java.basic.forloop;

public class ForIST {
	public static void main(String[] args) {
		int[] randomNumbers = new int[10];
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = (int) Math.floor(Math.random() * 10);
		}

		// For
		for (int i = 0; i < randomNumbers.length; i++) {
			System.out.println("Index (for): " + randomNumbers[i]);
		}

		// For Each:
		for (int randomNumber : randomNumbers) {
			System.out.println("Index (foreach): " + randomNumber);
		}
	}
}
