package Homework4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)
public class Continent {


    public static void main(String[] args) throws IOException {
        BufferedReader wt = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write the country");
        String text = wt.readLine();
        Cont cont = null;
        switch (text) {
            case "Egypt": case "SAR": case "Sudan":
                cont = Cont.AFRICA; break;
            case "India": case "China": case "Corea":
                cont = Cont.ASIA; break;
            case "USA": case "Canada": case "Mexico":
                cont = Cont.AMERICA; break;
            case "Italy": case "Ukraine": case "France":
                cont = Cont.EUROPE; break;
            default:
                System.out.println("No this country");
                System.exit(0);
        }
        System.out.println(cont);
    }
}
