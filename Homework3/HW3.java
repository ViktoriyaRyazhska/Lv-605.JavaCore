import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class HW3 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(
                  new InputStreamReader(System.in));
//task1
          System.out.println("Float number: ");
          float x = Float.parseFloat(br.readLine());
          if ((x > -5) && (x < 5)) {
               System.out.println(x + " is valid!");
          } else {
               System.out.println(x + " is non valid!");
          }

          System.out.println("Float number: ");
          float y = Float.parseFloat(br.readLine());
          if ((y > -5) && (y < 5)) {
               System.out.println(y + " is valid!");
          } else {
               System.out.println(y + " is non valid!");
          }

          System.out.println("Float number: ");
          float z = Float.parseFloat(br.readLine());
          if ((z > -5) && (z < 5)) {
               System.out.println(z + " is valid!");
          } else {
               System.out.println(z + " is non valid!");
          }
//task 2
          System.out.println(" Write 3 integer number: ");
          int a = Integer.parseInt(br.readLine());
          int b = Integer.parseInt(br.readLine());
          int c = Integer.parseInt(br.readLine());
          int max = Math.max(a, b);
          if (max>b){
               max = Math.max(a,c);
          }
          else {
               max = Math.max(b,c);
          }
          System.out.println("The max of three is: " + max);

          int min = Math.min(a,b);
          if (min<b){
               min = Math.min(a,c);
          }
          else {
               min = Math.min(b,c);
          }
          System.out.println("The min of three is: " + min);

     }

}
