import java.util.Scanner;

public class ChangeLetters {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj tekst :");
        String napis = skaner.nextLine();

        if(napis.length() <= 300){
            System.out.println("1.Male na duze " + "\n" + "2.Duze na male" + "\n" + "3.Male na duze, duze na male");
            int wybor = skaner.nextInt();
            String wynik = "";

            switch(wybor) {
                case 1:{
                    for(int i = 0; i< napis.length(); i++){
                        char znak = napis.charAt(i);
                        if(znak >=97 && znak <= 122){
                            znak -= 32;
                        }
                        wynik += znak;
                    }
                    System.out.println(wynik);
                    break;
                }
                case 2:{
                    for(int i =0; i< napis.length();i++){
                        char znak = napis.charAt(i);
                        if(znak >=65 && znak <=90){
                            znak += 32;
                        }
                        wynik += znak;
                    }
                    System.out.println(wynik);
                    break;
                }
                case 3:{
                    for (int i = 0; i < napis.length(); i++){
                        char znak = napis.charAt(i);
                        if(znak >=97 && znak <=122){
                            znak -= 32;
                        }else if(znak >= 65 && znak <=90){
                            znak +=32;
                        }else{

                        }
                        wynik += znak;
                    }
                    System.out.println(wynik);
                    break;
                }
            }
        }else{
            System.out.println("Napis za dlug");
        }
    }
}
