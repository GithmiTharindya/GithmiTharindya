import java.util.List;
// Abstract class to represent a quiz
public abstract class Quiz {
    private String name;
    private List<Question> questions;

    public Quiz(String name, List<Question> questions) {
        this.name = name;
        this.questions = questions;
    }

    public String getName() {
        return name;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void removeQuestion(Question question) {
        questions.remove(question);
    }

    public int getNumberOfQuestions() {
        return questions.size();
    }

    // Abstract method to get the quiz score for a user's answers
    public abstract int getScore(List<Integer> answers);


}

