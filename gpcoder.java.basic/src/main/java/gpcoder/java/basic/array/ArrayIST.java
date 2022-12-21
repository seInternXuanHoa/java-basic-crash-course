package gpcoder.java.basic.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIST {
	public static void main(String[] args) {
		int[] randomNumbers = new int[10];

		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = (int) Math.floor(Math.random() * 100);
		}

		// Length
		System.out.println("Array length: " + randomNumbers.length);

		// Loop
		for (int i = 0; i < randomNumbers.length; i++) {
			System.out.println("Index (by for): " + randomNumbers[i]);
		}

		for (int randomNumber : randomNumbers) {
			System.out.println("Index (by for each): " + randomNumber);
		}

		// Copy
		int[] randomNumbersBak = new int[10];
		System.arraycopy(randomNumbers, 0, randomNumbersBak, 0, randomNumbers.length);
		System.out.println("Copy: " + Arrays.toString(randomNumbersBak));

		// As List:
		List<Integer> integers = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		System.out.println("Binary search: " + Arrays.binarySearch(randomNumbers, 3));
		Arrays.sort(randomNumbers);
		System.out.println("Sort: " + Arrays.toString(randomNumbers));

		// Copy of:
		System.out.println("Copy of: " + Arrays.toString(Arrays.copyOf(randomNumbers, 3)));
		System.out.println("Copy of range: " + Arrays.toString(Arrays.copyOfRange(randomNumbers, 4, 5)));
		
		// Clone:
		System.out.println("Clone: " + Arrays.toString(randomNumbers.clone()));
		
		// Equal:
		System.out.println("Equal: " + Arrays.equals(randomNumbers, randomNumbersBak));
		Arrays.fill(randomNumbers, 0);
		System.out.println("Fill: " + Arrays.toString(randomNumbers));
		
		// To String:
		System.out.println("To string: " + Arrays.toString(randomNumbersBak));

	}
}
