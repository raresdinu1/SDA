package Lab1;

import java.util.Scanner;
public class Ex1 {

    public static void main(String[] args)
    {
        int a , b , suma , diferenta , produs , dist , max , min;
        float media;
        Scanner numar = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        a = numar.nextInt();
        System.out.println("Introduceti al doilea numar: ");
        b = numar.nextInt();
        //Zona Calcule
        suma = a + b;
        diferenta = a - b;
        produs = a * b;
        media = (float)(a + b)/2;
        // Maximul
        if (a > b){
            max = a;
        }
        else {
            max = b;
        }
        //Minimul
        if (a > b){
            min = b;
        }
        else {
            min = a;
        }
        //Distanta
        if( a > b) {
            dist = a - b;
        }
        else {
            dist = b - a;
        }

        System.out.println("Suma: " + suma);
        System.out.println("Diferenta: " + diferenta);
        System.out.println("Produs: " + produs);
        System.out.println("Medie: " + media);
        System.out.println("Maxim: " + max);
        System.out.println("Minim : "  +  min);
        System.out.println("Distanta : " + dist);
    }

}


