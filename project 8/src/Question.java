// Abstract class to represent a quiz question
public abstract class Question {
    private String question;

    public Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    // Abstract method to get the correct answer index for a question
    public abstract int getCorrectAnswerIndex();
}
