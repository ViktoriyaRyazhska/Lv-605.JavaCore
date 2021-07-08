package homework8;

import java.util.*;

public class Homework1 {

	public static void main(String[] args) {
		Set<Integer> intSetOne = new HashSet<Integer>();
		Set<Integer> intSetTwo = new HashSet<Integer>();
		
		intSetOne.addAll(Arrays.asList(12, 125, 546, 4854, 452));
		intSetTwo.addAll(Arrays.asList(545, 515, 65, 94, 458, 654, 12, 452));
		
		Set<String> strSetOne = new HashSet<String>();
		Set<String> strSetTwo = new HashSet<String>();
		
		strSetOne.addAll(Arrays.asList("someStr", "duplicate", "duplicateTwo", "StringFour", "dfbsd"));
		strSetTwo.addAll(Arrays.asList("duplicate", "duplicateTwo", "test", "testTwo"));
		
		//Testing with integers
		System.out.println("Union: " +union(intSetOne, intSetTwo));
		//System.out.println("Intersect: " +intersect(intSetOne, intSetTwo));
		//Testing with Strings
		//System.out.println("Union: " +union(strSetOne, strSetTwo));
		System.out.println("Intersect: " +intersect(strSetOne, strSetTwo));
	}

	public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
		set1.addAll(set2);
		return set1;
	}

	public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {

		Set<T> smallerSet = set1;
		Set<T> biggerSet = set2;
		if (set1.size() >= set2.size()) {
			smallerSet = set2;
			biggerSet = set1;
		}
		biggerSet.removeAll(smallerSet);
		return biggerSet;
	}
}
