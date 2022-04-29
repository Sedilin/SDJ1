import java.util.Scanner;

public class Exercise3
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is the sales tax: ");
    double salesTax = scanner.nextDouble();
    salesTax = salesTax/100.0;

    System.out.println("What is the first price: ");
    double firstPrice = scanner.nextDouble();
    System.out.println("What is the second price: ");
    double secondPrice = scanner.nextDouble();
    System.out.println("What is the third price: ");
    double thirdPrice = scanner.nextDouble();

    double totalSales1 = firstPrice * salesTax + firstPrice;
    double totalSales2 = secondPrice * salesTax + secondPrice;
    double totalSales3 = thirdPrice * salesTax + thirdPrice;

    System.out.println("The total sales are equal to: " + "\n" +totalSales1 + "\n" +
                            totalSales2 + "\n" + totalSales3);
  }
}
