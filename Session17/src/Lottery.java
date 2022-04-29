import java.util.Random;
public class Lottery {

    private int[] lotteryNumbers = new int[5];

    Random random = new Random();
    public Lottery()
    {
        for (int i = 0; i < lotteryNumbers.length; i++)
        {
            lotteryNumbers[i] = random.nextInt(9);
        }
    }

    public int[] compareLottery(int[] yourNumbers)
    {
        int[] howMany = new int[lotteryNumbers.length];
        for (int i = 0; i < lotteryNumbers.length; i++)
        {
            if (lotteryNumbers[i] == yourNumbers[i])
            {
                howMany[i] = lotteryNumbers[i];

            }
        }
        return howMany;
    }

    public int[] copyOfLottery()
    {
        int[] copyArray = new int[lotteryNumbers.length];
        for (int i = 0; i < lotteryNumbers.length; i++)
        {
            copyArray[i] = lotteryNumbers[i];
        }
        return copyArray;
    }

    public int[] getAllNumbers()
    {
        return lotteryNumbers;
    }

}
