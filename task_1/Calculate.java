import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double number1, number2, answer;
        String action;
        System.out.println("Enter first number...");
        number1 = Double.parseDouble(br.readLine());
        System.out.println("Enter second number...");
        number2 = Double.parseDouble(br.readLine());
        System.out.println("Enter an action (+ - * / or adding subtraction multiplication division)");
        action = br.readLine();
        if (action.equals("/") && number2 ==  0 ){
            System.out.println("You can't divided by zero");
            return;
        }
        if(action.equals("+") || action.equals("adding")){
            answer = number1 + number2;
        }
        else if(action.equals("-") || action.equals("subraction")){
            answer = number1 - number2;
        }
        else if(action.equals("*") || action.equals("multiplication")){
            answer = number1 * number2;
        }
        else if(action.equals("/") || action.equals("division")){
            answer = number1/number2;
        }
        else {
            answer = 0;
        }
        System.out.println("answer:" + answer);
    }
}
