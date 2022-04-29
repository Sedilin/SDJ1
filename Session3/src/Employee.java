public class Employee
{
  private String name;
  private int idNumber;
  private String department;
  private String position;

  public String getName(){return name;}
  public int getIdNumber(){return idNumber;}
  public String getDepartment(){return department;}
  public String getPosition(){return position;}

  public void setName(String n){
    name = n;
  }

  public void setDepartment(String d)
  {
    department = d;
  }

  public void setIdNumber(int id)
  {
    idNumber = id;
  }

  public void setPosition(String p)
  {
    position = p;
  }
}
