package Exercise4;

import java.io.*;

public class StudentRead {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("Session24/src/Exercise4/students.txt");
            ObjectInputStream read = new ObjectInputStream(fileIn);
            while (true)
            {
                try
                {
                    Student student = (Student)read.readObject();
                    System.out.println(student);
                }
                catch (EOFException eof)
                {
                    System.out.println("End of file");
                    break;
                }
            }
            read.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found, or could not be opened");
            System.exit(1);
        }
        catch (IOException e)
        {
            System.out.println("IO Error reading file");
            System.exit(1);
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Class not found");
            System.exit(1);
        }
    }
}
