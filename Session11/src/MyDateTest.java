public class MyDateTest
{
  public static void main(String[] args)
  {
    MyDate date1 = new MyDate(10, 3, 2022);
    MyDate date2 = new MyDate();
    MyDate date3 = new MyDate(5, 3, 2000);

    System.out.println(date2);

    System.out.println(date1.equals(date2));

    date1.nextDays(1000);
    System.out.println(date1);

    System.out.println(date2.isBefore(date1));

  }
}
