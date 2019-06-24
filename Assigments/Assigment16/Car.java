package Assigments.Assigment16;

public class Car {
    static String brand;
    static String license_plate;
    static int year_manufacture;



    Car(String brand, String license_plate, int year) {
        this.brand = brand;
        this.license_plate = license_plate;
        this.year_manufacture = year;
    }

    static class Information {
        String engine_code;
        String fuel;

        Information( String engine_code , String fuel) {

            this.engine_code = engine_code;
            this.fuel = fuel;
        }

            public void showInfo () {
                System.out.println("Brand: " + brand);
                System.out.println("Year of manufacture: " + year_manufacture);
                System.out.println("License plate: " + license_plate);
                System.out.println("Engine code: " + engine_code);
                System.out.println("Fuel: " + fuel);
            }

    }

    public static void main(String[] args) {
        //.Information("N45BN89" , "Petrol")
        Car inst = new Car("BMW" , "XN-045-489" , 2016);
        new Information("N45BN89" , "Petrol").showInfo();
    }
}
