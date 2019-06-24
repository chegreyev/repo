package Lesson04_06;

import java.util.Scanner;


public class task71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStrudents = sc.nextInt();

        int[] scores = new int[numStrudents];
        char[] grades = new char[scores.length];

        System.out.println("Enter " + numStrudents + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }

        getGrades(scores , grades);

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + " score is " +
                    scores[i] + " and grade is " + grades[i]);
        }

    }

    public static int bestScore(int[] scores){
        int best = 0;
        for(int i : scores){
            if (i > best)
                best = i;
        }
        return best;
    }

    public static void getGrades(int[] scores, char[] grades){
        int best = bestScore(scores);

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= best - 10)
                grades[i] = 'A';

            else if (scores[i] >= best - 20)
                grades[i] = 'B';

            else if (scores[i] >= best - 30)
                grades[i] = 'C';

            else if (scores[i] >= best - 40)
                grades[i] = 'D';

            else
                grades[i] = 'F';
        }

    }

}
