package Lesson18_06;

import java.util.Scanner;

public class task9_12 {

    public static void main(String[] args) {
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");

        double[] arguments = getArguments(getMatrix());

        LinearEquation intersectingPoint = new LinearEquation(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5]);

        if (intersectingPoint.isSolvable())
            System.out.println("Point : (" + intersectingPoint.getX() + ", " + intersectingPoint.getY() + ") is intersedcting.") ;

        else
            System.out.println("There are two lines parelell . ");
    }

    public static double[][] getMatrix() {
        Scanner sc = new Scanner(System.in);

        double[][] matrix = new double[4][2];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = sc.nextDouble();

        return matrix;
    }

    public static double[] getArguments(double[][] matrix) {
        double[] p = new double[6];
        p[0] = matrix[0][1] - matrix[1][1];
        p[1] = -1 * (matrix[0][0] - matrix[1][0]);
        p[2] = matrix[2][1] - matrix[3][1];
        p[3] = -1 * (matrix[2][0] - matrix[3][0]);
        p[4] = (matrix[0][1] - matrix[1][1]) * matrix[0][0] - (matrix[0][0] - matrix[1][0]) * matrix[0][1];
        p[5] = (matrix[2][1] - matrix[3][1]) * matrix[2][0] - (matrix[2][0] - matrix[3][0]) * matrix[2][1];
        return p;
    }

}

class LinearEquation {

    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Getters / Setters
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getf() {
        return f;
    }

    public boolean isSolvable() {
        return a * d - b * c != 0;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}