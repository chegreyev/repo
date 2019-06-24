package Assigments.Assigment11;

public class Truck extends Venichle{


    Truck(String brand , int manufacture_year , String color , int maximum_load){
       super(brand , manufacture_year , color , maximum_load);
    }

    @Override
    public void show(){
        System.out.println("----Truck----");
        System.out.println("Brand: " + brand);
        System.out.println("Manufacture year: " + manufacture_year);
        System.out.println("Color: " + color);
        System.out.println("Maximum load: " + maximum);
    }

}
