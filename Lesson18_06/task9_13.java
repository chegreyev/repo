package Lesson18_06;

import java.util.Scanner;

public class task9_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int column = sc.nextInt();

        double[][] array = new double[rows][column];

        // Filling the array
        System.out.println("Enter the array: ");
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = sc.nextDouble();
        // End of filling the array

        Location max = locateLargest(array);

        System.out.println("The location of the largest element is " +
                max.maxValue + " at (" + max.row + ", " + max.column + ")");

    }

    public static Location locateLargest(double[][] a) {
        return new Location(a);
    }

}

class Location{
    int row , column ;
    double maxValue;


    Location(double[][] a) {
        maxValue = a[0][0];
        row = 0;
        column = 0;
        getMaxValue(a);
    }

    public void getMaxValue(double[][] a){
        for (int i = 0 ; i < a.length ; i++)
            for(int j = 0 ; j < a[i].length ; j++ )
                if (a[i][j] > maxValue){
                    maxValue = a[i][j];
                    row = i; column = j;
                }
    }

}