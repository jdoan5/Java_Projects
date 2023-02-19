// The purpose of this program is to calculate a basic function with switch statements
// John Doan
// February 2023 

package Calculator.Calculator_switch;
import java.util.*;

public class calculator_switch {
    public static void main(String [] args) {

        // User input 
        Scanner input = new Scanner(System.in);
        double result;
        double num1, num2, num3;
        char opr;

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        // The operator
        System.out.println("Enter an operator: (* , / , + , - , % , ^ )");
        opr = input.next().charAt(0);

        // The second input
        System.out.println("Enter second number: ");
        num2 = input.nextDouble();


        // Switch statement
        switch (opr) {
            case '*' : result = num1 * num2;
            System.out.println("The multiplication result: ");
            System.out.println(num1 + " * " + num2 + " = " + result);
            break;

            case '/' : result = num1 / num2;
            System.out.println("The division result: ");
            System.out.println(num1 + " / " + num2 + " = " + result);
            break;

            case '+' : result = num1 + num2;
            System.out.println("The addition result: ");
            System.out.println(num1 + " + " + num2 + " = " + result);
            break;

            case '-' : result = num1 - num2;
            System.out.println("The subtraction result: ");
            System.out.println(num1 + " - " + num2 + " = " + result);
            break;

            case '%' : result = (num1 / num2) * 100;
            System.out.print("The percentage result: ");
            System.out.println(num1 + " % " + num2 + " = " + result);
            break;

            case '^' : result = Math.pow(num1, num2);
            System.out.print("The power result: ");
            System.out.println(num1 + " ^ " + num2 + " = " + result);
            break;

            // Display if the invalid operator enter 
            default: System.out.println("Invalid input");
            break;     
        } // end switch statement
    }
}
