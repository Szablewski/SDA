import java.util.Scanner;

public class Silnia {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę : ");
        int liczba = sc.nextInt();
        int wynik = 1;
        for (int i = 1; i <= liczba ; i++) {
            wynik = wynik * i;
        }
        System.out.println("Wynik = " + wynik                                                                                   );
    }
}

