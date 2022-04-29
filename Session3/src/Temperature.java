public class Temperature
{
  private double ftemp; // Fahrenheit

  public Temperature(double ftemp){
    this.ftemp = ftemp;
  }

  public double getFahrenheit()
  {
    return ftemp;
  }

  public void setFahrenheit(double ftemp)
  {
    this.ftemp = ftemp;
  }

  public double getCelsius()
  {
    return (ftemp-32)*(5D/9);
  }

  public double getKelvin()
  {
    return ((ftemp-32)*(5D/9)) + 273;
  }

  public String toString(){
    return "The temperature is equal to: " + ftemp;
  }
}