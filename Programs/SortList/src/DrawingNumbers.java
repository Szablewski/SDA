import java.util.Random;
import java.util.Scanner;

public class DrawingNumbers {

    public static void main(String[] args) {

        System.out.println("Podaj wielkosc tablicy: ");
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrayN = new int[n];

        for(int i = 0;i<arrayN.length;i++){
            System.out.println("Podaj kolejna cyfre: ");
            arrayN[i]= sc.nextInt();
        }

        System.out.println("Podaj ile liczb wylosowac: ");
        int k = sc.nextInt();
        int lastIndex = n-1;
        for(int i=0;i<k;i++){
            int randomNumber = random.nextInt(n);
            int temp = arrayN[randomNumber];
            arrayN[randomNumber] = arrayN[lastIndex];
            arrayN[lastIndex] = temp;
            lastIndex--;
        }

        for(int i =n;i>n-k;i--){
            System.out.println("Wylosowane liczby to: " + arrayN[i-1]);
        }
    }
}
