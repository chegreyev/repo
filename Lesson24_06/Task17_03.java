package Lesson24_06;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Task17_03 {
    public static void main(String[] args) throws IOException {
        int sum = 0; // Sum of the integers

        try ( // Create an data input stream for file Exercise17_03.dat
              DataInputStream input =
                      new DataInputStream(new FileInputStream("Exercise17_02.dat"));
        ) {
            // Read and sum the integers from the file
            while (true)
                sum += input.readInt();
        }
        catch (Exception ex) { // Detect end of file
            System.out.println("Sum of the integers is: " + sum);
        }
    }
}
