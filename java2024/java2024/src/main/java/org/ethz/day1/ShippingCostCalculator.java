package org.ethz.day1;

import java.util.Scanner;

public class ShippingCostCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weights(w): ");
        double weight = scanner.nextDouble();  // 读取重量

        double cost;
        if (weight > 0 && weight <= 3) {
            cost = 1.5; 
        } else if (weight > 3 && weight <= 5) {
            cost = 2.5;  
        } else if (weight > 5 && weight <= 10) {
            cost = 4.2;  
        } else {
            // out of bounds
            System.out.println("Weight out of bound, please enter value 0 < w <= 10");
            return;  
        }

        System.out.println("Cost: " + cost);
        
        // 关闭 Scanner
        scanner.close();
    }
}

