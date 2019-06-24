package Lesson03_06;

public class task55 {
    public static void main(String[] args) {
        double pound_kg = 2.2;
        int pound_start = 20;

        System.out.println("Kilograms    Pounds     |     Pounds      Kilograms");

        for(int i = 0 ; i < 200 ; i++){
            System.out.printf("%-12d%7.1f", i, (i * pound_kg));
            System.out.print("     |     ");
            System.out.printf("%-9d%12.2f\n", pound_start, (pound_start / pound_kg));
            pound_start+=5;
        }
    }
}
