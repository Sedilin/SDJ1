import java.util.Scanner;

public class QuadraticEquation
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a value: ");
    double a = scanner.nextDouble();
    System.out.println("Enter b value: ");
    double b = scanner.nextDouble();
    System.out.println("Enter c value: ");
    double c = scanner.nextDouble();

    double D = Math.pow(b,2) - (4*(a*c));

    if (D < 0)
    {
      System.out.println("No solution");
    }
    else if (D == 0)
    {
      double x = -(b/2*a);
      System.out.println("The solution is equal to: " + x);
    }
    else
    {
      double x1 = (-b + Math.sqrt(D))/2*a;
      double x2 = (-b - Math.sqrt(D))/2*a;

      System.out.println("The solutions are equal to: " + x1 + " and " + x2);
    }
  }
}
