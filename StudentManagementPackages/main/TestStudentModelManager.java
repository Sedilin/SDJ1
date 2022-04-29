package main;

import model.StudentList;
import model.StudentModelManager;

public class TestStudentModelManager
{
  public static void main(String[] args)
  {
    StudentModelManager smm = new StudentModelManager("students.bin");

    // Get all students from the file and print them out
    StudentList list = smm.getAllStudents();
    System.out.println("All students:");
    System.out.println("------------------------------------------------------------");
    System.out.println(list);

    // Get all students from Romania from the file and print them out
    list = smm.getStudentsFrom("Romania");
    System.out.println("Students from Romania:");
    System.out.println("------------------------------------------------------------");
    System.out.println(list);

    // Get all students from Moldova from the file and print them out
    list = smm.getStudentsFrom("Moldova");
    System.out.println("Students from Moldova:");
    System.out.println("------------------------------------------------------------");
    System.out.println(list);

    // Change country
    smm.changeCountry("Dan", "Chisaru", "Moldova");
    smm.changeCountry("Diana", "Stratan", "Moldova");
    smm.changeCountry("Dragos", "Cotaga", "Moldova");
    smm.changeCountry("Veronica", "Tverdohleb", "Moldova");

    // Get all students from Romania from the file and print them out
    list = smm.getStudentsFrom("Romania");
    System.out.println("Students from Romania:");
    System.out.println("------------------------------------------------------------");
    System.out.println(list);

    // Get all students from Moldova from the file and print them out
    list = smm.getStudentsFrom("Moldova");
    System.out.println("Students from Moldova:");
    System.out.println("------------------------------------------------------------");
    System.out.println(list);
  }
}
