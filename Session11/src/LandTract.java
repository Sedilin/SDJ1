public class LandTract
{
  private double length;
  private double width;

  public LandTract(double length, double width)
  {
    this.length = length;
    this.width = width;
  }

  public static double area(LandTract obj)
  {
    return obj.length * obj.width;
  }

  public boolean equals(LandTract obj)
  {
    if(length == obj.length && width == obj.width || length == obj.width && width == obj.length)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public String toString()
  {
    return length + " " + width;
  }
}
