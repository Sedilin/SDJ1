import java.util.Locale;
import java.util.Scanner;

public class Exercise1
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your favourite city?: ");
    String city = scanner.nextLine();

    int strSize = city.length();
    String upper = city.toUpperCase();
    String lower = city.toLowerCase();
    char firstLetter = city.charAt(0);

    System.out.println(strSize + "\n" + upper + "\n" + lower + "\n" + firstLetter);
  }
}
