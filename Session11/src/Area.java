public class Area
{
  public static double area(double r)
  {
    return Math.PI * Math.pow(r, 2);
  }
  public static double area(double width, double length)
  {
    return width*length;
  }
  public static double area(double r, float h)
  {
    return Math.PI * Math.pow(r, 2) * h;
  }
}
