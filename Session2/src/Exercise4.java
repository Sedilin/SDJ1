import java.util.Scanner;

public class Exercise4
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Type in your name: ");
    String name = scanner.nextLine();

    System.out.print("Type in your age: ");
    int age = scanner.nextInt();

    scanner.nextLine();

    System.out.print("Type in your address: ");
    String address = scanner.nextLine();

    System.out.println("Name: " + name + "\nAge: " + age + "\nAddress: " + address);
  }
}
