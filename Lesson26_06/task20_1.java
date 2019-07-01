package Lesson26_06;

import java.io.File;
import java.util.*;

public class task20_1 {
    public static void main(String[] args) throws Exception {


        File textFile = new File("/Users/ChD/IdeaProjects/Practise/src/Lesson26_06/text.txt");
        if (!textFile.exists()) {
            System.out.println("The file " + "text.txt" + " does not exist.");
        }

        try (Scanner input = new Scanner(textFile)) {
            PriorityQueue<String> queue = new PriorityQueue<>();
            while (input.hasNext()) {
                queue.offer(input.next());
            }

            while (queue.size() > 0) {
                System.out.println(queue.poll());
            }


        }
    }
}
