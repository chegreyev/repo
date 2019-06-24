package ID170107001;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        String func = sc.next();
        int second = sc.nextInt();

        double result = 0;

        switch (func){
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "/":
                result = first / second;
                break;
            case "*":
                result = first * second;
                break;
        }

        System.out.println((int)result);

    }
}
