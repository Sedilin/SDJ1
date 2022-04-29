package Animals;

public class Dog extends Pet{
    private String breed;

    public String speak()
    {
        return "Woof";
    }

    public String toString()
    {
        return breed + " " + super.toString();
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Dog))
        {
            return false;
        }
        else
        {
            Dog other = (Dog) obj;
            return super.equals(other) && other.breed.equals(breed);
        }
    }
}
