import java.util.Random;
import java.util.Scanner;

public class Guess
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    Random randomNumber = new Random();
    int x = randomNumber.nextInt(10);

    System.out.print("Guess the number: ");
    int guess = scanner.nextInt();

    if (guess == x)
    {
      System.out.println("Correct");
    }
    else
    {
      System.out.println("Wrong, the number was: " + x);
    }
  }
}
