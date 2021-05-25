import java.util.*;

public class Main {

    public static void main(String[] args) {
        StudInfo student1 = new StudInfo("Rares", "Dinu", 6.5, 8.0);
        StudInfo student2 = new StudInfo("Denisa", "Nechifor", 8.5, 9.5);
        StudInfo student3 = new StudInfo("Andrei", "Sorescu", 3.2, 6.0);
        StudInfo student4 = new StudInfo("Mihai", "Marin", 4.8, 4.5);
        StudInfo student5 = new StudInfo("Daniel", "Apostoloaie", 6.3, 8.7);
        StudInfo student6 = new StudInfo("Andreea", "Tudorache", 8.9, 9.5);
        StudInfo student7 = new StudInfo("Corina", "Soare", 8.0, 9.6);
        StudInfo student8 = new StudInfo("Mihaela", "Dumitru", 9.5, 7.5);
        StudInfo student9 = new StudInfo("Carmen", "Solomon", 9.5, 7.5);
        StudInfo student10 = new StudInfo("Bogdan", "Iancu", 9.5, 7.5);
        StudInfo student11 = new StudInfo("Camelia", "Niculai", 9.3, 4.5);

        HashMap<String, StudInfo> StudInfoHM = new HashMap<>();
        StudInfoHM.put("1990524123456", student1);
        StudInfoHM.put("2990114123456", student2);
        StudInfoHM.put("1991011123456", student3);
        StudInfoHM.put("1990721123456", student4);
        StudInfoHM.put("1990104123456", student5);
        StudInfoHM.put("2990112123456", student6);
        StudInfoHM.put("2990829123456", student7);
        StudInfoHM.put("2990416123456", student8);
        StudInfoHM.put("2990722123456", student9);
        StudInfoHM.put("1990201123456", student10);

        LinkedHashMap<String, StudInfo> StudInfoLHM = new LinkedHashMap<>();
        StudInfoLHM.put("1990524123456", student1);
        StudInfoLHM.put("2990114123456", student2);
        StudInfoLHM.put("1991011123456", student3);
        StudInfoLHM.put("1990721123456", student4);
        StudInfoLHM.put("1990104123456", student5);
        StudInfoLHM.put("2990112123456", student6);
        StudInfoLHM.put("2990829123456", student7);
        StudInfoLHM.put("2990416123456", student8);
        StudInfoLHM.put("2990722123456", student9);
        StudInfoLHM.put("1990201123456", student10);
       StudInfoLHM.put("1990201123456", student11);

        int menu = 1;
        while (menu < 2) {
            Scanner mchoice = new Scanner(System.in);
            System.out.println("Catalog Studenti:");
            System.out.println("[1]: Cautare student cu CNP");
            System.out.println("[2]: Afisare date CNP (Hashmap)");
            System.out.println("[3]: Afisare date CNP (LinkedHashMap)");
            System.out.println("[4]: Cautare student cu CNP identic");
            int mc = mchoice.nextInt();
            switch (mc) {
                case 1:
                    Scanner CNP = new Scanner(System.in);
                    System.out.println("Introduceti CNP: ");
                    String CNPin = CNP.nextLine();

                    for (Map.Entry<String, StudInfo> entry : StudInfoHM.entrySet()) {
                        if (entry.getKey().contains(CNPin)) {
                            System.out.println(entry.getValue());
                        }
                    }
                    break;

                case 2:
                    for (Map.Entry<String, StudInfo> entry : StudInfoHM.entrySet()) {
                        System.out.println(entry.getKey());
                        break;
                    }
                case 3:
                    for (Map.Entry<String, StudInfo> entry : StudInfoLHM.entrySet()) {
                        System.out.println(entry.getKey());
                    }
                    break;
                case 4:
                    Scanner CNP1 = new Scanner(System.in);
                    System.out.println("Introduceti CNP: ");
                    String CNPin1 = CNP1.nextLine();

                    for (Map.Entry<String, StudInfo> entry : StudInfoLHM.entrySet()) {
                        if (entry.getKey().contains(CNPin1)) {
                            System.out.println(entry.getValue());
                        }
                    }
                    break;
            }

        }
    }
}