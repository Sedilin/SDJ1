import java.util.ArrayList;
public class GradeList {
    private ArrayList<Grade> grades;

    public GradeList()
    {
        grades = new ArrayList<Grade>();
    }
    public int getNumberOfGrades()
    {
        return grades.size();
    }
    public ArrayList<Grade> getAllGrades()
    {
        return grades;
    }
    public Grade[] getAllGradesAsArray()
    {
        Grade[] tempArray = new Grade[grades.size()];
        Grade[] newArray = grades.toArray(tempArray);

        return newArray;
    }
    public void addGrade(Grade grade)
    {
        grades.add(grade);
    }
    public double getAverage()
    {
        double average=0;
        int total = 0;
        for (int i = 0; i < grades.size(); i++)
        {
            total += grades.get(i).getGrade();
        }
        average = (double)total/grades.size();
        return average;
    }
    public String toString()
    {
        String info = "";
        for (int i = 0; i < grades.size(); i++)
        {
            if (grades.get(i) != null)
            {
                info += "The " + (i+1) + " grade: " + grades.get(i) + "\n";
            }
        }
        return info;
    }
}
