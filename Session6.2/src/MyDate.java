public class MyDate
{
  private int day;
  private int month;
  private int year;

  public MyDate()
  {
    day = 1;
    month = 1;
    year = 2000;
  }

  public MyDate (int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getDay(){return day;}
  public int getMonth(){return month;}
  public int getYear(){return year;}

  public void setDay(int d){
    day = d;
  }
  public void setMonth(int m){
    month = m;
  }
  public void setYear(int y){
    year = y;
  }

  public boolean isLeapYear()
  {
    if((year%4 == 0 && year%100 != 0) || year%400 == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public String toString()
  {
    return "Birthday: " + day + " " + month + " " + year;
  }
}
