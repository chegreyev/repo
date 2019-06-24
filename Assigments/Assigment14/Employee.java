package Assigments.Assigment14;

public class Employee implements Payable {
    int months;
    final int monthly_salary = 3000;

    Employee(int months){
        this.months = months;
    }

    @Override
    public int getSalary() {
        return months * monthly_salary;
    }
}
