package Exercise4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student("Adam", "Novak", "Slovakia");
        Student student2 = new Student("Christian", "Adams", "UK");
        Student student3 = new Student("Something", "Yes", "Somewhere");


        try{
            FileOutputStream fileOut = new FileOutputStream("Session24/src/Exercise4/students.txt");
            ObjectOutputStream write = new ObjectOutputStream(fileOut);
            write.writeObject(student1);
            write.writeObject(student2);
            write.writeObject(student3);

            write.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found, or could not be opened");
            System.exit(1);
        }
        catch (IOException e)
        {
            System.out.println("IO Error writing to file ");
            System.exit(1);
        }
        System.out.println("Done writing");
    }
}
