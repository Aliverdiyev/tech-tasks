package homework3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] massive = new int[]{1, 43, 87, -37, 55};
        int smallest = massive[0];
        int largest = massive[0];

        for (int i = 1; i < massive.length; i++) {
            if (massive[i] < smallest) {
                smallest = massive[i];
            }
            if (massive[i] > largest) {
                largest = massive[i];
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

//        second method:
        int[] massive2 = {54, 66, -7, 11, 1, 101, -77};

        int largest2 = Arrays.stream(massive2).max().getAsInt();
        int smallest2 = Arrays.stream(massive2).min().getAsInt();

        System.out.println("Largest number: " + largest2);
        System.out.println("Smallest number: " + smallest2);

//        third method (sorting)
        int[] massive3 = {43, -98, -2, 109, 44, 0, 3};
        Arrays.sort(massive3);
        int smallest3 = massive3[0];
        int largest3 = massive3[massive3.length - 1];

        System.out.println("Largest number: " + largest3);
        System.out.println("Smallest number: " + smallest3);
    }
}