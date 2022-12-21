package gpcoder.java.basic.random;

import java.util.Random;

public class RandomIST {
	public static void main(String[] args) {
		Random random = new Random();
		
		System.out.println("Next Int: " + random.nextInt());
		System.out.println("Next Int: " + random.nextInt(10));
		System.out.println("Next Double: " + random.nextDouble());
		System.out.println("Next Long: " + random.nextLong());
		System.out.println("Next Float: " + random.nextFloat());
		System.out.println("Next Boolean: " + random.nextBoolean());
	}
}
