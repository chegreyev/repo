package Lesson10_06;

public class Employee extends Person {
    private int office ;
    private double salary;
    private MyDate dateHired;

    public Employee(String name , String address , String phoneNumber ,
                    String email , int office, double salary){

        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate();
    }

    private int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    private double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString(){
        return super.toString() + "\nOffice: " + getOffice()
                + "\nSalary: " + getSalary()
                + "\nDateHired: " + getDateHired();
    }
}
