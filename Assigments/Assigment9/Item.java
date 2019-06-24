package Assigments.Assigment9;

public class Item {
    String name ;
    int price;

    public Item(String name , int price){
        this.name = name;
        this.price = price;
    }


    public String toString(){
        return name + " price $ " + price;
    }
}
