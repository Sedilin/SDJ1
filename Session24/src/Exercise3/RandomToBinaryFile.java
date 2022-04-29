package Exercise3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;

public class RandomToBinaryFile {
    public static void main(String[] args) {
        Random random = new Random();

        try {
            FileOutputStream fileOut = new FileOutputStream("Session24/src/Exercise3/" + "numbers.txt");
            ObjectOutputStream write = new ObjectOutputStream(fileOut);

            for (int i = 0; i < 20; i++){
                write.writeInt(random.nextInt(10));
            }
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
