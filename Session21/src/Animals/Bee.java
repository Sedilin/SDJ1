package Animals;

public class Bee extends Animal{

    private boolean isAHoneyBee;

    public String speak()
    {
        return "Bzzz";
    }

    public String toString()
    {
        return super.toString() + " " + isAHoneyBee;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Bee))
        {
            return false;
        }
        else
        {
            Bee other = (Bee) obj;
            return super.equals(other) && other.isAHoneyBee == isAHoneyBee;
        }
    }
}
