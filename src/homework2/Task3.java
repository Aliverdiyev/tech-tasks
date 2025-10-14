package homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Odd numbers up to " + number + ":");

        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}