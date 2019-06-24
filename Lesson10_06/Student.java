package Lesson10_06;

public class Student extends Person{
    private String classStatus;

    public Student(String name , String address , String phoneNumber , String email , String classStatus){
        super(name, address, phoneNumber, email);
        this.classStatus = classStatus;
    }

    public String getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }

    @Override
    public String toString(){
        return super.toString() + "\nStatus: " + getClassStatus();
    }
}
