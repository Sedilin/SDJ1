import java.util.Scanner;

public class SumArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //a
        int array1[] = new int[4];
        for (int i = 0; i < array1.length; i++)
        {
            System.out.print("Enter " + (i+1) + " number: ");
            array1[i] = scanner.nextInt();
        }
        //b
        int array2[] = new int[4];
        for (int i = 0; i < array2.length; i++)
        {
            System.out.print("Enter another " + (i+1) + " number: ");
            array2[i] = scanner.nextInt();
        }
        //c
        int sumArray[] = new int[array1.length];
        //d
        for (int i = 0; i < sumArray.length; i++)
        {
            sumArray[i] = array1[i] + array2[i];
        }

        for (int i = 0; i < sumArray.length; i++)
        {
            System.out.println("The " + (i+1) + " sum = " + sumArray[i]);
        }
    }
}
