package gpcoder.java.basic.variable;

public class VariablesIST {
	// Static
	private static final String AUTHOR = "seInternXuanHoa";

	// Global
	private int age = 21;

	public static void main(String[] args) {
		// Local
		int salary = 1000;

		System.out.println("Salary: " + salary);
		System.out.println("Age: " + new VariablesIST().age);
		System.out.println("Author: " + VariablesIST.AUTHOR);
	}
}
