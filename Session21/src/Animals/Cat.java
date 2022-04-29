package Animals;

public class Cat extends Pet{
    private boolean isAHouseCat;

    public String speak()
    {
        return "Meow";
    }

    public String toString()
    {
        return isAHouseCat + " " + super.toString();
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Cat))
        {
            return false;
        }
        else
        {
            Cat other = (Cat) obj;
            return super.equals(other) && other.isAHouseCat == isAHouseCat;
        }
    }
}
