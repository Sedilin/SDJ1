import java.util.Scanner;

public class LotteryTest {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        Scanner scanner = new Scanner(System.in);
        int[] yourNumbers = new int[5];
        for (int i = 0; i < yourNumbers.length; i++)
        {
            System.out.print("Enter " + (i+1) + " number for array: ");
            yourNumbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < yourNumbers.length; i++)
        {
            System.out.print(lottery.compareLottery(yourNumbers)[i] + " ");
        }
        

        System.out.println();
        System.out.println("The numbers of lottery: ");

        int[] temp = new int[5];
        temp = lottery.copyOfLottery();
        for (int i = 0; i < yourNumbers.length; i++)
        {
            System.out.print(temp[i] + " ");
        }
    }
}
