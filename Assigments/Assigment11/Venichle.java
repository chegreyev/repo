package Assigments.Assigment11;

public class Venichle {
    String brand;
    String color;
    int maximum_passanger;
    int manufacture_year;
    int maximum;

    // Truck
    Venichle(String brand , int manufacture_year , String color , int maximum){
        this.brand = brand ;
        this.manufacture_year = manufacture_year;
        this.color = color;
        this.maximum = maximum;
    }

    public void show(){
        System.out.println("----Truck----");
        System.out.println("Brand: " + brand);
        System.out.println("Manufacture year: " + manufacture_year);
        System.out.println("Color: " + color);
        System.out.println("Maximum load: " + maximum);
    }



}
