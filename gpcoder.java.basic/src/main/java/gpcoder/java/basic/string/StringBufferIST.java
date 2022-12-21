package gpcoder.java.basic.string;

public class StringBufferIST {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		StringBuffer otherStringBuffer = new StringBuffer(100);
		StringBuffer buffer = new StringBuffer("seInternXuanHoa");

		System.out.println("String length: " + buffer.length());
		System.out.println("String append: " + buffer.append("!"));
		System.out.println("String insert: " + buffer.insert(0, "!"));
		System.out.println("Delete char at: " + buffer.deleteCharAt(0));
		System.out.println("Delete char: " + buffer.delete(1, 5));
		buffer.setCharAt(0, '!');
		System.out.println("Set char at: " + buffer);
		buffer.setLength(5);
		System.out.println("Set length: " + buffer);
		System.out.println("Replace: " + buffer.replace(0, 1, "seInternXuanHoa"));
		System.out.println("Reverse: " + buffer.reverse());
		System.out.println("Char at index 3: " + buffer.charAt(3));
		System.out.println("Sub string: " + buffer.substring(1, 3));
		System.out.println("To string: " + buffer.toString());
		System.out.println("Index of first 'a': " + buffer.indexOf("a", 0));
		System.out.println("Index of last 'a': " + buffer.lastIndexOf("a", 0));
	}
}
