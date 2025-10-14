package homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        sc.close();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

//        ternary method
        String result = (number > 0) ? "The number is positive." :
                (number < 0) ? "The number is negative." :
                        "The number is zero.";

        System.out.println(result);

    }
}