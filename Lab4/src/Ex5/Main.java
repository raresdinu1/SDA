package Ex5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        int m = val.nextInt();
        int n = val.nextInt();
        int matrix[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = new Random().nextInt(255);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int x = n / 3 * 3;
        int y = m / 3 * 3;
        int matrixf[][] = new int[x][y];
        int dimensiune = 3;


        for (int i = 0; i < x; i = i + dimensiune) {
            for (int j = 0; j < y; j = j + dimensiune) {
                int medie = 0;
                for (int ii = 0; ii < dimensiune; ii++) {
                    for (int jj = 0; jj < dimensiune; jj++) {
                        medie += matrix[i + ii][j + jj];
                    }
                }
                medie = medie / 9;

                for (int ii = 0; ii < dimensiune; ii++) {
                    for (int jj = 0; jj < dimensiune; jj++) {
                        matrixf[i + ii][j + jj] = medie;

                    }
                }
            }


        }

        System.out.println();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(matrixf[i][j] + " ");
            }
            System.out.println();
        }

    }
}
