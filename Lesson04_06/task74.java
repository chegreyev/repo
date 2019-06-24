package Lesson04_06;

import java.util.Scanner;

public class task74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number (max is 100) , negative number is end of input : ");

        int[] numbers = new int[100];
        int avg = 0, counterNumbers = 0;
        int num ;

        for (int i = 0; i < 100; i++) {
            num = sc.nextInt();
            if (num < 0)
                break;

            numbers[i] = num;
            avg += num;
            counterNumbers++;
        }

        avg = avg / counterNumbers;

        task(numbers , avg , counterNumbers);

    }

    public static void task(int[] numbers , int avg , int counterNumbers){

        int aboveAVG = 0 , belowAVG = 0;

        for(int i = 0 ; i < counterNumbers ; i++){
            if(numbers[i] >= avg)
                aboveAVG++;
            else
                belowAVG++;
        }

        System.out.println("\nNumbers count is : " + counterNumbers);
        System.out.println("Avarage number is : " + avg);
        System.out.println("Numbers above or equal avarage : " + aboveAVG);
        System.out.println("Numbers below avarage : " + belowAVG);

    }


}
