public class Exercise6
{
  public static void main(String[] args)
  {
    double shares1 = 1000;
    double payPerShare1 = 32.87;
    double commission1 = 0.02;

    double shares2 = 1000;
    double payPerShare2 = 33.92;
    double commission2 = 0.02;

    double totalPay = shares1 * payPerShare1; // first dot
    double brokerBuy = totalPay * commission1; // second dot
    double totalSell = shares2 * payPerShare2; // third dot
    double brokerSell = totalSell * commission2; // fourth dot

    totalPay = totalPay - brokerBuy;
    totalSell = totalSell - brokerSell;

    double total = totalPay - totalSell;

    System.out.println("The profit he made is equal to: " + total);


  }
}
