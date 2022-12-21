package gpcoder.java.basic.switchcase;

public class SwitchCaseIST {
	public static void main(String[] args) {
		int gender = 0;

		switch (gender) {
		case 0:
			System.out.println("Hi! Mr!");
			break;
		case 1:
			System.out.println("Hi! Mrs!");
			break;
		case 2:
			System.out.println("Hi!");
			break;
		default:
			System.out.println("Invalid Option");
			break;
		}
	}
}
