import java.util.List;
// Concrete class to represent a multiple choice quiz
public class MultipleChoiceQuiz extends Quiz {
    public MultipleChoiceQuiz(String name, List<Question> questions) {
        super(name, questions);
    }

    @Override
    public int getScore(List<Integer> answers) {
        int score = 0;
        List<Question> questions = getQuestions();
        for (int i = 0; i < questions.size(); i++) {
            MultipleChoiceQuestion question = (MultipleChoiceQuestion) questions.get(i);
            int correctAnswerIndex = question.getCorrectAnswerIndex();
            int userAnswerIndex = answers.get(i);
            if (correctAnswerIndex == userAnswerIndex) {
                score++;
            }
        }
        return score;
    }
}