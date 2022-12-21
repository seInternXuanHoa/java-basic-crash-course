package gpcoder.java.basic.datatype;

public class DataTypesIST {
	public static void main(String[] args) {
		// Integer:
		byte bNumber = 1;
		short sNumber = 1;
		int iNumber = 1;
		long lNumber = 1L;

		System.out.println(
				"bNumber value: " + bNumber + ", has type: " + Byte.valueOf(bNumber).getClass().getSimpleName());
		System.out.println(
				"sNumber value: " + sNumber + ", has type: " + Short.valueOf(sNumber).getClass().getSimpleName());
		System.out.println(
				"iNumber value: " + iNumber + ", has type: " + Integer.valueOf(iNumber).getClass().getSimpleName());
		System.out.println(
				"lNumber value: " + lNumber + ", has type: " + Long.valueOf(lNumber).getClass().getSimpleName());

		// Double:
		float fNumber = 1F;
		double dNumber = 1;

		System.out.println(
				"fNumber value: " + fNumber + ", has type: " + Float.valueOf(fNumber).getClass().getSimpleName());
		System.out.println(
				"dNumber value: " + dNumber + ", has type: " + Double.valueOf(dNumber).getClass().getSimpleName());

		// Char:
		char cNumber = 'a';
		System.out.println(
				"cNumber value: " + cNumber + ", has type: " + Character.valueOf(cNumber).getClass().getSimpleName());

		// Boolean:
		boolean bTrue = true;
		System.out
				.println("bTrue value: " + bTrue + ", has type: " + Boolean.valueOf(bTrue).getClass().getSimpleName());

		// Array

		// Object
	}
}
