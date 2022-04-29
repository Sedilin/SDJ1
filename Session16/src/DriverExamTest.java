import java.util.Scanner;

public class DriverExamTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] userAnswers = new char[20];

        for (int i = 0; i < userAnswers.length; i++)
        {
            do {
                System.out.println("Give the answer for position: " + (i+1));
                userAnswers[i] = scanner.nextLine().charAt(0);
            }
            while (userAnswers[i] != 'A' && userAnswers[i] != 'B' && userAnswers[i] != 'C' && userAnswers[i] != 'D');
        }
        DriverExam exam = new DriverExam(userAnswers);
        System.out.println("Total correct: " + exam.totalCorrect());
        System.out.println("Total incorrect: " + exam.totalIncorrect());
        System.out.println(exam.passed());

        int[] box = exam.questionsMissed();

        for (int i = 0; i < box.length; i++)
        {
            System.out.println(box[i]);
        }
    }
}
