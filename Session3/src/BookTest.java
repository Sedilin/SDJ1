import java.util.Scanner;

public class BookTest
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    Books book1 = new Books(scanner.nextLine(), scanner.nextLine(),
        scanner.nextDouble(), scanner.nextInt());

    scanner.nextLine();

    Books book2 = new Books(scanner.nextLine(), scanner.nextLine(),
        scanner.nextDouble(), scanner.nextInt());



    System.out.println(book1);
    System.out.println(book2);

    book1.setPrice(book1.getPrice() * 0.8);
    book2.setPrice(book2.getPrice() * 0.8);

    System.out.println(book1);
    System.out.println(book2);
  }
}
