public class Car
{
  private String make;
  private String model;
  private String color;
  private String licenseModel;
  private int year;

  public Car(int year, String make, String model, String color, String licenseModel)
  {
    this.year = year;
    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseModel = licenseModel;
  }

  public Car (int year, String make, String model, String color)
  {
    this.year = year;
    this.make = make;
    this.model = model;
    this.color = color;
    licenseModel = "There is no license number";
  }

  public String getModel()
  {
    return model;
  }
  public int getYear()
  {
    return year;
  }
  public String getColor()
  {
    return color;
  }
  public String getLicenseModel()
  {
    return licenseModel;
  }
  public String getMake()
  {
    return make;
  }

  public void setColor(String color)
  {
    this.color = color;
  }
  public void setLicenseModel(String licenseModel)
  {
    this.licenseModel = licenseModel;
  }

  public Car (Car obj)
  {
    year = obj.year;
    make = obj.make;
    model = obj.model;
    color = obj.color;
    licenseModel = obj.licenseModel;
  }

  public String toString()
  {
    return "Year: " + year + " || Make: " + make + " || Model: " + model + " || Color: " + color + " || License Model: " + licenseModel;
  }

  public boolean equals (Car obj)
  {
    if (model.equals(obj.model) && year == obj.year && color.equals(obj.color) && licenseModel.equals(obj.licenseModel) && make.equals(obj.make))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}
