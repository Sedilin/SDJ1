public class StudentTest
{
  public static void main(String[] args)
  {
    Student student1 = new Student("Allan", 'M');
    Student student2 = new Student("Jojo", 'M', 302002);
    Student student3 = new Student("Diana", 'M', 293445);

    student1.getStudentNumber();
    student1.getGender();
    student1.getName();

    student1.setName("Al");
    student1.setStudentNumber(345213);

    student2.getStudentNumber();
    student2.getName();
    student2.getGender();

    student2.setName("Jozef");
    student2.setStudentNumber(345445);

    student3.getStudentNumber();
    student3.getGender();
    student3.getName();

    student3.setName("Diana Suzana");
    student3.setStudentNumber(345698);

    System.out.println(student1);
    System.out.println(student2);
    System.out.println(student3);
  }
}
