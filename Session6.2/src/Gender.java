import java.util.Scanner;

public class Gender
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your gender? ");
    String gender = scanner.nextLine();
    char g = gender.charAt(0);
    System.out.println("Type in your age: ");
    int age = scanner.nextInt();

    if (! (g == 'M' || g== 'F' || age < 0))
    {
      System.out.println("Error in typed values");
    }
    else if (g == 'M')
    {
      if (age < 18)
      {
        System.out.println("Boy");
      }
      else if (age >= 18)
      {
        System.out.println("Man");
      }
    }
    else if (g == 'F')
    {
      if (age < 18)
      {
        System.out.println("Girl");
      }
      else if (age >= 18)
      {
        System.out.println("Woman");
      }
    }
  }
}
