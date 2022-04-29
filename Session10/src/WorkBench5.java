import java.text.DecimalFormat;

public class WorkBench5
{
  public static void main(String[] args)
  {
    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    double result = 0;
    double full=0;
    for (int i = 1, j = 30; i <= 30; i++, j--)
    {
      result = (double)i/j;
      full = full + result;
      System.out.println("The " + (i+1) + " result equals to: " + decimalFormat.format(result));
    }
    System.out.println("The whole amount is equal: " + full);
  }
}
