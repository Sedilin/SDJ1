public class GarageTest
{
  public static void main(String[] args)
  {
    Car car1 = new Car(2000, "Fiat", "Punto", "Black");
    Car car2 = new Car(1994, "Honda", "Civic", "Red");

    Garage garage = new Garage();

    garage.park(car1, 1);

    System.out.println(garage.isParkingAreaTaken(1));
    System.out.println(garage.isParkingAreaTaken(2));
    System.out.println(garage.leaveGarage(1));
    garage.leaveGarage(1);
    garage.park(car2, 2);
    System.out.println(garage.isParkingAreaTaken(1));
    System.out.println(garage.isParkingAreaTaken(2));
  }
}
