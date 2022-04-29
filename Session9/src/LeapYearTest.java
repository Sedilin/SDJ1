import java.util.Scanner;

public class LeapYearTest
{
  public static void main(String[] args)
  {
    MyDate date1 = new MyDate(19, 4, 2000);

    int count = 0;

    while (!(date1.getYear() == 2022 && date1.getMonth() == 4 && date1.getDay() == 28))
    {
      date1.nextDay();
      count++;
    }
    System.out.println(count);


/*
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type in the start year: ");
    int startYear = scanner.nextInt();
    System.out.println("Type in the end year: ");
    int endYear = scanner.nextInt();

    date1.setYear(startYear);

    int count = 0;
    for (int i = startYear; i < endYear; i++)
    {
      date1.setYear(i);
      if(date1.isLeapYear())
      {
        count++;
      }
    }
    System.out.println("The amount of leap years: " + count);

 */
  }

}
