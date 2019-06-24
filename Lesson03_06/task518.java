package Lesson03_06;

public class task518 {
    public static void main(String[] args) {
        A();
        System.out.println();
        B();
        System.out.println();
        C();
        System.out.println();
        D();
    }

    public static void A(){
        System.out.println("Pattern A\n");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void B(){
        System.out.println("Pattern B\n");
        for(int i = 6; i >=1 ; i--){
            for(int j = 1 ; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void C(){
        System.out.println("Pattern C\n");
        int rows = 6;
        for(int i = 1 ; i <= 6 ; i++){
            for(int j = 6 - i; j>= 1 ; j--)
                System.out.print("  ");

            for(int a = i ; a>=1 ; a--)
                System.out.print(a + " ");
            System.out.println();
        }
    }

    public static void D(){
        System.out.println("Pattern D\n");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("  ");

            for (int a = 0; a < 6 - i; a++)
                System.out.print(a + 1 + " ");

            System.out.println();
        }
    }
}
