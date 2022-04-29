import java.text.DecimalFormat;

public class Clock
{
  private int hour;
  private int minute;
  private int second;
  private boolean timeFormat24;

  public Clock(int hour, int minute, int second)
  {
    this.second = second;
    this.minute = minute;
    this.hour = hour;
  }

  public Clock(int totalTimeInSeconds)
  {
    hour = totalTimeInSeconds/3600;
    totalTimeInSeconds -= hour*3600;
    minute = totalTimeInSeconds/60;
    second = totalTimeInSeconds - minute*60;
  }

  public void set(int h, int m, int s)
  {
    hour = h;
    minute = m;
    second = s;
  }

  public int getHour()
  {
    return hour;
  }
  public int getMinute()
  {
    return minute;
  }
  public int getSecond()
  {
    return second;
  }

  public void tic()
  {
    if (second < 59)
    {
      second++;
    }
    else
    {
      second=0;
      if (minute < 59)
      {
        minute++;
      }
      else
      {
        minute = 0;
        if(hour < 23)
        {
          hour++;
        }
        else
        {
          hour = 0;
        }
      }
    }
  }

  public int convertToSeconds()
  {
    return (hour*3600) + (minute*60) + second;
  }

  public boolean isBefore(Clock time)
  {
    if(this.hour < time.hour)
    {
      return true;
    }
    else if (this.hour > time.hour)
    {
      return false;
    }
    else
    {
      if(this.minute < time.minute)
      {
        return true;
      }
      else if (this.minute > time.minute)
      {
        return false;
      }
      else
      {
        if(this.second < time.second)
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

  public int timeInSecondsTo(Clock time)
  {
    if (isBefore(time))
    {
      return time.convertToSeconds() - convertToSeconds();
    }
    else
    {
      return convertToSeconds() - time.convertToSeconds();
    }
  }

  public Clock timeToClock (Clock time)
  {
    int a = timeInSecondsTo(time);
    Clock temp = new Clock(a);
    return temp;
  }

  public boolean isTimeFormat()
  {
    return timeFormat24;
  }

  public void setTimeFormat24(int hourFormat)
  {
    switch (hourFormat)
    {
      case 12:
      timeFormat24 = false;
      break;
      case 24:
      timeFormat24 = true;
      break;
      default:
        break;
    }
  }

  public String toString()
  {
    DecimalFormat formatter = new DecimalFormat("00");
    if (timeFormat24)
    {
      return String.format("%02d:%02d:%02d", hour,minute,second);
    }
    else
    {
      if (hour > 12)
      {
        return String.format("%02d:%02d:%02d PM", hour-12,minute,second);
      }
      else if (hour < 12)
      {
        return String.format("%02d:%02d:%02d AM", hour,minute,second);
      }
      else
      {
        return String.format("%02d:%02d:%02d PM", hour,minute,second);
      }
    }

    //DecimalFormat formatter = new DecimalFormat("00");
    //return formatter.format(hour) + ":" + formatter.format(minute) + ":" + formatter.format(second);
    //return String.format("%02d:%02d:%02d", hour,minute,second);


  }


}
