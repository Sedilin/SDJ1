public class Car
{


  private int yearModel;
  private String make;
  private int speed;

  public Car(int yearModel, String make, int speed) //Constructor
  {
    this.yearModel = yearModel;
    this.make = make;
    this.speed = 0;
  }
  public int getSpeed()
  {
    return speed;
  }


  public void accelerate()
  {
    speed = speed + 5;
  }

  public void brake()
  {
    speed = speed - 5;
  }

  public String toString(){
    return "Year of the car: " + yearModel + "\nThe model: " + make + "\nThe current speed: " + speed;
  }


}
