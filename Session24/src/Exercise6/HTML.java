package Exercise6;

import Exercise4.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class HTML {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("Bob", "Bobson", "Denmark"));
        list.add(new Student("Jane", "Doe", "England"));
        list.add(new Student("John", "Doe", "USA"));

        
    }
}
