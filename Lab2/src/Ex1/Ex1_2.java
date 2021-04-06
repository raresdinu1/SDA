package Ex1;

import javax.swing.*;


public class Ex1_2 {

    public static void main(String[] args) {
        String road = "";
        road = JOptionPane.showInputDialog("Introduceti tipul de drum:");
        var rd = road.toLowerCase();
        if (rd.equals("oras")) {
            System.out.println("Viteza recomandata in oras este de 50 Km/h");
        }
        else if(rd.equals("zona rezidentiala")){
            System.out.println("Viteza recomandata in Zona Rezidentiala este de 30 Km/h");
        }
        else if(rd.equals("drum express")){
            System.out.println("Viteza recomandata in Drum Express este de 100 Km/h");
        }
        else if(rd.equals("autostrada")){
            System.out.println("Viteza recomandata in Autostrada este de 130 Km/h");
        }
        else {
            System.out.println(" 0 ");
        }
    }

}
