package Ex2;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {

        double temperature[] = new double[7];
        double anormalTemp[] = new double [7];
        double normalTemp[] = new double [7];
        int normalCount[] = new int[7];
        int anormalCount[] = new int[7];
        int maxl = 7;
        double max = 37.0;
        int cn = 0 ;// cn = contor Temperaturi normale
        int ca = 0 ;// ca = contor Temperaturi anormale

        temperature[0]= 36.3;
        temperature[1]= 37.5;
        temperature[2]= 38.3;
        temperature[3]= 35.9;
        temperature[4]= 37.1;
        temperature[5]= 31.5;
        temperature[6]= 39.5;

        for(int i =0 ; i<maxl; i++ ){
            if (temperature[i] > 37.0){
                anormalTemp[ca] = temperature[i];
                anormalCount[ca] = i;
                ca += 1;

            }else{
                normalTemp[cn] = temperature[i];
                normalCount[cn] = i;
                cn += 1;
            }
        }
        System.out.println("Lista cu Temperaturi normale :");
            for(int i = 0; i < cn; i++){
                System.out.println("Pacientul " + normalCount[i] + " a fost inregistrat cu temperatura: " + normalTemp[i]);

            }
        System.out.println("------------------------------------------------------------------");
        System.out.println("Lista cu Temperaturi anormale :");
        for(int i = 0; i < ca; i++){
            System.out.println("Pacientul " + anormalCount[i] + " a fost inregistrat cu temperatura: " + anormalTemp[i]);

        }
    }
}

