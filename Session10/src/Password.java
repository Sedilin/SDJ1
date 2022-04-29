import java.util.Scanner;

public class Password
{
  public static void main(String[] args)
  {
    String username, password, confirmPassword;
    Scanner scanner = new Scanner(System.in);
    do
    {
        System.out.print("Enter username: ");
        username = scanner.nextLine();
        System.out.print("Enter password: ");
        password = scanner.nextLine();
        System.out.print("Repeat password: ");
        confirmPassword = scanner.nextLine();
      if (!password.equals(confirmPassword))
      {
        System.out.println("Error");
      }
    }
    while(!password.equals(confirmPassword));
    System.out.println("Account created. Your data:\n" + username + "\n" + password);
  }
}
