import java.util.*;


public class Task1 {
	public static void main(String[] args) {
		List<Integer> myCollection = new ArrayList<>();
		Random rnd = new Random();
		for (int i = 0; i < 10; i++) {
			myCollection.add(rnd.nextInt(40));
		}
		System.out.println(myCollection);
		
		List<Integer> newCollection = new ArrayList<>();
		ListIterator<Integer> it = myCollection.listIterator();
		int currentPosition = 0;
		while (it.hasNext()) {
			if (it.next() > 5) {
				newCollection.add(currentPosition);
			}
			currentPosition++;
		}
		System.out.println(newCollection);
		
		it = myCollection.listIterator(); // iterator reset
		while (it.hasNext()) {
			if (it.next() > 20) {
				it.remove();
			}
		}
		System.out.println(myCollection);
		
		//insertion of specific elements
		Task1.addIfPossible(myCollection, 2, 1);
		Task1.addIfPossible(myCollection, 8, -3);
		Task1.addIfPossible(myCollection, 5, -4);
		System.out.println(myCollection);
		
		//Sorting and print
		Collections.sort(myCollection);
		System.out.println(myCollection);
	}
	
	public static List<Integer> addIfPossible(List<Integer> list, int index, int value) {
		if(index > list.size() || index < 0) {
			System.err.println("Index is out of range!");
			throw new IndexOutOfBoundsException();   //???
		}
		else {
			list.add(index, value);
		}
		return list;
	}
}
