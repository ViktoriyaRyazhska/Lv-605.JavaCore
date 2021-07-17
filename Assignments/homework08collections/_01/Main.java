package homework08collections._01;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void addIntValues(Set<Integer> setName, int startingNumber, int numbersAmount) {
		for (int i = startingNumber; i < numbersAmount + startingNumber; i++) {
			setName.add(i);
		}
	}

	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> newSet = new LinkedHashSet<>();
		newSet.addAll(set1);
		newSet.addAll(set2);
		return newSet;
	}
	
	public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2){
		Set<Integer> newSet = new LinkedHashSet<>();
		newSet.addAll(set1);
		newSet.retainAll(set2);
		return newSet;
	}
	
	public static void main(String[] args) {
		Set<Integer> setOne = new LinkedHashSet<>();
		Set<Integer> setTwo = new LinkedHashSet<>();

		addIntValues(setOne, 1, 3);
		System.out.println(setOne);

		addIntValues(setTwo, 2, 3);
		System.out.println(setTwo);
		
		// this
		System.out.println(union(setOne, setTwo));
		
		// or this
		System.out.println(intersect(setOne, setTwo));
		
	}
}
