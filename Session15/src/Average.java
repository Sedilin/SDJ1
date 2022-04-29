import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[5];
        int total = 0;
        double average;

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Type in " + (i+1) + " number: ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++)
        {
            total += array[i];
        }
        average = (double)total/array.length;
        System.out.println("The average is equal to: " + average);

    }
}
