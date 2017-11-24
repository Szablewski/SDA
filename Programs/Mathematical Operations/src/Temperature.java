import java.util.Scanner;

public class Temperature {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj temperature w stopniach C: ");
        float C = sc.nextFloat();
        double F = 1.8 * C + 32.0;
        System.out.println(F);
    }
}
