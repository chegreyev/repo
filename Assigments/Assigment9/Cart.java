package Assigments.Assigment9;

import java.util.ArrayList;

public class Cart {


    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        Item it1 = new Item("Shirt" , 20);
        Item it2 = new Item("Pants" , 32);

        items.add(it1);
        items.add(it2);

        for(Item it : items){
            System.out.println(it.toString());
        }
    }

}
