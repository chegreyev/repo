package ID170107001;

public class Task5 {
    public static void main(String[] args) {
        double[] array = { 1 , 2 , 4, -1 , -10 , 3 , -1 , -1000};
        System.out.println(indexOfSmallestElement(array));
    }

    public static int indexOfSmallestElement(double[] array){
     double minimum = array[0];

     for (double obj : array){
         if(minimum > obj){
             minimum = obj;
         }
     }
        return findIndex(array , minimum);
    }

    public static int findIndex(double arr[], double number) {
        int length = arr.length;
        int i = 0;

        while (i < length) {
            if (arr[i] == number) {
                return i;
            }
            else {
                i += 1;
            }
        }
        return -1;
    }

}
