import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuizManager quizManager = new QuizManager("John","4567");
        QuizTaker quizTaker = new QuizTaker("Alice","2098");

        System.out.println("_______________________________________________");
        System.out.println("   Welcome to the quiz "+ User.getName()+"!!!");
        System.out.println("Enter the number of correct answer.");
        System.out.println("_______________________________________________");

        System.out.println("Which type of quiz would you like to take? (1 or 2)");
        System.out.println("1. Multiple choice");
        System.out.println("2. True/false");

        Scanner scanner=new Scanner(System.in);
        int quizType = scanner.nextInt();

        if(quizType==1) {
            // Create a multiple choice quiz
            List<Question> questions1 = new ArrayList<>();
            questions1.add(new MultipleChoiceQuestion("What is 2+2?", Arrays.asList("1", "2", "3", "4"), 3));
            questions1.add(new MultipleChoiceQuestion("What is the capital of France?", Arrays.asList("Paris", "London", "Madrid", "Rome"), 0));
            questions1.add(new MultipleChoiceQuestion("How many prime numbers between 1 and 10?",  Arrays.asList("2", "4", "5", "3"),1));
            quizManager.createQuiz("Math and Geography Quiz", questions1);
        }

        else if(quizType==2) {
            // Create a true/false quiz
            List<Question> questions2 = new ArrayList<>();
            questions2.add(new TrueFalseQuestion("The Earth is flat", false));
            questions2.add(new TrueFalseQuestion("Water boils at 100 degrees Celsius", true));
            questions2.add(new TrueFalseQuestion("Insects don't have lungs",true));
            quizManager.createTrueFalseQuiz("Science Quiz", questions2);
        }

        else{
            System.out.println("Invalid choice. Please enter 1 or 2.");
            return;
        }

        // Quiz taker takes the quiz
        List<Integer> answers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Quiz quiz = quizManager.getQuizzes().get(0);
        for (int i = 0; i < quiz.getQuestions().size(); i++) {
            Question question = quiz.getQuestions().get(i);
            System.out.println(question.getQuestion());
            if (question instanceof MultipleChoiceQuestion) {
                List<String> choices = ((MultipleChoiceQuestion) question).getChoices();
                for (int j = 0; j < choices.size(); j++) {
                    System.out.println((j + 1) + ". " + choices.get(j));
                }
            }
            else if (question instanceof TrueFalseQuestion){
                System.out.println("1. True");
                System.out.println("2. False");
            }

            int answer = input.nextInt();
            answers.add(answer - 1);
        }

        QuizTaker.takeQuiz(quiz, answers);
        int score = QuizTaker.getScore();

        System.out.println("Quiz taker " + User.getName() + " scored " + score + " out of " + quiz.getNumberOfQuestions() + " questions.");

        int Percentage= (score*100)/quiz.getNumberOfQuestions() ;
        char Grade;
        String Performance;

        if(Percentage>=75) {
          Grade='A';
          Performance="Excellent";

        }
        else if(Percentage>=65) {
            Grade='B';
            Performance="Very Good";

        }
        else if(Percentage>=50) {
            Grade='C';
            Performance="Good";
        }
        else {
            Grade='F';
            Performance="Weak";
        }
        System.out.println("Grade: "+ Grade);
        System.out.println("Performance: "+ Performance);

        System.out.println("_______________________________________________");
        System.out.println("THANKS FOR THE PARTICIPATION!");
        System.out.println("_______________________________________________");
    }
}







