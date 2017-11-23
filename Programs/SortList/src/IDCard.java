import java.util.Scanner;

public class IDCard {

    public static void main(String[] agrs){

        String ID;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj serie i numer dowodu osobistego: ");
        ID = scanner.next();

        int[] arrID = new int[9];
        int[] test = new int[]{7, 3, 1, 0, 7, 3, 1, 7, 3};
        int[] sumID = new int[9];
        int summary = 0;

        for (int i = 0; i < 9; i++) {
            if (i < 3) {
                arrID[i] = (int) ID.charAt(i) - 55;
            } else {
                arrID[i] = (int) ID.charAt(i) - 48;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (i == 3) {
            } else {
                sumID[i] = arrID[i] * test[i];
                summary += sumID[i];
            }
        }

        System.out.println(Math.floorMod(summary, 10));
    }
}
