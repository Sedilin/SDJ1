import java.util.Scanner;

public class SumOfNumbers
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int x = 0;
    int n = 0;

    do
    {
      System.out.println("Enter positive number: ");
      x = scanner.nextInt();
      if(x<0)
      {
        System.out.println("Error");
        System.out.println("Enter positive number: ");
        x = scanner.nextInt();
      }
      for (int i =0; i<=x; i++)
      {
        n += i;
      }
    }
    while(x<0);
    System.out.println("The sum of all numbers from " + x + " is equal to: " + n);
  }
}
