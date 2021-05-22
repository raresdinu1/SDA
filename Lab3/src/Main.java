import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Shape> shapes = new ArrayList<>();

        System.out.println("Bine ai venit in Paint: Alege din urmatoarele variante de figuri geometrice");
        System.out.println("[1]Cerc");
        System.out.println("[2]Patrat");
        System.out.println("[3]Dreptunghi");
        System.out.println("Scrieti mai jos alegerea dumneavoastra:");
        Scanner figura = new Scanner(System.in);
        int choice = figura.nextInt();
        switch (choice) {
            case 1:
                System.out.println("BorderWidth:");
                Scanner border1 = new Scanner(System.in);
                int bw1 = border1.nextInt();
                System.out.println("Radius:");
                Scanner radius1 = new Scanner(System.in);
                int r1 = radius1.nextInt();
                System.out.println("Hexcolor(#FFFFFF):");
                Scanner hex1 = new Scanner(System.in);
                String h1 = hex1.nextLine();
                shapes.add(new circle(h1, bw1, r1));
                for (Shape s : shapes) {

                    System.out.println(s.getName() + "\n Aria: " + s.getArea() + "\n BorderWidth: " + s.getBorderWidth() + " \n Hex Color: " + s.getHexFillColor() + "\n");
                    s.draw();
                }
                break;

            case 2:
                System.out.println("BorderWidth:");
                Scanner border2 = new Scanner(System.in);
                int bw2 = border2.nextInt();
                System.out.println("Size:");
                Scanner size2 = new Scanner(System.in);
                int s2 = size2.nextInt();
                System.out.println("Hexcolor(#FFFFFF):");
                Scanner hex2 = new Scanner(System.in);
                String h2 = hex2.nextLine();
                shapes.add(new Square(h2, bw2, s2));
                for (Shape s : shapes) {

                    System.out.println(s.getName() + "\n Aria: " + s.getArea() + "\n BorderWidth: " + s.getBorderWidth() + " \n Hex Color: " + s.getHexFillColor() + "\n");
                    s.draw();
                }
                break;
            case 3:
                System.out.println("BorderWidth:");
                Scanner border3 = new Scanner(System.in);
                int bw3 = border3.nextInt();
                System.out.println("Height:");
                Scanner height3 = new Scanner(System.in);
                int hh3 = height3.nextInt();
                System.out.println("Width:");
                Scanner width3 = new Scanner(System.in);
                int w3 = width3.nextInt();
                System.out.println("Hexcolor(#FFFFFF):");
                Scanner hex3 = new Scanner(System.in);
                String h3 = hex3.nextLine();
                shapes.add(new Rectangle(h3, bw3, hh3, w3));
                for (Shape s : shapes) {

                    System.out.println(s.getName() + "\n Aria: " + s.getArea() + "\n BorderWidth: " + s.getBorderWidth() + " \n Hex Color: " + s.getHexFillColor() + "\n");
                    s.draw();
                }
                break;
        }


    }
}
