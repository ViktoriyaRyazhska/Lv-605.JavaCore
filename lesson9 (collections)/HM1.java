package hm1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HM1 {
	
	public static <T> Set<T> union(Set<T> set1, Set<T> set2 ){
		
		HashSet<T> set = new HashSet<>(set1); 
		set.addAll(set2);
		return set1;
	}
	
	public static <T> Set<T> intersect (Set<T> set1, Set<T> set2){
	
		HashSet<T> set = new HashSet<>(set1);
		set.retainAll(set2);
		return set;

}
	
	
	public static void main(String[] args) {
		
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		Random random = new Random();
		
		for (int i=0; i <15; i++) {
			int n = random.nextInt(20);
			set1.add(n);
		}
		
		for (int i=0; i<10; i++) {
			
			int p = random.nextInt(20);
			set2.add(p);
		}
		
		System.out.println(set1 + "\n" + set2);
		System.out.println(union(set1, set2));
		System.out.println(intersect(set1, set2));
	}
}
