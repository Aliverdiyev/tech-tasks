package homework2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = scanner.nextInt();
        scanner.close();

        int originalNum = num;
        int reversedNum = 0;

        // Reverse the number
        while (num != 0) {
            int remainder = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + remainder; // Build the reversed number
            num /= 10; // Remove the last digit from the original number
        }

        // Palindrome check
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome number.");
        } else {
            System.out.println(originalNum + " is not a palindrome number.");
        }

        // Increasing / Decreasing order checks
        if (isIncreasing(originalNum)) {
            System.out.println("The digits are in increasing order.");
        } else if (isDecreasing(originalNum)) {
            System.out.println("The digits are in decreasing order.");
        } else {
            System.out.println("The digits are neither in increasing nor decreasing order.");
        }
    }

    // Method to check if digits are in increasing order
    public static boolean isIncreasing(int num) {
        int lastDigit = num % 10;
        num /= 10;

        while (num > 0) {
            int currentDigit = num % 10;
            if (currentDigit >= lastDigit) {
                return false;
            }
            lastDigit = currentDigit;
            num /= 10;
        }
        return true;
    }

    // Method to check if digits are in decreasing order
    public static boolean isDecreasing(int num) {
        int lastDigit = num % 10;
        num /= 10;

        while (num > 0) {
            int currentDigit = num % 10;
            if (currentDigit <= lastDigit) {
                return false;
            }
            lastDigit = currentDigit;
            num /= 10;
        }
        return true;
    }
}