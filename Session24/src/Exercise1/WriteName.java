package Exercise1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteName {
    public static void main(String[] args) {
        PrintWriter write = null;
        Scanner scanner = new Scanner(System.in);
        try
        {
            System.out.print("Enter file name without file type: ");
            String fileName = scanner.nextLine();
            FileOutputStream fileOut = new FileOutputStream("Session24/src/Exercise1/" + fileName + ".txt");
            write = new PrintWriter(fileOut);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found, or could not be opened");
            System.exit(1);
        }
        System.out.print("How many names you want to input?: ");
        int howMany = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < howMany; i++)
        {
            System.out.println("Enter a name: ");
            write.println(scanner.nextLine());
        }
        write.close();

        System.out.println("Done writing.");
    }
}
