package Animals;

public abstract class Pet extends Animal{
    private String name;

    public String toString()
    {
        return "Name: " + name + super.toString();
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Pet))
        {
            return false;
        }
        else
        {
            Pet other = (Pet) obj;
            return super.equals(other) && other.name.equals(name);
        }
    }
}
