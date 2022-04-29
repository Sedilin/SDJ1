public class EmployeeTest
{
  public static void main(String[] args)
  {
    Employee person1 = new Employee();
    Employee person2 = new Employee();
    Employee person3 = new Employee();

    person1.setName("Susan Meyers");
    person1.setIdNumber(47899);
    person1.setDepartment("Accounting");
    person1.setPosition("Vice President");

    person2.setName("Mark Jones");
    person2.setIdNumber(39119);
    person2.setDepartment("IT");
    person2.setPosition("Programmer");

    person3.setName("Joy Rogers");
    person3.setIdNumber(81774);
    person3.setDepartment("Manufacturing");
    person3.setPosition("Engineer");

    System.out.println("Name" + "\t\t\t\t\t" + "ID Number" + "\t\t\t\t" + "Department" + "\t\t\t\t" + "Position");
    System.out.println(person1.getName() + "\t\t" + person1.getIdNumber() + "\t\t\t\t" + person1.getDepartment() + "\t\t\t\t" + person1.getPosition());
    System.out.println(person2.getName() + "\t\t\t" + person2.getIdNumber() + "\t\t\t\t" + person2.getDepartment() + "\t\t\t\t\t\t\t\t" + person2.getPosition());
    System.out.println(person3.getName() + "\t\t\t" + person3.getIdNumber() + "\t\t\t\t" + person3.getDepartment() + "\t\t\t" + person3.getPosition());



  }
}
