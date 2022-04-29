public class Fibonacci
{
  public static void main(String[] args)
  {
    int j = 0;
    int f = 1;

    System.out.println("Fibonacci (0) = " + f);
    for (int i = 1; i <= 20; i++)
    {
      f = j + f;
      j = f-j;
      System.out.println("Fibonacci (" + i + ") = " + f);
    }
  }
}
