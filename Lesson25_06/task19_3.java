package Lesson25_06;

import java.util.ArrayList;

public class task19_3<E> {

    public static void main(String[] args) {

        arrList<String> arrList = new arrList<>();

        arrList.addElement("Daniyar");
        arrList.addElement("Daniyar");

        arrList.addElement("Indira");

        arrList.setArrayList(arrList.removeDuplicates(arrList.getArrayList()));
        System.out.println(arrList.toString());


    }

}

class arrList<E>{
    private ArrayList<E> arrayList = new ArrayList<>();


    public void addElement(E element){arrayList.add(element);}

    public ArrayList<E> getArrayList() { return arrayList; }

    public void setArrayList(ArrayList<E> arrayList) {
        this.arrayList = arrayList;
    }

    public void removeElement(E element){arrayList.remove(element);}

    public static <E extends Comparable<E>> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        // Goes from the 1 st element to the element before the last

        for (int i = 0; i < list.size() - 1; i++)

            if(list.get(i).equals(list.get(i+1)))
                list.remove(i);

        return list;
    }

    @Override
    public String toString() {
        return "arrList{" +
                    arrayList +
                '}';
    }
}
