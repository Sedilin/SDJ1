import java.util.Scanner;

public class CarTest
{
  public static void main(String[] args)
  {

    Scanner scanner = new Scanner(System.in);
    System.out.println("What year of the car: ");
    int yearModel = scanner.nextInt();
    scanner.nextLine();
    System.out.println("What brand: ");
    String make = scanner.nextLine();

    Car car = new Car(yearModel, make, 20);

    System.out.println(car);
    car.accelerate();
    System.out.println(car.getSpeed());
    car.accelerate();
    System.out.println(car.getSpeed());
    car.accelerate();
    System.out.println(car.getSpeed());
    car.accelerate();
    System.out.println(car.getSpeed());
    car.accelerate();
    System.out.println(car.getSpeed());
    car.brake();
    System.out.println(car.getSpeed());
    car.brake();
    System.out.println(car.getSpeed());
    car.brake();
    System.out.println(car.getSpeed());
    car.brake();
    System.out.println(car.getSpeed());
    car.brake();
    System.out.println(car.getSpeed());
  }
}
