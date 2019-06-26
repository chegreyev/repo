package Lesson25_06;

public class task19_5 {

    public static <E extends Comparable<E> > E max(E[] list) {
        E max = list[0];

        for (int i = 0; i < list.length ; i++) {
            if(list[i].compareTo(max) > 0){
                max = list[i];
            }
        }

        return max;
    }


    public static void main(String[] args) {

        String[] list = {"Daniyar" , "Indira" , "Nursultan"};
        String maxValue = max(list);

        System.out.println(maxValue);
    }
}
