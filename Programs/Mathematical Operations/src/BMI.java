import java.util.Scanner;

public class BMI {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wzrost w metrach : ");
        float metry = sc.nextFloat();

        System.out.println("Podaj wage w kilogramach");
        float  kg = sc.nextFloat();

        float BMI = kg/(metry*metry);

        if (BMI <= 18.5){
            System.out.println("Masz niedowagę!!!" + "Twoje BMI wynosi: " + BMI);
        }else if (BMI > 18.5 && (BMI <= 24.99)){
            System.out.println("Wartość prawidłowa!!!" + "Twoje BMI wynosi: " + BMI);
        }else {
            System.out.println("Masz nadwagę!!" + "Twoje BMI wynosi: " + BMI);
        }





    }
}
