package Assigments.Assigment8.calendar;

public class DateInfo {
    protected int day , month , year;

    public DateInfo(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDateFormat(){
        return ""+day+"/"+month+"/"+year;
    }


}
