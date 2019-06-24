package ID170107001;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(all_even(10));
    }



    public static String all_even(int number){
        if ( number == 0)
            return "";
        else if(number % 2 == 0)
            return number + " " + all_even(number -1 );
        else
            return all_even(number - 1);
    }

}
