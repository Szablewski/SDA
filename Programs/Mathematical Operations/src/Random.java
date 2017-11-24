import java.util.Scanner;

public class Random {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] liczba = new int[10];
        for (int i = 0; i < liczba.length; i++) {
           liczba[i] = sc.nextInt(100);
        }
        System.out.println("Podaj liczbe: ");
        int losowaLiczba = sc.nextInt();
        boolean szukana = false;

        for (int i = 0; i < liczba.length; i++) {
            if (liczba[i] == sc.nextInt()){
                szukana = true;
                break;
            }
        }
        if (szukana){
            System.out.println("Podana liczba znajduje się w tablicy");
        }else {
            System.out.println("Podanej liczby nie ma w tabliczy ");
        }
    }
}
