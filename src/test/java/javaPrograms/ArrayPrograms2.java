package javaPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayPrograms2 {
	public static void main(String[] args) 
	{
		/*
		Formulas for finding largest number,second largest number,Smallest,Second Smallest
		Largest → arr[arr.length - 1]
		Second Largest → arr[arr.length - 2]
		Smallest → arr[0]
		Second Smallest → arr[1]
		
If we take an example below- Here Array length is 4
Once i sort the array it will be in ascending order default
so last digit will be largest, previous one will be second largest,first one will be smallest(index zero), second one will be 
second smallest(index one) */
		
		
		int[]arr= {1,3,5,9};
		Arrays.sort(arr);
		System.out.println("Largest: " + arr[arr.length-1]);
		System.out.println("Second largest: " + arr[arr.length - 2]);
		System.out.println("Smallest: " + arr[0]);
		System.out.println("Second smallest: " + arr[1]);
	}
		
		public static void main1(String[] args) 
		{	
			//primitive Array
			int[] primitiveArray = {1, 2, 2, 3, 4, 4};
			Set<Integer> set = new LinkedHashSet<>();
			for (int num : primitiveArray) set.add(num);
			System.out.println(set);	
			//print elements that are unique only->output:[1,2,3,4]			
	}

		public static void main2(String[] args) 
		{
			//Non- primitive Array
			int[] nonPrimitiveArray = {1, 2, 2, 3, 4, 4};
			List<Integer> unique = Arrays.stream(nonPrimitiveArray)
			                             .boxed()       // convert int → Integer
			                             .distinct()    // remove duplicates
			                             .toList();     // Java 16+ collector
			System.out.println(unique);
			//print elements that are unique only->output:[1,2,3,4]	
		}
		
		
		public static void main3(String[] args) 
		{
			String[] stringArray = {"apple", "banana", "apple", "orange", "banana"};
			 List<String> unique = Arrays.stream(stringArray)
                     .distinct()
                     .toList();

		}	
}
