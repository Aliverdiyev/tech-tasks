package homework2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Fibonacci numbers to print? ");
        int count = sc.nextInt();
        sc.close();

        // Check for invalid input
        if (count <= 0) {
            System.out.println("Please enter a valid number");
            return;
        }

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci sequence:");

        for (int i = 1; i <= count; i++) {
            // Print the Fibonacci number
            System.out.print(first + " - ");

            // Check if even or odd
            if (first % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

            // Generate next Fibonacci number
            int next = first + second;
            first = second;
            second = next;
        }
    }
}