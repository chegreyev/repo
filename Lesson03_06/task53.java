package Lesson03_06;

public class task53 {
    public static void main(String[] args) {
        System.out.println("Kilograms   Pounds");
        for(int i = 1 ; i < 200 ; i++){
            //Math.round((i*2.2)*10.0) / 10.0
            System.out.printf("%-15d%6.1f\n", i, (i * 2.2));
        }
    }
}
