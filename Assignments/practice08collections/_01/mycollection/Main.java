package practice08collections._01.mycollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void insertElement(List<Integer> list, int index, int value) {
		if (index <= list.size())
			list.add(index, value);
	}

	public static void main(String[] args) {
		List<Integer> myCollection = new ArrayList<Integer>();
		List<Integer> newCollection01 = new ArrayList<Integer>();
		List<Integer> newCollection02 = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			myCollection.add((int) (Math.random() * (50 - (-50)) + (-50)));
		}
		System.out.println(myCollection);

		// execute each block separately

		// position of element more than 5
		for (int i = 5; i < myCollection.size(); i++) {
			newCollection01.add(myCollection.get(i));
		}
		System.out.println(newCollection01);

		// bigger that value of 5
		for (int i : myCollection) {
			if (i > 5) {
				newCollection02.add(i);
			}
		}
		System.out.println(newCollection02);

		// remove elements which are greater than 20
		Iterator<Integer> iterator = myCollection.iterator();
		while (iterator.hasNext()) {
			int i = (int) iterator.next();
			if (i > 20) {
				iterator.remove();
			}
		}
		System.out.println(myCollection);

		// Insert elements 1, -3, -4 in positions 2, 8, 5.
		// Print result in the format: “position – xxx, value of element – xxx”
		insertElement(myCollection, 2, 1);
		insertElement(myCollection, 8, -3);
		insertElement(myCollection, 5, -4);

		for (int i = 0; i < myCollection.size(); i++) {
			System.out.println("position – " + i + ", value of element – " + myCollection.get(i));
		}

		// Sort and print collection 
		// sorting v.1—with anonymous class
		myCollection.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return 0;
			}
		});

		// sorting v.2—with Collections method
		Collections.sort(myCollection);
		System.out.println(myCollection);
		
	}
}
