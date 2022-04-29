public class Person
{

  private String name;
  private String birthday;

  public Person()
  {
    name = "Adam";
    birthday = "January";
  }

  public Person (String name, String birthday)
  {
    this.name = name;
    this.birthday = birthday;
  }

  public void setName(String n)
  {
    name = n;
  }

  public void setBirthday(String bd)
  {
    birthday = bd;
  }

  public String getBirthday()
  {
    return birthday;
  }

  public String getName()
  {
    return name;
  }



  public String toString ()
  {
    return name + " " + birthday;
  }
}