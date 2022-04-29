package models;

public class Car {
    private String regNumber;
    private String make;
    private String model;
    private int year;
    private Owner owner;

    public Car (String regNumber, String make, String model, int year, Owner owner)
    {
        this.regNumber = regNumber;
        this.make = make;
        this.model = model;
        this.year = year;
        this.owner = owner;
    }

    public int getYear() {
        return year;
    }
    public Owner getOwner() {
        return owner;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getRegNumber() {
        return regNumber;
    }

    public String toString()
    {
        return regNumber + "," + make + "," + model + "," + year + "," + owner;
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof Car))
        {
            return false;
        }
        else
        {
            Car other = (Car) obj;
            return other.owner.equals(owner) && other.model.equals(model) &&
                    other.year==year && other.regNumber.equals(regNumber) &&
                    other.make.equals(make);
        }
    }
}

