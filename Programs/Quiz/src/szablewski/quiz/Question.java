package szablewski.quiz;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private String title;
    private List<String> answers = new ArrayList<>();
    private  String correctAnswer;

    public List<String> getAnswers() {
        return answers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Question(){
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        for (String a : answers) {
            sb.append(a).append("\n");
        }
        return sb.toString();
    }
}
