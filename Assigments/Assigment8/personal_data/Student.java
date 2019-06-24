package Assigments.Assigment8.personal_data;

import Assigments.Assigment8.calendar.DateInfo;

public class Student {
    String name;
    DateInfo birthDate;

    public Student(String name, DateInfo birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public void show(){
        System.out.println("Name: " + name + "\nBirth date: " + birthDate.getDateFormat());
    }
}
