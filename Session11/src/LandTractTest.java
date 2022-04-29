public class LandTractTest
{
  public static void main(String[] args)
  {
    LandTract tract1 = new LandTract(400, 600);
    LandTract tract2 = new LandTract(500, 300);
    LandTract tract3 = new LandTract(400, 600);

    System.out.println(LandTract.area(tract1));
    System.out.println(LandTract.area(tract2));
    System.out.println(LandTract.area(tract3));

    System.out.println();

    System.out.println(tract1.equals(tract3));
    System.out.println(tract2.equals(tract1));
  }
}
