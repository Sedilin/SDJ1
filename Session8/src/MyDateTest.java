public class MyDateTest
{
  public static void main(String[] args)
  {
    MyDate person1 = new MyDate(19,4,2000);
    MyDate person2 = new MyDate(9,2,2000);



    System.out.println("Birthday of Chris: " + person1.getDay() + "." + person1.getMonth() +
                        "." + person1.getYear());
    System.out.println("Birthday of Jojo: " + person2.getDay() + "." + person2.getMonth() +
                        "." + person2.getYear());

    System.out.println();

    System.out.println("Is it true that it is a leap year: " + person1.isLeapYear());
    System.out.println("Is it true that it is a leap year: " + person2.isLeapYear());

    System.out.println();

    System.out.println("This month is equal to: "+ person1.daysInMonth() + " days");
    System.out.println("This month is equal to: "+ person2.daysInMonth() + " days");

    System.out.println();

    System.out.println("His astrological sign is: " + person1.getAstroSign());
    System.out.println("His astrological sign is: " + person2.getAstroSign());

    System.out.println();

    System.out.println("Day of the week: " + person1.dayOfWeek());
    System.out.println("Day of the week: " + person2.dayOfWeek());

    System.out.println();

    System.out.println("Name of the month is: " + person1.getMonthName());
    System.out.println("Name of the month is: " + person2.getMonthName());
  }
}
