import java.util.Scanner;

public class Exercise6v2
{
  public static void main(String[] args)
  {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Type number of purchased shares: ");
    double shares1 = scanner.nextDouble();
    System.out.println("Type the share per bought: ");
    double payPerShare1 = scanner.nextDouble();
    System.out.println("Type the commission for stockbroker: ");
    double commission1 = scanner.nextDouble();
    System.out.println("Type the number of sold shares: ");
    double shares2 = scanner.nextDouble();
    System.out.println("Type the price per share of the sold stock: ");
    double payPerShare2 = scanner.nextDouble();

    double totalPay = shares1 * payPerShare1; // first dot
    double brokerBuy = totalPay * commission1; // second dot
    double totalSell = shares2 * payPerShare2; // third dot
    double brokerSell = totalSell * commission1; // fourth dot

    totalPay = totalPay + brokerBuy;
    totalSell = totalSell + brokerSell;

    double total = totalPay - totalSell;

    System.out.println("The profit he made is equal to: " + total);
  }
}
