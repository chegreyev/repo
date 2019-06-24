package Lesson04_06;

public class task62 {
    public static void main(String[] args) {
        System.out.println(sumDigits(123));
    }

    public static int sumDigits(int num){
        int first = (int)num / 100;
        int reminder = (int) (num%100);
        int second = reminder / 10;
        int third  = reminder % 10;

        return first + second + third;

    }
}
