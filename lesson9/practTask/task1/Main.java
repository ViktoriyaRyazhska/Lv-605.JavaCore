package lesson9.practTask.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rnd = new Random();
		ArrayList<Integer> myCollection = new ArrayList<>();
		ArrayList<Integer> newCollection = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			myCollection.add(rnd.nextInt(100) - 50);

		}
		System.out.println(myCollection);
		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 20) {
				myCollection.remove(i);
				i--;
				if (i < 0) {
					i = 0;
				}
			}
		}
		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 5) {
				newCollection.add(i);
			}
		}
		System.out.println(myCollection);
		System.out.println(newCollection);

		insert(myCollection, 2, 1);
		insert(myCollection, 8, -3);
		insert(myCollection, 5, -4);

		System.out.println(myCollection);

		for (int i = 0; i < myCollection.size(); i++) {
			System.out.println("position - " + i + " value of element - " + myCollection.get(i));
		}
		myCollection.sort(Integer::compare);
		System.out.println(myCollection);
	}

	public static void insert(List<Integer> list, int index, int value) {
		if (list.size() > index) {
			list.set(index, value);
		}
	}
}
