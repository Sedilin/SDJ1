public class Person
{

  private String name;
  private Address address;
  private MyDate birthday;
  private Brain brain;

  public Person(MyDate birthday)
  {
    name = "Adam";
    address = new Address("","", "", "", "");
    this.birthday = birthday.copy();
    brain = new Brain();
  }
  public Person(String name, Address address, MyDate birthday)
  {
    this.name = name;
    this.address = address;
    this.birthday = birthday.copy();
    brain = new Brain();
  }
  public Person(String name, MyDate birthday)
  {
    this.name = name;
    this.birthday = birthday.copy();
    address = new Address("","", "", "", "");
    brain = new Brain();
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
  public void setAddress(Address ad)
  {
    address = ad;
  }
  public Address getAddress()
  {
    return address;
  }
  public String getShortAddress()
  {
    return address.getStreet() + " " + address.getNumber();
  }
  public String getName()
  {
    return name;
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

  public int getIQ()
  {
    return brain.getIQ();
  }
  public boolean isBrainDamaged()
  {
    return brain.isBrainDamaged();
  }
  public boolean doYouRemember(String topic)
  {
    return brain.recall(topic);
  }
  public void rememberThis(String topic)
  {
    brain.remember(topic);
  }
  public String whatAreYouThinkingAbout()
  {
    return brain.recall();
  }
  public String toString ()
  {
    return name + " " + address + " " + birthday.copy() + " " + brain;
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
          other.birthday.equals(birthday.copy()) &&
              other.brain.equals(brain);
    }
  }
}