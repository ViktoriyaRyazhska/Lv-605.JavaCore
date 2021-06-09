import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lesson4 {
    public static void main(String[] args) throws IOException {
        BufferedReader rad =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter radius:");
        double radius = Double.parseDouble(rad.readLine());
        double pi = 3.14 ;
        double per = 2*pi*radius;
        System.out.println("per "+per);

        double area = pi*radius*radius;
       System.out.println("area "+area);

    }
}
