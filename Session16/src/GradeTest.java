public class GradeTest {
    public static void main(String[] args)
    {
        GradeList gradeList = new GradeList(4);
        Grade grade1 = new Grade("Math", 7);
        Grade grade2 = new Grade("Math", 12);
        Grade grade3 = new Grade("SDJ", 10);
        Grade grade4 = new Grade("SDJ", 12);

        gradeList.setGrade(grade1, 0);
        gradeList.setGrade(grade2, 1);
        gradeList.setGrade(grade3, 2);
        gradeList.setGrade(grade4, 3);

        System.out.println("The average: " + gradeList.getAverage());
        System.out.println("The number of grades: " + gradeList.getNumberOfGrades());
        System.out.println(gradeList.getGrade(2));
        System.out.println(gradeList);
    }
}
