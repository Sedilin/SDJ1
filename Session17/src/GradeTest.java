import java.util.ArrayList;

public class GradeTest {
    public static void main(String[] args) {
        GradeList gradeList = new GradeList();
        Grade grade1 = new Grade("SDJ", 12);
        Grade grade2 = new Grade("Math", 10);
        Grade grade3 = new Grade("RWD", 10);

        gradeList.addGrade(grade1);
        gradeList.addGrade(grade2);
        gradeList.addGrade(grade3);

        System.out.println(gradeList.getAllGrades());
        System.out.println();
        System.out.println(gradeList.getAverage());
        System.out.println();
        System.out.println(gradeList.getNumberOfGrades());
        System.out.println();
        System.out.println(gradeList);
        System.out.println();

        ArrayList<Grade> other;
        other=gradeList.getAllGrades();

        for (int i = 0; i < other.size(); i++)
        {
            System.out.println(other.get(i));
        }
    }
}
