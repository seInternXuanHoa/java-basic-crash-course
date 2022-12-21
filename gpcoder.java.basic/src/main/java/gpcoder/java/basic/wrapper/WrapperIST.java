package gpcoder.java.basic.wrapper;

public class WrapperIST {
	public static void main(String[] args) {
		int age = 21;

		Integer iwAge = Integer.valueOf(age);
		int iAge = iwAge.intValue();

		System.out.println("iwAge value: " + iwAge + ", has type: " + iwAge.getClass().getSimpleName());
		System.out.println("iAge value: " + iAge + ", has type: " + Integer.valueOf(iAge).getClass().getSimpleName());

		System.out.println("Compare: " + (iwAge == age));
		System.out.println("Equal: " + (iwAge.equals(age)));
	}
}
