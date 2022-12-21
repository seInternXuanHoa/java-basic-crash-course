package gpcoder.java.basic.mutable;

public class MutableIST {
	public static void main(String[] args) {
		MutableObject mutableObject = new MutableObject("Mutable");
		ImmutableObject immutableObject = new ImmutableObject("Immutable Object");

		// Mutable
		System.out.println(mutableObject);
		System.out.println(mutableObject.getName());
		mutableObject.setName("Mutable Object");
		System.out.println(mutableObject);

		// Immutable
		System.out.println(immutableObject);
		System.out.println(immutableObject.getName());

	}
}
