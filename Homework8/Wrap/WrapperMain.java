package lesson8.homeworktask1.Wrap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Create three objects of the Wrapper type: first object should be wrapper for int type, second – for String, third - for boolean.
//  Print all three values in the console using method getValue from Wrapper class.
public class WrapperMain {
    public static void main(String[] args) throws IOException {
        BufferedReader all = new BufferedReader(new InputStreamReader(System.in));
// так баферрідер тут бо май інгіш із перфект і я "Print all three values in the console" прочитав як введіть всі 3 значення з консолі. Але вже най буде.
        Wrapper<Integer> integer =  new Wrapper<>(Integer.parseInt(all.readLine()));
        Wrapper<String> string =  new Wrapper<>(all.readLine());
        Wrapper<Boolean> bool =  new Wrapper<>(Boolean.parseBoolean(all.readLine()));

        System.out.println(integer.getValue());
        System.out.println(string.getValue());
        System.out.println(bool.getValue());
    }
}
