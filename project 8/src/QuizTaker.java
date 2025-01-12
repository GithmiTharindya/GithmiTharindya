import java.util.List;
// Concrete class to represent a quiz taker
public class QuizTaker extends User {
    private static int score;

    public QuizTaker(String name,String password) {
        super(name,password);
    }

    public static int getScore() {
        return score;
    }

    public static void takeQuiz(Quiz quiz, List<Integer> answers) {
        score = quiz.getScore(answers);
    }
}

