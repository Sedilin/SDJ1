public class Geometry
{
  public static double Area (double r)
  {
    return Math.PI * r * r;
  }
  public static double Area(double length, double width)
  {
    return length * width;
  }
  public static double Area(double base, float height)
  {
    return base * height * 0.5;
  }
}
