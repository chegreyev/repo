package Lesson04_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ten numbers : ");
        int[] numbers = new int[10];
        for(int i = 0 ; i < 10 ; i++){
            numbers[i] = sc.nextInt();
        }

        eliminateDuplicates(numbers);

    }

    public static void eliminateDuplicates(int[] list){
        Arrays.sort(list);
        int number = list[0];
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 1; i < list.length; ++i) {
            if (list[i] != number) {
                number = list[i];
                result.add(list[i]);
            }
        }

        result.toArray();
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");

        }
    }



}
