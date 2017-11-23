import java.util.Scanner;

public class Squares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] liczby = new int [10];

        for(int i =0;i<liczby.length;i++){
            System.out.println("Podaj liczbe " + (i+1) +  " do tablicy");
            int element = sc.nextInt();
            liczby[i]=element;
        }
        System.out.println("Liczby w tablicy podniesione do kwadratu to: " );

        for(int i = 0;i<liczby.length; i++){
            double kwadrat = Math.pow(liczby[i],2);
            System.out.println(kwadrat);
        }
    }
}
