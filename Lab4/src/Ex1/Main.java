package Ex1;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner numere = new Scanner(System.in);
        int[] sir = new int[10];
        for (int i = 0; i < sir.length; i++) {
            System.out.print("Introdu valoarea pentru pozitia " + i + " a sirului: ");
            sir[i] = numere.nextInt();
        }
        System.out.println("Sirul dumneavoastra este: \n " + Arrays.toString(sir));
        Scanner scan = new Scanner(System.in);
        System.out.println("introduceti valoarea indexului:");
        int index = scan.nextInt();
        int[] sir2 = new int[sir.length + 1];

        for (int i = 0; i < index; i++) {
            sir2[i] = sir[i];
        }
        System.out.println("Introduceti valoarea :");
        Scanner value = new Scanner(System.in);
        int val = value.nextInt();

        sir2[index] = val;

        for (int i = index + 1; i <= sir.length; i++) {
            sir2[i] = sir[i - 1];
        }
        System.out.print("[");
        for (int i = 0; i < sir2.length; i++) {

            System.out.print(sir2[i] + " ");
        }
        System.out.print("]");
    }
}

