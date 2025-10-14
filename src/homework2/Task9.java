package homework2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        int originalNumber = number;
        int sum = 0;

        // Count how many digits the number has
        int digits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, digits);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }
    }
}