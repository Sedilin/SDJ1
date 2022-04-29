import java.text.DecimalFormat;
import java.util.Scanner;

public class Pi
{
  public static void main(String[] args)
  {
    double pi = 1;
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many iterations of pi you want: ");
    int iterations = scanner.nextInt();
    double amount1 = 3;

    DecimalFormat decimalFormat = new DecimalFormat("0.00000");

    for (int i = 0; i<iterations; i++)
    {
      if (i%2 == 0)
      {
        pi = pi - 1.0/amount1;
      }
      else
      {
        pi = pi + 1.0/amount1;
      }
      amount1+=2;
    }
    double result = 4*pi;
    System.out.println("The value of Pi equals: " + decimalFormat.format(result));
  }
}
