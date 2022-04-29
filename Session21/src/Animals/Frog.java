package Animals;

public class Frog extends Animal{
    private String colour;

    public String speak()
    {
        return "Ribbit";
    }

    public String toString()
    {
        return colour + " " + super.toString();
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Frog))
        {
            return false;
        }
        else
        {
            Frog other = (Frog) obj;
            return super.equals(other) && other.colour.equals(colour);
        }
    }
}
