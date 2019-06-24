package Lesson11_06;

public class task12_01 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Enter the equation");
            System.exit(1);
        }

        try {
            Integer.parseInt(args[0]);
        } catch (Exception e) {
            displayInputError(args[0]);
            System.exit(2);
        }

        try {
            Integer.parseInt(args[2]);
        } catch (Exception e) {
            displayInputError(args[2]);
            System.exit(3);
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);

        int result = 0;

        switch (args[1].charAt(0)) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '.': result = a * b; break;
            case '/': result = a / b;
        }

        System.out.println(a + " " + args[1] + " " + b +
                " = " + result);
    }

    public static void displayInputError(String arg) {
        System.out.println("Wrong input: " + arg);
    }
}