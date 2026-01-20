package javaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Programs1 {

	public static void main(String[] args) {

		// ------------------1. Count occurrence or frequency of 'A' in a String
		String input = "Amazon apple"; 
		char target = 'a';

		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == target) {
				count++;
			}
		}

		System.out.println("Occurrence of '" + target + "' = " + count);// we can write this statement inside loop also if we do that for every matching char it will print but we need only once right so we write outside the loop
	}

	public static void main1(String[] args) {
		String sentence = "My   name    is     Ram";
		String normalized = sentence.trim().replaceAll("\\s+", " ");
		System.out.println(normalized);
	}
/*
trim()-> Removes only leading and trailing spaces (front and back), Does not touch spaces in the middle.	
replaceAll("\\s+", " ")-> Replaces all groups of whitespace (tabs, spaces, newlines) anywhere in the string with a single space.
which acepts two parameters-> one regex and another what to replace in above case \\s is regex and one white space we have to replace.
*/
	public static void main2(String[] args) {
		int number = 5;
		long fact = 1;
		for (int i = 2; i <= number; i++) {
			fact *= i;
		}
		System.out.println(fact);
	}

	/*
	 * Factorial of a number is multiplying that number by every positive integer
	 * less than it, down to 1. Example- 5!=5×4×3×2×1=120 3!=3x2x1=6 0!=0(special
	 * case)
	 * 
	 * We are using long here because till 12! it fits in int but when we go for 13!
	 * it exceeds int max value which can fit till 20! only, For 21! long also
	 * overflows we can use BigInteger then
	 */

	public static void main3(String[] args) {
		String program = "pprogrrammingg";
		Set<Character> seen = new HashSet<>();
		Set<Character> duplicates = new HashSet<>();

		for (char c : program.toCharArray()) {
			if (seen.add(c)==false) {
				duplicates.add(c);
			}
		}
		System.out.println(duplicates);
	}


/*
 * Why do we use HashSet why not other collectons:-
 * 
 * Uniqueness guarantee-> A HashSet only stores unique elements. If you add the
 * same character again, it won’t duplicate it in the set.
 * 
 * Order doesn’t matter When finding duplicates, you usually don’t care about
 * the order of characters, only whether they’re duplicated or not.
 * [p, r, g, m]- this is the output if we use hashset
 * [p, r, m, g]- this is the output if we use linkedhashset
 * 
 * If we need particular order of elements then we need to use linkedhashset inplace of hashset
 * 
 */



//sort based on the numbers inside the filenames

    public static void main5(String[] args) {
        String arr[] = {"Fileinsert04262025#12.txt", "Fileinsert04262025#89.txt", "Fileinsert04262025#26.txt", "Fileinsert04262025#33.txt"};
        List<String> li = Arrays.asList(arr);

        // Custom comparator to compare based on numbers in the filename
        Collections.sort(li, (s1, s2) -> {
            // Extract the numbers after "#" and before ".txt"
            int num1 = Integer.parseInt(s1.split("#")[1].split("\\.")[0]);
            int num2 = Integer.parseInt(s2.split("#")[1].split("\\.")[0]);
            return Integer.compare(num2, num1); // Reverse order (largest first)
        });

        // Printing the sorted list
        System.out.println(li);
    }
}
