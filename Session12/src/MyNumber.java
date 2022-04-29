public class MyNumber
{
  //a
  private int number;
  public MyNumber (int number)
  {
    this.number = number;
  }
  public int getNumber()
  {
    return number;
  }
  //b,c
  public int getLastDigit()
  {
    if(number < 0)
    {
      return -number%10;
    }
    else
    {
      return number%10;
    }
  }
  //d
  public int getFirstDigit()
  {
    do
    {
      if(number >= 10)
      {
        return number / 10;
      }
      else if (number <= 10)
      {
        return number / 10;
      }
      else
        return number;

    } while (number < 0);
  }
  //e


}
