package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayPrograms {
	/*
	 * if we have primitive array(i.e, int[]) we have to wrap or box that first into its
	 * respective class (Integer[]) using stream, collect into list and then use
	 * collections methods But if we have direct wrapper class array like Integer[]
	 * we can directly convert that array into list and then use collections methods
	 */

	public static void main(String[] args) {
		// Primitive Array
		int[] primitiveArray = { 2, 5, 10, 2, 10, 10 };
		List<Integer> primitiveList = Arrays.stream(primitiveArray).boxed().collect(Collectors.toList());
		Collections.sort(primitiveList);
		Collections.sort(primitiveList, Collections.reverseOrder());
		Collections.max(primitiveList);
		Collections.min(primitiveList);
		Collections.reverse(primitiveList);

		int frequency = Collections.frequency(primitiveList, 10);
		System.out.println("Frequency of 10: " + frequency);

		Set<Integer> primitiveDuplicates = primitiveList.stream()
				.filter(i -> Collections.frequency(primitiveList, i) > 1).collect(Collectors.toSet());
		//for finding duplicate elements 
	}

	public static void main1(String[] args) {
		// Wrapper Array
		Integer[] nonPrimitiveArray = { 2, 4, 5 };
		List<Integer> nonPrimitiveList = new ArrayList<>(Arrays.asList(nonPrimitiveArray));
		Collections.sort(nonPrimitiveList);
		Collections.sort(nonPrimitiveList, Collections.reverseOrder());
		Collections.max(nonPrimitiveList);
		Collections.min(nonPrimitiveList);
		Collections.reverse(nonPrimitiveList);
		
		int frequency = Collections.frequency(nonPrimitiveList, 5);
		System.out.println("Frequency of 10: " + frequency);
		
		
		Set<Integer> nonPrimitiveDuplicates = nonPrimitiveList.stream()
				.filter(i -> Collections.frequency(nonPrimitiveList, i) > 1).collect(Collectors.toSet());
		//prints only the elements that are repeated.

	}

	public static void main2(String[] args) {

		// String Array
		String[] stringArray = { "a", "b", "c" };
		List<String> stringList = new ArrayList<>(Arrays.asList(stringArray));
		Collections.sort(stringList);
		Collections.sort(stringList, Collections.reverseOrder());
		Collections.max(stringList);
		Collections.min(stringList);
		Collections.reverse(stringList);

		int frequency = Collections.frequency(stringList, "a");
		System.out.println("Frequency of 10: " + frequency);
		
		Set<String> stringDuplicates = stringList.stream().filter(i -> Collections.frequency(stringList, i) > 1)
				.collect(Collectors.toSet());
		//prints only the strings that are repeated.

	}
}