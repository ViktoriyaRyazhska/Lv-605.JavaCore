package Homework4;
//    read 3 integer numbers and write max and min of them;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class home2 {
        int x;
       public home2(BufferedReader br) throws IOException {
           System.out.println("Type the number ");
           x = Integer.parseInt(br.readLine());
       }
        public static home2 findMax(home2 number1, home2 number2, home2 number3) {
            home2 maxnumber = number1;
            if (number2.getX() > maxnumber.getX()) {
                maxnumber = number2;
            }
            if (number3.getX() > maxnumber.getX()) {
                maxnumber = number3;
            }
            return maxnumber;
    }
    public static home2 findMin(home2 number1, home2 number2, home2 number3) {
        home2 minnumber = number1;
        if (number2.getX() < minnumber.getX()) {
            minnumber = number2;
        }
        if (number3.getX() < minnumber.getX()) {
            minnumber = number3;
        }
        return minnumber;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}
