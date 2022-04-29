public class GradeList {
    private int[] grades;

    public GradeList(int numberOfGrades)
    {
        grades = new int[numberOfGrades];
        for (int i = 0; i < numberOfGrades; i++)
        {
            grades[i] = -1;
        }
    }

    public int getNumberOfGrades()
    {
        int count = 0;
        for (int i = 0; i < grades.length; i++)
        {
            if (grades[i] != -1)
            {
                count++;
            }
        }
        return count;
    }
    public int getGrade(int index)
    {
        return grades[index];
    }
    public void setGrade(int grade, int index)
    {
        grades[index] = grade;
    }
    public double getAverage()
    {
        int total = 0;
        double average;
        for (int i = 1; i < grades.length; i++)
        {
            if (grades[i] != -1)
            {
                total += grades[i];
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
            if (grades[i] != -1)
            {
                info += "The " + (i+1) + " number = " + grades[i];
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
