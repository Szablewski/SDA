import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        System.out.println("Podaj 10 liczb: ");
        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();
        int[] tablica = new int[liczba];
        if(liczba<=10){
            for(int i=0;i<liczba;i++){
                System.out.println("Podaj liczbe " + (i+1));
                int element = sc.nextInt();
                tablica[i] = element;
            }
            for(int x: tablica){
                System.out.println("Podana liczba to: " + x);
            }
        }else
            System.out.println("Podano za duza liczbe");
    }
}
