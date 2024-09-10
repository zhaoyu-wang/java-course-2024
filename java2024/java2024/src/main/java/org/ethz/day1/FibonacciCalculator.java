package org.ethz.day1;

import java.util.Scanner;

public class FibonacciCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        if (N < 0) {
            System.out.println("not available。");
            return;
        }

        int result = fibonacci(N);

        System.out.println(N + "th" + "Fibonacci value is: " + result);
        
        scanner.close();
    }

    // 计算第 N 个斐波那契数的函数
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;  // 斐波那契数列第 0 个数是 0
        }
        if (n == 1) {
            return 1;  // 斐波那契数列第 1 个数是 1
        }
        
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;  // 返回第 N 个斐波那契数
    }
}
