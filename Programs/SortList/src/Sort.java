import java.util.Scanner;

public class Sort {

    private static int tablica[];
    private static int ile_liczb;

    private static void insertionSort(int tablica[], int ile_liczb) {
        int i;
        int j;
        int k;

        for (i = 1; i < ile_liczb; i++) {
            j = i;
            k = tablica[i];
            while ((j > 0) && (tablica[j - 1] > k)) {
                tablica[j] = tablica[j - 1];
                j--;
            }
            tablica[j] = k;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;

        System.out.println("Ile liczb chesz posortowac.");
        ile_liczb = sc.nextInt();
        System.out.println("Podaj liczby: ");
        tablica = new int[ile_liczb];

        for (i = 0; i < ile_liczb; i++) {
            tablica[i] = sc.nextInt();
        }

        System.out.println("Tablica przed posortowaniem:");
        for (i = 0; i < ile_liczb; i++)
            System.out.println(tablica[i]);
            insertionSort(tablica, ile_liczb);

            System.out.println("Tablica po posortowaniu:");
        for (i = 0; i < ile_liczb; i++)
            System.out.println(tablica[i]);
    }
}

