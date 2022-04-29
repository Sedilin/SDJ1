public class MyDateTest
{
  public static void main(String[] args)
  {
    MyDate person1 = new MyDate(19,4,1995);
    MyDate person2 = new MyDate(9,2,2000);



    System.out.println("Birthday of Chris: " + person1.getDay() + "." + person1.getMonth() +
                        "." + person1.getYear());
    System.out.println("Birthday of Jojo: " + person2.getDay() + "." + person2.getMonth() +
                        "." + person2.getYear());

    System.out.println(person1.isLeapYear());
    System.out.println(person2.isLeapYear());
  }
}
