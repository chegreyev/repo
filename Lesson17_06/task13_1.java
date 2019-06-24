package Lesson17_06;

import java.util.Scanner;

public class task13_1  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Side1 : ");
        double side1 = sc.nextDouble();

        System.out.print("Side2 : ");
        double side2 = sc.nextDouble();

        System.out.print("Side3 : ");
        double side3 = sc.nextDouble();

        System.out.print("Color : ");
        String color = sc.next();

        System.out.print("Filled ? ");
        boolean filled = sc.nextBoolean();

        System.out.println("---------------");

        Triangle t = new Triangle(side1 , side2 , side3 , color , filled);
        System.out.println("Area of the triangle : " + t.getArea());
        System.out.println("Perimeter of the triangle : " + t.getPerimeter());
        System.out.println("Color of the triangle : " + t.getColor());
        System.out.println("Filled ? " + t.isFilled());
    }
}
