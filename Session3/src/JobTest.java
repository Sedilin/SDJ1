public class JobTest
{
  public static void main(String[] args)
  {
    Person person1 = new Person("John", "January, 1996");
    Person person2 = new Person("Michael", "February, 2000");

    Job job1 = new Job("Programmer", 20000, person1);
    Job job2 = new Job("Teacher", 17000, person2);

    job1.getEmployee();
    job1.getMonthSalary();
    job1.getTitle();

    job2.getEmployee();
    job2.getMonthSalary();
    job2.getTitle();

    job1.setTitle("Technician");
    job2.setMonthSalary(23000);

    System.out.println(job1);
    System.out.println(job2);

    job1.givePercentageRaise(0.05);
    job2.givePercentageRaise(0.02);

    System.out.println(job1);
    System.out.println(job2);


  }
}
