package javaPrograms;

public class Programs2 {
	public static void main(String[] args) {
		String str = "hello world";
		String sb = new StringBuffer(str).reverse().toString();
	}

	// Since strings are immutable, we cannot directly use a reverse function like we do with StringBuffer.
	// The length of a string is counted starting from 1 (like 1, 2, 3…), 
	// but indexing in a string starts from 0. 
	// So, to access the last character, we use length-1. 
	// For example, in the string "Hello", the length is 5, 
	// but the last character 'o' is at index 4. 
	// When reversing, we start from index 4 and go backward: o, l, l, e, H.

	public static void main1(String[] args) {
		String str = "Hello";
		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}

		System.out.println("Original String: " + str);
		System.out.println("Reversed String: " + reversed);
	}

	
	
	
	
	public static void main2(String[] args) {
		String str = "madam";
		String palin = new StringBuffer(str).reverse().toString();
		if (str.equals(palin)) {
			System.out.println("palind");
		} else {
			System.out.println("not palind");
		}

	}

}