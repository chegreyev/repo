package ID170107001;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];

        for(int j = 0 ; j < length ; j++){
            array[j] = sc.nextInt();
        }
        System.out.println("Reading order : ");
        // Reading order
        for (int object : array){
            System.out.print(object + " ");
        }

        System.out.println("\nReverse order: ");

        // Reverse order
        for(int i = array.length - 1; i >= 0 ; i--){

            System.out.print(array[i] + " ");
        }
    }
}
