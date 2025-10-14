package homework2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your gender (M or F): ");
        char gender = sc.next().toUpperCase().charAt(0);

        sc.close();

        if (age < 18) {
            System.out.println("Access denied");
        } else {
            if (gender == 'M') {
                System.out.println("Male access granted");
            } else if (gender == 'F') {
                System.out.println("Female access granted");
            } else {
                System.out.println("Invalid gender entered");
            }
        }
    }
}