import java.util.Scanner;

public class GeometryTest
{
  public static void main(String[] args)
  {
    int choice;
    Scanner scanner = new Scanner(System.in);
    do
    {
      System.out.println("Geometry Calculator");
      System.out.println("1. Calculate the Area of a Circle");
      System.out.println("2. Calculate the Area of a Rectangle");
      System.out.println("3. Calculate the Area of a Triangle");
      System.out.println("4. Quit");
      System.out.println();
      System.out.println("Enter your choice (1-4): ");
      choice = scanner.nextInt();

      switch (choice)
      {
        case 1:
          System.out.println("Enter radius of circle: ");
          double r = scanner.nextDouble();
          System.out.println(Geometry.Area(r));
          break;
        case 2:
          System.out.println("Enter width: ");
          double width = scanner.nextDouble();
          System.out.println("Enter length: ");
          double length = scanner.nextDouble();
          System.out.println(Geometry.Area(width, length));
          break;
        case 3:
          System.out.println("Enter base: ");
          double base = scanner.nextDouble();
          System.out.println("Enter height: ");
          float height = scanner.nextFloat();
          System.out.println(Geometry.Area(base, height));
          break;
        case 4:
          System.out.println("Bye");
          break;
        default:
          System.out.println("Error");
          break;

      }
    }while(choice!=4);
  }
}
