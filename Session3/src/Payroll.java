import java.util.Scanner;

public class Payroll
{
  private String name;
  private double payRate;
  private double hours;

  public Payroll()
  {
    name = "Adam";
    payRate = 100;
    hours = 20;
  }

  public Payroll(String name, double payRate, double hours){
    this.name = name;
    this.payRate = payRate;
    this.hours = hours;
  }

  public void setName(String n){
    name = n;
  }
  public void setPayRate(double p){
    payRate = p;
  }
  public void setHours(double h){
    hours = h;
  }

  public String getName(){return name;}

  public double getHours()
  {
    return hours;
  }

  public double getPayRate()
  {
    return payRate;
  }

  public String toString()
  {
    return name + " works " + hours + " and gains " + payRate + " per hour.";
  }
}
