import java.util.Scanner;

public class DoubleLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers you want to enter?: ");
        int n = scanner.nextInt();
        int array[] = new int[n];

        for (int i = 0; i<n; i++)
        {
            System.out.println("Enter " + (i+1) + " number: ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++)
        {
            array[i] *= 2;
        }
        for (int i = 0; i < n; i++)
        {
            System.out.println("Double value of " + (i+1) + " number is equal to: " + array[i]);
        }
    }
}
