package Lesson25_06;

public class task19_1 {
    public static void main(String[] args) {
        // Create a stack to hold strings
        // and add three strings to the stack
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("London");
        stack1.push("Paris");
        stack1.push("Berlin");

        // Display the elements in stack 1
        System.out.print("Stack 1: ");
        while (!stack1.isEmpty())
            System.out.print(stack1.pop() + " ");

        System.out.println("\n");


    }
}
