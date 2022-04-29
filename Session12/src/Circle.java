public class Circle
{

  private double radius;

  public double getArea()
  {
    return Math.PI * radius * radius;
  }
  public double getRadius()
  {
    return radius;
  }

  public Circle ()
  {
    radius = 0;
  }

  public Circle(double radius)
  {
    this.radius = radius;
  }

  public String toString()
  {
    return "The area is equal to: " + getArea() + "\nRadius is equal to: " + radius;
  }

  public boolean equals(Circle obj)
  {
    if (radius == obj.radius)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public boolean greaterThan (Circle obj)
  {
    if (getArea() > obj.getArea())
    {
      return true;
    }
    else
    {
      return false;
    }
  }

}
