package Exercise5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import Exercise4.Student;

public class XML{
    public static void main(String[] args) {


        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("Bob", "Bobson", "Denmark"));
        list.add(new Student("Jane", "Doe", "England"));
        list.add(new Student("John", "Doe", "USA"));

        try {
            FileOutputStream fileOut = new FileOutputStream("Session24/src/Exercise5/xml.txt");
            PrintWriter writer = new PrintWriter(fileOut);

            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            writer.write("<students>");

            for (int i = 0; i < 3; i++) {
                writer.write("  <student>\n");
                writer.write("      <firstname> " + list.get(i).getFirstName() + " </firstname>\n");
                writer.write("      <lastname> " + list.get(i).getLastName() + " </lastname>\n");
                writer.write("      <country> " + list.get(i).getCountry() + " </country>\n");
                writer.write("  </student>\n");
            }
            writer.write("</students");
            writer.close();
        }

        catch (FileNotFoundException e)
        {
            System.out.println("File not found, or could not be opened");
            System.exit(1);
        }
        System.out.println("Done writing.");

    }
}
