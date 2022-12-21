package gpcoder.java.basic.string;

public class StringIST {
	public static void main(String[] args) {
		// String Literal --> String Pool --> Stack
		String author = "seInternXuanHoa";
		String otherAuthor = "seInternXuanHoa";
		System.out.println(System.identityHashCode(author));
		System.out.println(System.identityHashCode(otherAuthor));

		// String Object --> Heap
		String authorObject = new String("seInternXuanHoa");
		String otherAuthorObject = new String("seInternXuanHoa");
		System.out.println(System.identityHashCode(authorObject));
		System.out.println(System.identityHashCode(otherAuthorObject));

		// Intern --> String Pool
		String internAuthorObject = new String("seInternXuanHoa").intern();
		String otherInternAuthorObject = new String("seInternXuanHoa").intern();
		System.out.println(System.identityHashCode(internAuthorObject));
		System.out.println(System.identityHashCode(otherInternAuthorObject));

		System.out.println("String length: " + author.length());
		System.out.println("Character of index 3: " + author.charAt(3));
		System.out.println("Compare to: " + author.compareTo(authorObject));
		System.out.println("Compare to ignore case: " + author.compareToIgnoreCase(authorObject));
		System.out.println("Concat: " + otherAuthor.concat(author) + ", origin string:" + otherAuthor);

		byte[] authorBytes = author.getBytes();
		char[] authorChars = new char[author.length()];
		author.getChars(0, author.length(), authorChars, 0);
		System.out.println("Get Bytes: " + authorBytes);
		System.out.println("Get Chars: " + authorChars);
		System.out.println("Copy value of: " + String.copyValueOf(authorChars));
		System.out.println("String equal: " + author.equals(authorObject));
		System.out.println("String equal ignore case: " + author.equalsIgnoreCase(authorObject));
		System.out.println("Start with 'e': " + author.startsWith("e"));
		System.out.println("End with 'e': " + author.endsWith("e"));
		System.out.println("Hash code: " + author.hashCode());
		System.out.println("First index of 'a': " + author.indexOf('a', 0));
		System.out.println("Last index of 'a': " + author.lastIndexOf('a', 0));
		System.out.println("Replace: " + author.replace('a', 'e'));
		System.out.println("Replace all: " + author.replaceAll("[ae]", "o"));
		System.out.println("Replace first: " + author.replaceFirst("[ae]", "o"));
		System.out.println("Split by [ao]: " + author.split("[ao]", 3).toString());
		System.out.println("Sub string: " + author.substring(10, 12));
		System.out.println("Sub sequence: " + author.subSequence(0, 5));
		System.out.println("To char array: " + author.toCharArray());
		System.out.println("Lower case: " + author.toLowerCase());
		System.out.println("Upper case: " + author.toUpperCase());
		System.out.println("To String: " + author.toString());
		System.out.println("Trim: " + author.trim());

		// Regex method:
	}
}
