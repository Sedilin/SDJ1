import java.util.Random;
import java.util.Scanner;

public class Guess
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    Random randomNumber = new Random();
    int x = randomNumber.nextInt(1000);

    System.out.print("Guess the number: ");
    int guess = scanner.nextInt();
    int count = 0;

    while (guess < x || guess > x)
    {

      if(guess < x)
      {
        System.out.println("The number was too little. Try again. ");
        System.out.print("Guess the number: ");
        guess = scanner.nextInt();
      }
      else
      {
        System.out.println("The number was too high. Try again");
        System.out.print("Guess the number: ");
        guess = scanner.nextInt();
      }
      count++;
    }
    System.out.println("Correct, it took you " + count + " tries");
  }
}
