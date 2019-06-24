package Lesson24_06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Task17_01 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();


        // Checking if the file exhists
        File file = new File("Exercise17_01.txt");

        if (file.exists()) {
            try (
                    Scanner sc = new Scanner(file);
            ) {
                while (sc.hasNext()) {
                    list.add(sc.nextLine());
                }
            }
        }

        // Adding to the arrayList all the random numbers
        for (int i = 0; i < 100; i++) {
            list.add(((int)(Math.random() * 100)) + " ");
        }

        try (

                PrintWriter output = new PrintWriter(file);
        ) {

            for (String l: list) {
                output.println(l);
            }
        }
    }
}
