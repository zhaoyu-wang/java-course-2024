package org.ethz.day1;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumberFinder {

    public static void main(String[] args) {
        // 找到小于 100,000 的所有完美数
        ArrayList<Integer> perfectNumbers = findPerfectNumbers(100000);

        // 输出所有找到的完美数
        System.out.println("perfect numbers are：");
        for (int number : perfectNumbers) {
            System.out.println(number);
        }

        // 获取用户输入的 N，找到第 N 个完美数
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        if (N > 0 && N <= perfectNumbers.size()) {
            System.out.println( N + "th" + " perfect number is: " + perfectNumbers.get(N - 1));
        } else {
            System.out.println("输入的 N 超出范围。");
        }

        // 关闭 Scanner
        scanner.close();
    }

    // 找到所有小于 max 的完美数
    public static ArrayList<Integer> findPerfectNumbers(int max) {
        ArrayList<Integer> perfectNumbers = new ArrayList<>();

        // 遍历 1 到 max 之间的所有数，判断是否为完美数
        for (int i = 1; i < max; i++) {
            if (isPerfect(i)) {
                perfectNumbers.add(i);  // 如果是完美数，加入列表
            }
        }

        return perfectNumbers;
    }

    // 判断一个数是否为完美数
    public static boolean isPerfect(int number) {
        int sum = 0;

        // 找到所有小于 number 的真因数，并求和
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // 如果真因数和等于 number 本身，则是完美数
        return sum == number;
    }
}
