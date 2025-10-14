package homework2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int f, n, x, digit;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        n = sc.nextInt();
        sc.close();

        int original = n; // Keep the original number for comparison


        while (n > 0) {
            digit = n % 10;
            f = 1;

            // factorial calculation
            for (x = 1; x <= digit; x++) {
                f = f * x;
            }

            sum = sum + f;
            n = n / 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Strong number");
        } else {
            System.out.println(original + " is not a Strong number");
        }
    }
}