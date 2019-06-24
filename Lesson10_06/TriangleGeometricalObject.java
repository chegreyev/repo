package Lesson10_06;

import java.util.Scanner;

public class TriangleGeometricalObject extends SimpleGeometricalObject {
    // base is side1
    // height is side2

    private double side1  = 1.0, side2 = 1.0, side3 = 1.0;

    public TriangleGeometricalObject(){

    }

    public TriangleGeometricalObject(double side1 , double side2 , double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public TriangleGeometricalObject(double side1 , double side2 , double side3, String color , boolean filled){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(filled);
    }

    public double getArea(){
        return (1/2) * side1 * side2;
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 + "\nThe color is : "
                + getColor() + " and is filled : " + isFilled();
    }
}

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side1: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the side2: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the side3: ");
        double side3 = sc.nextDouble();
        System.out.print("Enter the color: ");
        String color = sc.next();
        System.out.print("Enter filled is or not: ");
        boolean filled = sc.nextBoolean();
        System.out.println();

        TriangleGeometricalObject triangle = new TriangleGeometricalObject(side1, side2, side3, color , filled);
        System.out.println(triangle.toString());
    }
}