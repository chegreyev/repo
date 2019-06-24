package Assigments.Assigment11;

public class Car extends Venichle{
    Car(String brand , int manufacture_year , String color , int maximum_passanger){
        super(brand , manufacture_year , color , maximum_passanger);
    }
    @Override
    public void show(){
        System.out.println("----CAR----");
        System.out.println("Brand: " + brand);
        System.out.println("Manufacture year: " + manufacture_year);
        System.out.println("Color: " + color);
        System.out.println("Max passanger: " + maximum);
    }

}
