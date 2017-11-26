package szablewski.quiz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean flag = false;
        do {
            System.out.println();
            System.out.println("Witamy w naszym quizie! Wybierz co chcesz zrobić: " + "\n1. Nowy quiz" + "\n2. Lista wyników" + "\n0. Wyjście");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    int counter = 0;
                    System.out.println("NOWY QUIZ");
                    System.out.println("Podaj swoj nick");
                    String nick = sc.next();
                    Quiz quiz = new Quiz();

                    List<Question> questions = Quiz.readAllQuestions();
                    for (int i = 0; i < questions.size(); i++) {
                        System.out.println("Pytanie nr: " + (i+1));
                        Question que = questions.get(i);
                        System.out.println(questions.get(i));
                        System.out.println("Podaj odpowiedz: ");
                        String d = sc.next();
                        System.out.println("Odpowiedź to: " + d + "\nPrawidłowa odpowiedź: " + questions.get(i).getCorrectAnswer());
                        if(d.equals(questions.get(i).getCorrectAnswer())){
                            counter++;
                        }
                    }
                    System.out.println("Lista prawidłowych odpowiedzi: " + counter+"/"+questions.size());
                    String score = nick + " " + counter+"/"+questions.size()+"\n";
                    try {
                        Path pathToResultFile = Paths.get("ranking.txt");
                        Files.write(pathToResultFile,score.getBytes(),Files.exists(pathToResultFile)? StandardOpenOption.APPEND: StandardOpenOption.CREATE);
                    } catch (IOException e) {
                        System.out.println("Nie mozna zapisac pliku");
                    }

                    break;
                }
                case 2: {
                    //Dodac sortowanie
                    System.out.println("Wyniki: ");
                    List<String> ranking = Quiz.getRanking();
                    if (ranking != null) {

                        for (String wynik : ranking) {
                            ranking.sort(Comparator.naturalOrder() );
                            System.out.println(wynik);
                        }
                    } else {
                        System.out.println("Brak wyników");
                    }
                    break;
                }
                case 0: {
                    System.out.println("Dziękujemy za grę, zapraszamy ponownie!");
                    flag = true;
                    break;
                }
                default: {
                    System.out.println("Nie wybrałeś żadnej opcji, spróbuj ponownie");
                    break;
                }
            }
        } while (!flag);
    }
}
