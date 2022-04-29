package Animals;

public abstract class Animal {
    private int age;

    public abstract String speak();

    public String toString()
    {
        return "Age: " + age;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Animal))
        {
            return false;
        }
        else
        {
            Animal other = (Animal) obj;
            return other.age == age;
        }
    }
}
