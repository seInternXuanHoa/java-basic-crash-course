package gpcoder.java.basic.string;

public class StringBuilderIST {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		StringBuilder otherStringBuilder = new StringBuilder(100);
		StringBuilder builder = new StringBuilder("seInternXuanHoa");

		System.out.println("String length: " + builder.length());
		System.out.println("String append: " + builder.append("!"));
		System.out.println("String insert: " + builder.insert(0, "!"));
		System.out.println("Delete char at: " + builder.deleteCharAt(0));
		System.out.println("Delete char: " + builder.delete(1, 5));
		builder.setCharAt(0, '!');
		System.out.println("Set char at: " + builder);
		builder.setLength(5);
		System.out.println("Set length: " + builder);
		System.out.println("Replace: " + builder.replace(0, 1, "seInternXuanHoa"));
		System.out.println("Reverse: " + builder.reverse());
		System.out.println("Char at index 3: " + builder.charAt(3));
		System.out.println("Sub string: " + builder.substring(1, 3));
		System.out.println("To string: " + builder.toString());
		System.out.println("Index of first 'a': " + builder.indexOf("a", 0));
		System.out.println("Index of last 'a': " + builder.lastIndexOf("a", 0));
	}
}
