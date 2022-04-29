public class PersonTest
{
  public static void main(String[] args)
  {
    MyDate date1 = new MyDate(19, 4, 2000);
    Person person = new Person("Oliwia", "Nygade", date1);

    System.out.println(person.getAge());
  }
}
