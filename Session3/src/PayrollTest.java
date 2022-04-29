import java.util.Scanner;

public class PayrollTest
{
  public static void main(String[] args)
  {


    Scanner scanner = new Scanner(System.in);
    System.out.println("Type in the name of first person: ");
    String name = scanner.nextLine();
    System.out.println("Type in the pay rate: ");
    double payRate = scanner.nextDouble();
    System.out.println("Type in the hours: ");
    double hours = scanner.nextDouble();

    Payroll person1 = new Payroll(name, payRate, hours);


    scanner.nextLine();

    System.out.println("Type in the name of person: ");
    name = scanner.nextLine();
    System.out.println("Type in the pay rate: ");
    payRate = scanner.nextDouble();
    System.out.println("Type in the hours: ");
    hours = scanner.nextDouble();

    Payroll person2 = new Payroll(name, payRate, hours);

    System.out.println(person1);
    System.out.println(person2);

    scanner.close();
  }
}
