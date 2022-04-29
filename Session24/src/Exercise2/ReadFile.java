package Exercise2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        Scanner read = null;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter file you want to read: ");
            String fileName = scanner.nextLine();
            FileInputStream fileIn = new FileInputStream("Session24/src/Exercise1/" + fileName + ".txt");
            read = new Scanner(fileIn);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found, or could not be opened");
            System.exit(1);
        }

        System.out.println("Text in file: ");

        while (read.hasNext())
        {
            System.out.println(read.nextLine());
        }
        read.close();
    }
}
