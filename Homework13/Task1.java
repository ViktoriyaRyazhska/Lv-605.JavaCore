package Lesson13;
import java.util.ArrayList;


public class Task1 {
    //There is a list of strings list1. Create a new list list2 that has items from list1 and length less than 5 characters (use method removeIf)

        public static void main(String[] args) {
            ArrayList<String> list1 = new ArrayList<>();
            ArrayList<String> list2 = new ArrayList<>();
            list1.add("ldksafhalskd");
            list1.add("ldksalskd");
            list1.add("skd");
            list1.add("ldksafhalsewugykd");
            list1.add("ldksalskd");
            list1.add("halskd");
            System.out.println("list1 with rendom length  " + list1);
            list2 = list1;
            list2.removeIf(n -> (n.length() > 5)); //пасіба Павлу я спочатку просто ремувив з першого ліста
            System.out.println("list2 with length less than 5 characters  " + list2);

        }
}
