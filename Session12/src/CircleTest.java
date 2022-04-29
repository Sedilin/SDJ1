public class CircleTest
{
  public static void main(String[] args)
  {
    Circle circle1 = new Circle(12);
    Circle circle2 = new Circle();
    Circle circle3 = new Circle(12);

    System.out.println(circle3);
    System.out.println();
    System.out.println(circle1);
    System.out.println();
    System.out.println(circle2);
    System.out.println();

    System.out.println(circle1.getArea());
    System.out.println();
    System.out.println(circle3.greaterThan(circle2));
    System.out.println(circle1.equals(circle3));
  }
}
