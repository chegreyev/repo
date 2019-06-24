package ID170107001;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // выходят и приходя

        Scanner sc = new Scanner(System.in);
        int init = sc.nextInt();
        int stations = sc.nextInt();

        for (int i = 0 ; i < stations ; i++){
            int minus = sc.nextInt();
            int plus = sc.nextInt();

            init += plus - minus;
        }

        System.out.println(init);

    }
}
