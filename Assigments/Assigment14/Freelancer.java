package Assigments.Assigment14;

public class Freelancer implements Payable{
    int hours;
    int hourly_rate = 60;

    Freelancer(int hours){
        this.hours = hours;
    }

    @Override
    public int getSalary() {
        return hours * hourly_rate;
    }
}
