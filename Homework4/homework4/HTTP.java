package Homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HTTP {
//    read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)

    public static void main(String[] args) throws IOException {
        BufferedReader ht = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write the number of HTTP Error");
        String text = ht.readLine();
        HTTPError htp = null;
        switch (text) {
            case "400": case "401": case "402":
                htp = HTTPError.BAD_REQUEST; break;
            case "404": case "403": case "405":
                htp = HTTPError.UNAUTHORIZED; break;
            case "406": case "407": case "408":
                htp = HTTPError.PAYMENT_REQUIRED; break;
            case "409": case "410": case "411":
                htp = HTTPError.FORBIDDEN; break;
            case "412": case "413": case "414":
                htp = HTTPError.NOT_FOUND; break;
            default:
                System.out.println("BS");
                System.exit(0);
        }
        System.out.println(htp);
    }
}
