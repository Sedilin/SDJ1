package Exercise3;

import java.time.LocalDate;

public class MyDate
{
  private int day;
  private int month;
  private int year;

  public MyDate()
  {
    MyDate temp = today();
    day = temp.day;
    month = temp.month;
    year = temp.year;
  }

  public MyDate(int day, int month, int year){
    setYear(year);
    setMonth(month);
    setDay(day);
  }

  public int getDay(){return day;}
  public int getMonth(){return month;}
  public int getYear(){return year;}

  public void setDay(int d){
    if (d < 1 || d > daysInMonth())
    {
      throw new IllegalDateException("day");
    }
    day = d;
  }
  public void setMonth(int m){
    if (m < 1 || m > 12)
    {
      throw new IllegalDateException("month");
    }
    month = m;
  }
  public void setYear(int y){
    if (y < 1)
    {
      throw new IllegalDateException("year");
    }
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

  public int daysInMonth()
  {
    if(month == 1 || month==3||month==5||month == 7|| month == 8|| month == 10 || month == 12)
    {
      return 31;
    }
    else if (month == 2)
    {
      if (isLeapYear())
      {
        return 29;
      }
      else
      {
        return 28;
      }
    }
    else if (month > 12 || month < 1)
    {
      return -1;
    }
    else
    {
      return 30;
    }
  }

  public String getAstroSign()
  {
    if (month == 1 && day >=20 || month == 2 && day < 19)
    {
      return "Aquarius";
    }
    else if (month == 2 && day >= 19 || month == 3 && day < 21)
    {
      return "Pisces";
    }
    else if (month == 3 && day >= 21 || month == 4 && day < 20)
    {
      return "Aries";
    }
    else if (month == 4 && day >= 20 || month == 5 && day < 20)
    {
      return "Taurus";
    }
    else if (month == 5 && day >= 21 || month == 6 && day < 23)
    {
      return "Gemini";
    }
    else if (month == 6 && day >= 23 || month == 7 && day < 23)
    {
      return "Cancer";
    }
    else if (month == 7 && day >= 23 || month == 8 && day < 23)
    {
      return "Leo";
    }
    else if (month == 8 && day >= 23 || month == 9 && day < 23)
    {
      return "Virgo";
    }
    else if (month == 9 && day >= 23 || month == 10 && day < 22)
    {
      return "Libra";
    }
    else if (month == 10 && day >= 22 || month == 11 && day < 22)
    {
      return "Scorpio";
    }
    else if (month == 11 && day >= 22 || month == 12 && day < 22)
    {
      return "Sagittarius";
    }
    else if (month == 12 && day >= 22 || month == 1 && day < 20)
    {
      return "Capricorn";
    }
    else
    {
      return "Error";
    }
  }

  public String dayOfWeek()
  {
    int q = day;
    int m = month;
    int y = year;

    if (m == 1 || m == 2)
    {
      m += 12;
      y--;
    }

    int h = (q + ((13*(m+1))/5) + (y%100) + ((y%100)/4) + ((y/100)/4) + 5 *(y/100))%7;

    if (h == 0)
    {
      return "Saturday";
    }
    else if(h==1)
    {
      return "Sunday";
    }
    else if(h==2)
    {
      return "Monday";
    }
    else if(h==3)
    {
      return "Tuesday";
    }
    else if(h==4)
    {
      return "Wednesday";
    }
    else if(h==5)
    {
      return "Thursday";
    }
    else if(h==6)
    {
      return "Friday";
    }
    else
    {
      return "Error";
    }
  }

  public String getMonthName()
  {
    switch (month)
    {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "Error";
    }
  }

  public void nextDay()
  {
    day++;

    if (day > daysInMonth())
    {
      day = 1;
      month++;
      if (month > 12)
      {
        month = 1;
        year++;
      }
    }
  }

  public boolean equals(Object obj) // session11
  {
    if(!(obj instanceof MyDate))
    {
      return false;
    }
    else
    {
      MyDate other = (MyDate)obj;
      return other.day == day &&
          other.month == month &&
          other.year == year;
    }
  }

  public MyDate copy()
  {
    return new MyDate(day, month, year);
  } //session11

  public MyDate(MyDate obj) // session11
  {
    day = obj.day;
    month = obj.month;
    year = obj.year;
  }

  public void nextDays(int days) // session11
  {
    day+=days;
    if (day > daysInMonth())
    {
      do
      {
        day -= daysInMonth();
        month++;
        if (month > 12)
        {
          month = 1;
          year++;
        }
      }
      while (day > daysInMonth());
    }
  }

  public static MyDate today()
  {
    LocalDate currentDate = LocalDate.now();
    int currentDay = currentDate.getDayOfMonth();
    int currentMonth = currentDate.getMonthValue();
    int currentYear = currentDate.getYear();

    return new MyDate(currentDay, currentMonth, currentYear);
  }

  public boolean isBefore(MyDate date2)
  {
    if(this.year < date2.year)
    {
      return true;
    }
    else if (this.year > date2.year)
    {
      return false;
    }
    else
    {
      if(this.month < date2.month)
      {
        return true;
      }
      else if (this.month > date2.month)
      {
        return false;
      }
      else
      {
        if(this.day < date2.day)
        {
          return true;
        }
        else
        {
          return false;
        }
      }
    }
  }


  public String toString()
  {
    return "Birthday: " + day + " " + month + " " + year;
  }
}
