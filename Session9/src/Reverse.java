import java.util.Scanner;

public class Reverse
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    String word;
    do
    {
      System.out.println("Put a word: ");
      word = scanner.nextLine();
      if (!word.equals("quit"))
      {
        for (int i = word.length() - 1; i >= 0; i--)
        {

          System.out.println(word.charAt(i));
        }
      }
    }
    while (!word.equals("quit"));
  }
}
