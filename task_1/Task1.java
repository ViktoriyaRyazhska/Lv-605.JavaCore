import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double circleradius;
        String name, address;
        double c1, c2, c3, t1, t2, t3;

        System.out.println("Enter the radius of the circle");
        circleradius = Double.parseDouble(br.readLine());
        perimetrAreaCirle(circleradius);

        System.out.println( "What is your name?" );
        name = br.readLine();
        System.out.println("Where are you live");
        address = br.readLine();
        nameAddress(name, address);

        System.out.println("Enter the cost per call per minute of the call from the first country");
        c1 = Double.parseDouble(br.readLine());
        System.out.println("Enter the cost per call per minute of the call from the second country");
        c2 = Double.parseDouble(br.readLine());
        System.out.println("Enter the cost per call per minute of the call from the third country");
        c3 = Double.parseDouble(br.readLine());
        System.out.println("Enter the talk time of the first country");
        t1 = Double.parseDouble(br.readLine());
        System.out.println("Enter the talk time of the second country");
        t2 = Double.parseDouble(br.readLine());
        System.out.println("Enter the talk time of the third country");
        t3 = Double.parseDouble(br.readLine());
        phoneCalls(c1,c2,c3,t1,t2,t3);

    }
    public static void perimetrAreaCirle(double r){
        double p = 2*3.14*r, s = 3.14*Math.pow(r,2);
        System.out.println("The perimeter is equal: " + p + " and the area is equal to: " + s);
    }
    public  static void nameAddress(String name, String address){
        System.out.println(name + address);
    }
    public static void phoneCalls(double c1, double c2, double c3, double t1, double t2, double t3){
        System.out.println("the total cost of the call from the first country" + (c1 * t1));
        System.out.println("the total cost of the call from the second country" + (c1 * t2));
        System.out.println("the total cost of the call from the third country" + (c3 + c3));
        System.out.println("total cost of calls from all countries" + ((c1*t1)+(c2+t2)+(c3+t3)));
    }
}
