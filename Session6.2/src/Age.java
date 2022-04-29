import java.util.Scanner;

public class Age
{

  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type in your age: ");
    int age = scanner.nextInt();

    if (age < 0)
    {
      System.out.println("Error in age value");
    }
    else if (age >= 0 && age <= 12)
    {
      System.out.println("Child");
    }

    else if (age >= 13 && age <= 19)
    {
      System.out.println("Teenager");
    }

    else if (age >= 20 && age <= 65)
    {
      System.out.println("Adult");
    }
    else if (age >= 66 && age < 100)
    {
      System.out.println("Senior citizen");
    }
    else
    {
      System.out.println("U ded");
    }
  }
}
