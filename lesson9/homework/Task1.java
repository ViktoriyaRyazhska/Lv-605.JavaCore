package lesson9.homework;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		for (int i = 1; i <= 10; i++) {
			set1.add(i);
		}
		for (int i = 5; i <= 15; i++) {
			set2.add(i);
		}
		System.out.println(union(set1, set2));
		System.out.println(intersect(set1, set2));

	}

	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		HashSet<E> set = new HashSet<>(set1);
		set.addAll(set2);
		return set;
	}

	public static <E> Set<E> intersect(Set<E> set1, Set<E> set2) {
		HashSet<E> set = new HashSet<>(set1);
		set.retainAll(set2);
		return set;
	}
}
