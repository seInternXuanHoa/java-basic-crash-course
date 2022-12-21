package gpcoder.java.basic.operator;

public class TernaryOperatorIST {
	public static void main(String[] args) {
		int gender = 0;

		String msg = (gender == 0) ? "Hi! Mr!" : ((gender == 1) ? "Hi! Mrs!" : "Hi!");
		System.out.println(msg);
	}
}
