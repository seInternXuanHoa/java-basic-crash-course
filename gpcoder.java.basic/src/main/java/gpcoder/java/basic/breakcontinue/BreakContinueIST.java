package gpcoder.java.basic.breakcontinue;

public class BreakContinueIST {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if (i == 20) {
				System.out.println("Skipped");
				continue;
			}
			if (i == 50) {
				System.out.println("Stopped");
				break;
			}
			System.out.println("Index: " + i);
		}
	}
}
