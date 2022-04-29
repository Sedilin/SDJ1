import java.util.Scanner;

public class Exercise9
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the radius and length of a cylinder: ");
    double radius = scanner.nextDouble();
    double length = scanner.nextDouble();
    double area = radius * radius * Math.PI;
    System.out.println("Area is " + area + "\n" + "The volume is " + (area * length));
  }
}
