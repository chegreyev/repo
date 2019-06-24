package Assigments.Assigment14;

public class Test {
    public static void main(String[] args) {
        Employee em = new Employee(12);
        System.out.println(em.getSalary());

        Freelancer free = new Freelancer(34);
        System.out.println(free.getSalary());
    }
}
