import java.util.Scanner;

public class Grades
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Grades in Danish System: 12, 10, 7, 4, 2, 0, -3");
    System.out.println("Put your grade: ");
    int grade = scanner.nextInt();

    if (grade == 12)
    {
      System.out.println("You got A");
    }
    if (grade == 10)
    {
      System.out.println("You got B");
    }
    if (grade == 7)
    {
      System.out.println("You got C");
    }
    if (grade == 4)
    {
      System.out.println("You got D");
    }
    if (grade == 2)
    {
      System.out.println("You got E");
    }
    if (grade == 0)
    {
      System.out.println("You got Fx");
    }
    if (grade == -3)
    {
      System.out.println("You got F");
    }
    else
    {
      System.out.println("The typed number is wrong, try again.");
    }
  }
}
