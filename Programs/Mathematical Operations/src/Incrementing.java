import java.util.Scanner;

public class Incrementing {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] liczby = new int[5];

        for (int i = 0; i < liczby.length; i++) {
            System.out.println("Podaj " + (i+1) + " liczb do tabliczy ");
            int liczba = sc.nextInt();
            liczby[i] = liczba;
        }
        System.out.println("Liczby po inkrementacji : " );
        for (int i = 0; i < liczby.length; i++) {
            int increm = liczby[i] += 1;
            System.out.println(increm);
        }
    }
}
