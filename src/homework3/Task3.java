package homework3;

public class Task3 {
    public static void main(String[] args) {
        int[][][] cube = {
                {{1, 2}, {3, 4}},
                {{5, 6}, {7, 8}}
        };

        System.out.print("Numbers greater than 6: ");

        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    if (cube[i][j][k] > 6) {
                        System.out.print(cube[i][j][k] + " ");
                    }
                }
            }
        }
    }
}