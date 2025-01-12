import java.util.List;
// Concrete class to represent a true/false quiz
public class TrueFalseQuiz extends Quiz {
    public TrueFalseQuiz(String name, List<Question> questions) {
        super(name, questions);
    }

    @Override
    public int getScore(List<Integer> answers) {
        int score = 0;
        List<Question> questions = getQuestions();
        for (int i = 0; i < questions.size(); i++) {
            TrueFalseQuestion question = (TrueFalseQuestion) questions.get(i);
            boolean correctAnswer = question.getCorrectAnswer();
            int userAnswerIndex = answers.get(i);
            boolean userAnswer = userAnswerIndex == 0;
            if (correctAnswer == userAnswer) {
                score++;
            }
        }
        return score;
    }
}
