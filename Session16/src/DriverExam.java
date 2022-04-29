public class DriverExam {
    char[] correctAnswers = {'B', 'D', 'A', 'A', 'C',
                            'A', 'B', 'A', 'C', 'D',
                            'B', 'C', 'D', 'A', 'D',
                            'C', 'C', 'B', 'D', 'A'};
    char[] userInput;

    public DriverExam(char[] input)
    {
        userInput = new char[20];
        this.userInput = input;
    }

    public boolean passed()
    {
        if (totalCorrect() >= 15)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int totalCorrect()
    {
        int count = 0;
        if (userInput != null)
        {
            for (int i = 0; i < correctAnswers.length; i++)
            {
                if (userInput[i] == correctAnswers[i])
                {
                    count++;
                }
            }
        }
        return count;
    }

    public int totalIncorrect()
    {
        return 20 - totalCorrect();
    }

    public int[] questionsMissed()
    {
        int[] wrongans = new int[totalIncorrect()];
        int index = 0;

        for (int i = 0; i < correctAnswers.length; i++)
        {
            if (userInput[i] != correctAnswers[i])
            {
                wrongans[index] = i+1;
                index++;
            }
        }
        return wrongans;
    }
}
