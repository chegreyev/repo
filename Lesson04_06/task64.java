package Lesson04_06;

import java.util.Scanner;

public class task64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        reverse(num);
    }

    public static void reverse(int number){
        while (number > 0) {
            System.out.print((number % 10));
            number /= 10;
        }
        System.out.println();
    }
}
