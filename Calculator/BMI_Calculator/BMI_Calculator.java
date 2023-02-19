// The purpose of this program is calculate BMI
// John Doan
// February 2023

package Calculator.BMI_Calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI_Calculator {

    // Initialize two decimals space
    private static final DecimalFormat deci = new DecimalFormat("0.00");
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        // user input weight
        System.out.println("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        // user input height
        System.out.println("Enter your height in meters: ");
        double height = input.nextDouble();

        double bmi_result = weight / (height * height);

        System.out.printf("Your BMI result: " + deci.format(bmi_result));

        if (bmi_result < 18.5) {
            System.out.print(" and it's under weight.");
        } 
        
        else if (bmi_result > 18.5 && bmi_result < 24.9) {
            System.out.println(" and it's normal weight.");
        }
        
        else if (bmi_result > 25 && bmi_result < 29.9) {
            System.out.println(" and it's over weight");
        } 
        
        if (bmi_result > 30) {
            System.out.println(" and it's obesity");
        }
    }
}
