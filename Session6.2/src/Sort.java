import java.util.Scanner;

public class Sort
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number: ");
    double number1 = scanner.nextDouble();
    System.out.println("Enter second number: ");
    double number2 = scanner.nextDouble();

    //a
    if (number1 > number2)
    {
      System.out.println("The bigger number is: " + number1);
    }
    else
    {
      System.out.println("The bigger number is: " + number2);
    }
    //b
    if (number1 > number2)
    {
      System.out.println(number2 + " " + number1);
    }
    else if (number1 < number2)
    {
      System.out.println(number1 + " " + number2);
    }
    //c
    System.out.println("Enter third number: ");
    double number3 = scanner.nextDouble();
    if (number1 < number2 && number2 < number3) // 123
    {
      System.out.println(number1 + " " + number2 + " " + number3);
    }
    else if (number1 < number2 && number3 < number2) //132
    {
      System.out.println(number1 + " " + number3 + " " + number2);
    }
    else if (number2 < number1 && number3 < number2) //321
    {
      System.out.println(number3 + " " + number2 + " " + number1);
    }
    else if (number2 < number1 && number1 < number3) // 213
    {
      System.out.println(number2 + " " + number1 + " " + number3);
    }
    else if (number2 < number1 && number3 < number1) //231
    {
      System.out.println(number2 + " " + number3 + " " + number1);
    }
    else // 312
    {
      System.out.println(number3 + " " + number1 + " " + number2);
    }
  }
}

/*
123
132
321
312
213
231
 */

