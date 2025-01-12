// Concrete class to represent a true/false question
public class TrueFalseQuestion extends Question {
    private boolean correctAnswer;

    public TrueFalseQuestion(String question, boolean correctAnswer) {
        super(question);
        this.correctAnswer = correctAnswer;
    }

    public boolean getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public int getCorrectAnswerIndex() {
        return correctAnswer ? 0 : 1;
    }
}
