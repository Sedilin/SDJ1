package Exercise2;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Allan", 12);

        student.setGrade(12);
        System.out.println(student);
        try {
            student.setGrade(1);
        }
        catch (IllegalGradeException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(student);
    }
}
