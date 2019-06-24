package Lesson04_06;

import java.util.Scanner;

public class task618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String pass = sc.next();

        System.out.println( (goodPassword(pass) ? "Valid" : "Not valid") + " password." );
    }

    public static boolean goodPassword(String pass){
        final int numOfDigits = 2;
        final int validLenght = 8;

        //Checker 1
        boolean check1 = pass.length() >= validLenght;

        //Checker 2
        boolean check2 = checker2(pass);

        //Checker 3
        boolean check3 = checker3(pass , numOfDigits);

        return check1 && check2 && check3;

    }

    public static boolean checker2(String pass){
        for (int i = 0; i < pass.length(); i++) {
            if (!Character.isLetterOrDigit(pass.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean checker3(String pass , int numOfDigits){
        int counterDigits = 0;

        for(int i = 0 ; i < pass.length() ; i++){
            if(Character.isDigit(pass.charAt(i)))
                counterDigits++;

            if(counterDigits >= numOfDigits)
                return true;
        }

        return false;
    }
}
