package Lesson9;

import java.util.ArrayList;
import java.util.Random;
//Declare collection myCollection of 10 integers and fill it (from the console or random). галочка :)
//Find and save in list newCollection all positions of element more than 5 in the collection. Print newCollection
//Remove from collection myCollection elements, which are greater then 20. Print result
//Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
//Sort and print collection
//Use one or more of the next Collections: List, ArrayList, LinkedList
public class CollectionTest {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> myCollection = new ArrayList<>();
        ArrayList<Integer> newCollection = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rnd.nextInt(40)-20);

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
        System.out.println(myCollection);
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);

            }

        }

        System.out.println(newCollection);


        if (myCollection.size() > 2) {
            myCollection.set(2, 1);
        }
        if (myCollection.size() > 5) {
            myCollection.set(5, -4);
        }
        if (myCollection.size() > 8) {
            myCollection.set(8, -3);
        }
        // myCollection.ensureCapacity(15); ніфіга ми з Романом не розібрались як збільшувати кількість індексів арейліста
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position  " + i + "  value " + myCollection.get(i));
        }
        myCollection.sort(Integer::compareTo);
        System.out.println(myCollection);
    }
}
