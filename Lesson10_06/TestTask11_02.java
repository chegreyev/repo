package Lesson10_06;

public class TestTask11_02 {
    public static void main(String[] args) {
        Person person = new Person("Daniyar", "Kaskelen , Altyn Aul",
                "87022465104", "chegreyev@gmail.com");

        Student student = new Student("Studentka", "SDU", "87075364817",
                "studentka@gmail.com", "Freshman");

        Employee employee = new Employee("Rabotnik", "Kasklen , Kaspi.kz", "87077074554",
                "rabotnik@gmail.com", 910, 60000);

        Faculty faculty = new Faculty("Работник факультета", "SDU street", "8707212412",
                "faculty@gmail.com", 101, 50000, "4pm to 6pm", "Professor");

        Staff staff = new Staff("Tom", "Engeneering faculty", "87029998812",
                "tom@gmail.com", 12, 65000, "Executive Assistant");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
