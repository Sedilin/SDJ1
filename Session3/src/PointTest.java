public class PointTest
{
  public static void main(String[] args)
  {
    double PointDistance;

    Point point1 = new Point(3,7);
    Point point2 = new Point(5,14);

    point1.moveTo(5,9);
    point2.move(-4,6);

    System.out.println(point1);
    System.out.println(point2);

    double xPow = Math.pow(point1.getX() - point2.getX(), 2);
    double yPow = Math.pow(point1.getY() - point2.getY(), 2);

    PointDistance = Math.sqrt(xPow + yPow);

    System.out.println("The distance of those two points is equal to: " + PointDistance);

  }
}
