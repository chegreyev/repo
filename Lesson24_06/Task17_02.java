package Lesson24_06;

import java.io.FileOutputStream;
import java.io.IOException;

public class Task17_02 {
    public static void main(String[] args) throws IOException {
        try (

                FileOutputStream output =
                        new FileOutputStream("Exercise17_02.dat", true);
        ) {

            for (int i = 0; i < 100; i++)
                output.write((int)(1 + Math.random() * 100));
        }
    }
}
