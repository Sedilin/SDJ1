import java.util.Scanner;

public class Exercise2
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type first integer: ");
    int x = scanner.nextInt();

    System.out.println("Type second integer: ");
    int y = scanner.nextInt();

    System.out.println("Type last integer: ");
    int z = scanner.nextInt();

    int sum = x+y+z;
    int product = x*y*z;

    System.out.println("The sum is equal to: " + sum);
    System.out.println("The product is equal to: " + product);
  }
}
