package Ex4;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle("#010101", 3, 3, 4));
        shapes.add(new Square("#010101", 3, 3));
        shapes.add(new circle("#022010", 3, 4));
        shapes.add(new Rectangle("#010321", 5, 6, 7));

        HashMap<String, Integer> Culori = new HashMap<>();
        for (Shape s : shapes) {
            Culori.put(s.getHexFillColor(), 0);
        }
        for (Shape s : shapes) {
            Culori.put(s.getHexFillColor(), Culori.get(s.getHexFillColor()) + 1);
        }
        System.out.print(Culori);


    }
}
