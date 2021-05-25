package Ex2;

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
        System.out.println("Introduceti indexul care doriti sa il stergeti: ");
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        int[] sir2 = new int[sir.length + 1];

        for (int i = 0; i < index; i++) {
            sir2[i] = sir[i];
        }

        for (int i = index; i < sir.length - 1; i++) {
            sir2[i] = sir[i + 1];
        }
        System.out.print("[");
        for (int i = 0; i < sir2.length - 2; i++) {

            System.out.print(sir2[i] + " ");
        }
        System.out.print("]");
    }
}

