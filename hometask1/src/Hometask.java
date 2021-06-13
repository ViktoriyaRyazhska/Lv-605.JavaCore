import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedMap;

public class Hometask {
    public static void main(String[] args) throws IOException {
        // Exersise 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the radius: ");
        double radius = Double.parseDouble(br.readLine());
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Your perimeter = " + perimeter + "\nYour area = " + area);
        // Exersise 2
        String name;
        String address;
        System.out.println("What is your name?");
        name = br.readLine();
        System.out.println("Where are you live " + name + "?");
        address = br.readLine();
        System.out.println("Name: " + name + "\tAddress: " + address);
        // Exersise 3
        System.out.println("Enter the unit of the call for the first country: ");
        double callUnit1 = Double.parseDouble(br.readLine());
        System.out.println("Enter the unit of the call for the second country: ");
        double callUnit2 = Double.parseDouble(br.readLine());
        System.out.println("Enter the unit of the call for the third country: ");
        double callUnit3 = Double.parseDouble(br.readLine());
        System.out.println("Enter the time of first call: ");
        double callTime1 = Double.parseDouble(br.readLine());
        System.out.println("Enter the time of second call: ");
        double callTime2 = Double.parseDouble(br.readLine());
        System.out.println("Enter the time of third call: ");
        double callTime3 = Double.parseDouble(br.readLine());
        double callCost1 = callUnit1 * callTime1;
        double callCost2 = callUnit2 * callTime2;
        double callCost3 = callUnit3 * callTime3;
        double fullCost = callCost1 + callCost2 + callCost3;
        System.out.println("The cost of the first call: " + callCost1);
        System.out.println("The cost of the second call: " + callCost2);
        System.out.println("The cost of the third call: " + callCost3);
        System.out.println("The full cost of 3 calls: " + fullCost);
    }
}
