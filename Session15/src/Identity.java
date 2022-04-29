import java.util.Scanner;

public class Identity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //a
        int array1[] = new int[4];
        for (int i = 0; i < 4; i++)
        {
            System.out.print("Enter " + (i+1) + " number: ");
            array1[i] = scanner.nextInt();
        }
        //b
        int array2[] = new int[4];
        for (int i = 0; i < 4; i++)
        {
            System.out.print("Enter another " + (i+1) + " number: ");
            array2[i] = scanner.nextInt();
        }
        //c
        boolean arraysEqual = true;

        for (int i = 0; i < array1.length; i++)
        {
            if (array1[i] != array2[i])
            {
                arraysEqual = false;
                break;
            }
        }
        if (arraysEqual)
        {
            System.out.println("The arrays are equal.");
        }
        else
        {
            System.out.println("The arrays are not equal.");
        }

    }
}
