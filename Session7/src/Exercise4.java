import java.util.Scanner;

public class Exercise4
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter username: ");
    String username = scanner.nextLine();
    System.out.print("Enter password: ");
    String password = scanner.nextLine();
    System.out.print("Confirm password: ");
    String confirmPassword = scanner.nextLine();

    if(password.equals(confirmPassword))
    {
      System.out.println(username + "\n" + password);
    }
    else
    {
      System.out.println("Wrong password. Try again.");
    }
  }
}
