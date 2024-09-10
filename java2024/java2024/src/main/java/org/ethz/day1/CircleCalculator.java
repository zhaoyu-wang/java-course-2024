package org.ethz.day1;

import java.util.Scanner;

public class CircleCalculator {
    public static final double PI = 3.141592653589793;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);
        scanner.close();
    }
}
