import java.util.Scanner;

public class TestScoreTest
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type in your first score: ");
    double score1 = scanner.nextDouble();
    System.out.println("Type in your second score: ");
    double score2 = scanner.nextDouble();
    System.out.println("Type in your third score: ");
    double score3 = scanner.nextDouble();

    TestScore testScore = new TestScore(score1, score2, score3);

    testScore.average();

    System.out.println(testScore);

  }
}
