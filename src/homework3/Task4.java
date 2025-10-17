package homework3;

public class Task4 {
    public static void main(String[] args) {
        int[] myArray = {109, 22, 31, 40, 0, -64, 87, -8, 99, -101};

        for (int i = 0; i < myArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] < myArray[minIndex]) {
                    minIndex = j;
                }
            }
            int swap = myArray[i];
            myArray[i] = myArray[minIndex];
            myArray[minIndex] = swap;

        }

        System.out.print("Reverse sorted array: ");
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
    }
}