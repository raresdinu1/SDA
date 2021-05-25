package Ex3;

public class binarySearch {

    public static void binarySearch(int arr[], int primul, int ultimul, int is) {
        boolean isfound ;
        int mijloc = (primul + ultimul) / 2;
        while (primul <= ultimul) {
            if (arr[mijloc] < is) {
                primul = mijloc + 1;
            } else if (arr[mijloc] == is) {
                isfound = true;
                System.out.println("Elementul este gasit la indexul " + mijloc + " , " + isfound);

                break;
            } else {
                ultimul = mijloc - 1;
            }
            mijloc = (primul + ultimul) / 2;
        }
        if (primul > ultimul) {
            isfound = false;
            System.out.println("Element nu este gasit , " + isfound ) ;
        }
    }
}
