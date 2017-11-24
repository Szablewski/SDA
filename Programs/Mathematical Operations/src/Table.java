import java.util.Scanner;

public class Table {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        int[] liczby = new int [10];

        for(int i = 0 ;i < liczby.length; i++){
            System.out.println("Wpisz "+ (i+1) + " element tablicy");
            int element = skaner.nextInt();
            liczby[i]=element;
        }

        System.out.println("Elementy tablicy");
        for(int i =0;i<liczby.length;i++){
            int element = liczby[i];
            System.out.println(element);
        }
    }
}
