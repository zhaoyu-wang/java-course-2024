package org.ethz.day1;

import java.util.Scanner;

public class DigitMultiplier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        number = Math.abs(number);

        int product = 1;

        // If the input is 0, the product of digits is 0
        if (number == 0) {
            product = 0;
        } else {
            // Multiply all digits of the number
            while (number > 0) {
                int digit = number % 10; // Extract the last digit
                product *= digit;        // Multiply the product by the digit
                number /= 10;            // Remove the last digit
            }
        }

        // Output the result
        System.out.println("The product of the digits is: " + product);

        // Close the scanner
        scanner.close();
    }
}
