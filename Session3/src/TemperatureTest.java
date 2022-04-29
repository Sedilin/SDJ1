import java.util.Scanner;

public class TemperatureTest
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is the temperature (in Fahrenheit): ");
    double temp = scanner.nextDouble();

    Temperature temperature = new Temperature(temp);

    System.out.println(
        "Fahrenheit: "+ temperature.getFahrenheit() +"\n" +
        "Celsius: "+ temperature.getCelsius() +"\n" +
        "Kelvin: " + temperature.getKelvin());
  }
}
