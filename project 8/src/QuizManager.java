import java.util.ArrayList;
import java.util.List;
// Concrete class to represent a quiz manager
public class QuizManager extends User {

    private List<Quiz> quizzes;

    public QuizManager(String name,String password) {
        super(name,password);
        quizzes = new ArrayList<>();
    }

    public List<Quiz> getQuizzes() {
        return quizzes;
    }

    public void createQuiz(String name, List<Question> questions) {
        Quiz quiz = new MultipleChoiceQuiz(name, questions);
        quizzes.add(quiz);
    }

    public void createTrueFalseQuiz(String name, List<Question> questions) {
        Quiz quiz = new TrueFalseQuiz(name, questions);
        quizzes.add(quiz);
    }

    public void removeQuiz(Quiz quiz) {
        quizzes.remove(quiz);
    }
}

