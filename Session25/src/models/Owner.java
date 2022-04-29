package models;

public class Owner {
    private String firstName;
    private String lastName;

    public Owner(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String toString()
    {
        return firstName + "," + lastName;
    }
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Owner))
        {
            return false;
        }
        else
        {
            Owner other = (Owner) obj;
            return other.lastName.equals(lastName) && other.firstName.equals(firstName);
        }
    }

}
