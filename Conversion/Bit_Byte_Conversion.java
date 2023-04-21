package Conversion;
import java.text.DecimalFormat;
import java.util.*;;

public class Bit_Byte_Conversion {
    public static void main(String [] args) {

        // Scann user input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter bytes number: ");
        double d1 = input.nextDouble();

        // Calculate the conversion
        double result = (d1) * 0.00097;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        // Result
        System.out.println("The result in kilobytes: " + decimalFormat.format(result);











    }
    
}
