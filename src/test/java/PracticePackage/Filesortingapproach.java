package PracticePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * this logic acts like a base logic which will be similar for many file sorting programs based on number,#,- etc
 */

public class Filesortingapproach {

	public static void main(String[] args) {

		String arr[] = {"Fileinsert04262025#12.txt",
		        "Fileinsert04262025#89.txt",
		        "Fileinsert04262025#26.txt",
		        "Fileinsert04262025#33.txt"};
		List<String> list = Arrays.asList(arr);

		List<String> asc = new ArrayList<>(list);
		asc.sort((a, b) -> extractnumber(a) - extractnumber(b));
		System.out.println(asc);

		List<String> desc = new ArrayList<>(list);
		desc.sort((a, b) -> extractnumber(b) - extractnumber(a));
		System.out.println(desc);

	}

	public static int extractnumber(String filename) {

		String number = filename.split("#")[1].replaceAll(".txt","");
		return Integer.parseInt(number);
	}

}
