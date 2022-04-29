public class Job
{
  private String title;
  private double monthSalary;
  private Person employee;

  public Job(String title, double monthSalary, Person employee)
  {
    this.title = title;
    this.monthSalary = monthSalary;
    this.employee = new Person (employee.getName(), employee.getBirthday());
  }

  public Job(String title, double monthSalary)
  {
    this.title = title;
    this.monthSalary = monthSalary;
    employee = new Person("No name", "None"); // it can be null
  }

  public String getTitle()
  {
    return title;
  }

  public double getMonthSalary()
  {
    return monthSalary;
  }

  public void setMonthSalary(double monthSalary)
  {
    this.monthSalary = monthSalary;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public void setEmployee(Person employee)
  {
    this.employee = employee;
  }

  public Person getEmployee()
  {
    return employee;
  }

  public void givePercentageRaise(double percentage)
  {
    monthSalary+=monthSalary*percentage;
  }

  public String toString()
  {
    return title + " " + monthSalary + " " + employee;
  }
}
