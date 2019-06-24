package Assigments.Assigment8.personal_data;

import Assigments.Assigment8.calendar.DateInfo;

public class Test {
    public static void main(String[] args) {
        Student Isabella = new Student("Isabella" ,
                new DateInfo(28 , 8 , 1998));

        Student David = new Student("David" ,
                new DateInfo(13 , 9 ,1996));

        Student[] students = {Isabella , David};
        for (Student student : students)
            student.show();
    }
}
