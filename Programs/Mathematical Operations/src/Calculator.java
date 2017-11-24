import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        double liczba1;
        double liczba2;
        char znak;

        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę do działania: ");
        liczba1 = skaner.nextDouble();

        System.out.println("Podaj 2 liczbę do działania: ");
        liczba2 = skaner.nextDouble();

        System.out.println("Dodawanie wybierz znak '+'  ");
        System.out.println("Odejmowanie wybierz znak '-'  ");
        System.out.println("Mnożenie wybierz znak '*'  ");
        System.out.println("Dzielenie wybierz znak '/'  ");

        znak = skaner.next().charAt(0);
        switch (znak){
            case '+': {
                System.out.println(liczba1 + liczba2);
                break;
            }
            case '-': {
                System.out.println(liczba1 - liczba2);
                break;
            }
            case '*': {
                System.out.println(liczba1 * liczba2);
                break;
            }
            case '/': {
                if (liczba2 != 0) {
                    System.out.println(liczba1 / liczba2);
                }else
                    System.out.println("Nie dzielimy przez 0 ");
                break;
            }
        }
    }
}

