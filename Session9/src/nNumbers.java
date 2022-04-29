import java.util.Scanner;

public class nNumbers
{
  public static void main(String[] args)
  {
    int n;
    int number = 1;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type in the value of n: ");
    n = scanner.nextInt();

    for (int i = 1; i<=n; i++)
    {
      System.out.print(i + " ");
    }
    System.out.println();
    for (int i = 1; i<=n; i++)
    {
      System.out.print(2*i + " ");
    }
    System.out.println();
    for (int i = 1; i<=n; i++)
    {
      System.out.print(i*i + " ");
    }


  }
}
