package Lesson9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
// realizing the operations of union and intersection of two sets.
// Test the operation of these techniques on two pre-filled sets.
public class UnionIntersect {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.addAll(Arrays.asList(22, 15, 48, 1984, 42, 38));
        set2.addAll(Arrays.asList(45, 42, 70, 94, 2, 87, 1984, 88));

           System.out.println("Union of 2 sets \n" + union(set1, set2));
           System.out.println("intersect of 2 sets \n" + intersect(set1, set2));

        }
        public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
            HashSet<T> set = new HashSet<>(set1);
            set.addAll(set2);
            return set;
        }
        public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
            HashSet<T> set = new HashSet<>(set1);
            set.retainAll(set2);
            return set;
        }

}
