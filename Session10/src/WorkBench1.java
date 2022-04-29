import java.util.Scanner;

public class WorkBench1
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number to multiply: ");
    int number = scanner.nextInt();
    int product = 0;

    while(product < 100)
    {
      number *= 10;
      product = number;
    }
    System.out.println("Your product is equal to: " + product);
  }
}
