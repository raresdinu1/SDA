package Ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int array[] = {3, 7, -5, 2, -7, 1, 0, -3, -8, 10};
        int menu = 0;
        Scanner indexSearch = new Scanner(System.in);
        System.out.println("Sirul in forma neordonata:" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sirul in forma ordonata:  " + Arrays.toString(array));


        while (menu <= 1) {
            System.out.println("Introduceti numarul pe care doriti sa il cautati: ");
            int is = indexSearch.nextInt();
            int ultimul = array.length - 1;

            binarySearch.binarySearch(array, 0, ultimul, is);
        }
    }
}

