public class Car extends Vehicle{
    private String regNo;

    public Car(String owner, double price, String regNo)
    {
        super(owner, price);
        this.regNo = regNo;
    }

    public String toString()
    {
        return super.toString() + regNo;
    }
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Car))
        {
            return false;
        }
        else
        {
            Car other = (Car) obj;
            return super.equals(other) && regNo.equals(other.regNo);
        }
    }
}
