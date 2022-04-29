package Dimensions;

public abstract class TwoDimensionalShape {
    private double x;
    private double y;

    public TwoDimensionalShape(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void moveTo(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public abstract double getArea();

    public String toString()
    {
        return x + " " + y;
    }
    public boolean equals(Object obj)
    {
        if (!(obj instanceof TwoDimensionalShape))
        {
            return false;
        }
        else
        {
            TwoDimensionalShape other = (TwoDimensionalShape) obj;
            return other.x == x && other.y == y;
        }
    }
}
