// Concrete class to represent a multiple choice question
import java.util.List;

public class MultipleChoiceQuestion extends Question {
    private List<String> choices;
    private int correctAnswerIndex;

    public MultipleChoiceQuestion(String question, List<String> choices, int correctAnswerIndex) {
        super(question);
        this.choices = choices;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public List<String> getChoices() {
        return choices;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}