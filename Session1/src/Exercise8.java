import java.util.Scanner;

public class Exercise8
{
  public static void main(String[] args)
  {

    Scanner scanner = new Scanner((System.in));
    System.out.print("Type in celsius = ");
    double celsius = Double.parseDouble(scanner.nextLine());
    System.out.println((9.0/5) * celsius + 32);
  }
}
