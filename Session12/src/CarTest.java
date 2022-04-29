public class CarTest
{
  public static void main(String[] args)
  {
    Car car1 = new Car(2000, "Fiat", "Punto", "Black", "XD 20032");
    Car car2 = new Car(car1);
    Car car3 = new Car(1999, "Audi", "Q5", "White");

    System.out.println(car2);
    System.out.println(car3);
    System.out.println(car1.equals(car2));
    System.out.println(car1.equals(car3));

  }
}
