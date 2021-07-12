package Lesson10;

public class Practic {
    //Enter the two variables of type String. Determine whether the first variable substring second. For example, if you typed «IT» and «IT Academy» you must receive true.
    static String a = "IT Academy";
    static String b = "IT";
    public static void main(String[] args) {
        if (a.contains(b)){
            System.out.println("ok");
        }

    }
}
