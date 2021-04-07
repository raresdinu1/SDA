package Ex1;

import java.util.Scanner;
public class Ex1_1 {
    public static void main(String[] args) {


    Scanner road = new Scanner(System.in);
    System.out.println("Introduceti tipul de drum:");
    String roadType = road.nextLine();
        var rd = roadType.toLowerCase();
        switch(rd){
        case "oras":
            System.out.println("Viteza recomandata in " + rd +" este de 50 Km/h");
            break;
        case "zona rezidentiala":
            System.out.println("Viteza recomandata in " + rd +" este de 30 Km/h");
            break;
        case "drum express":
            System.out.println("Viteza recomandata in" + rd +" este de 100 Km/h");
            break;
        case "autostrada":
            System.out.println("Viteza recomandata in " + rd + " este de 130 Km/h");
            break;
        default:
            System.out.println("Cuvantul " + rd + "nu este categorizat ca tip de viteza");
            break;
    }
}
}
