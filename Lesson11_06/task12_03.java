package Lesson11_06;

import java.util.Scanner;

public class task12_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array with 100 random numbers

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100) + 1;
        }

        System.out.print("Enter the index of the array: ");
        try {
            System.out.println("Element value is " +
                    array[sc.nextInt()]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }

    }
}
