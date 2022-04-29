public class GradeList {
    private Grade[] grades;

    public GradeList(int numberOfGrades)
    {
        grades = new Grade[numberOfGrades];
    }

    public int getNumberOfGrades()
    {
        int count = 0;
        for (int i = 0; i < grades.length; i++)
        {
            if (grades[i] != null)
            {
                count++;
            }
        }
        return count;
    }
    public Grade getGrade(int index)
    {
        return grades[index];
    }
    public void setGrade(Grade grade, int index)
    {
        grades[index] = grade;
    }
    public double getAverage()
    {
        int total = 0;
        double average;
        for (int i = 1; i < grades.length; i++)
        {
            if (grades[i] != null)
            {
                total += grades[i].getGrade();
            }
        }
        average = (double)total/getNumberOfGrades();
        return average;
    }

    public String toString()
    {
        String info = "";
        for (int i = 0; i < grades.length; i++)
        {
            if (grades[i] != null)
            {
                info += "The " + (i+1) + " grade = " + grades[i] + "\n";
            }
        }
        return info;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof GradeList))
        {
            return false;
        }
        else
        {
            GradeList other = (GradeList) obj;
            if (grades.length != other.grades.length)
            {
                return false;
            }
            else
            {
                for (int i = 0; i < grades.length; i++)
                {
                    if (grades[i] != other.grades[i])
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }


}
