public class Person
{

  private String name;
  private String address;
  private MyDate birthday;

  public Person(MyDate birthday)
  {
    name = "Adam";
    address = "Somewhere";
    this.birthday = birthday.copy();
  }

  public Person(String name, String address, MyDate birthday)
  {
    this.name = name;
    this.address = address;
    this.birthday = birthday.copy();
  }

  public Person(String name, MyDate birthday)
  {
    this.name = name;
    this.birthday = birthday.copy();
    address = "Somewhere";
  }

  public void setBirthday(MyDate birthday)
  {
    this.birthday = birthday.copy();
  }

  public MyDate getBirthday()
  {
    return birthday.copy();
  }

  public void setName(String n)
  {
    name = n;
  }

  public void setAddress(String ad)
  {
    address = ad;
  }

  public String getAddress()
  {
    return address;
  }

  public String getName()
  {
    return address;
  }

  public int getAge()
  {
    int age = MyDate.today().getYear() - birthday.getYear();
    if (MyDate.today().getMonth() > birthday.getMonth() || MyDate.today().getMonth() == birthday.getMonth() && MyDate.today().getDay() >= birthday.getDay())
    {
      return age;
    }
    else
    {
     return age - 1;
    }
  }


  public String toString ()
  {
    return name + " " + address;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Person))
    {
      return false;
    }
    else
    {
      Person other = (Person) obj;
      return other.name.equals(name) &&
          other.address.equals(address) &&
          other.birthday.equals(birthday);
    }
  }
}