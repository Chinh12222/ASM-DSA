package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentStack studentStack = new StudentStack();

        // Adding students to the stack
        studentStack.push(new Student(1, "Alice", "123456789"));
        studentStack.push(new Student(2, "Bob", "987654321"));

        // Displaying all students in the stack
        studentStack.displayStudents();

        // Peeking at the top student
        System.out.println("Top student: " + studentStack.peek());

        // Popping a student from the stack
        System.out.println("Popped: " + studentStack.pop());

        // Displaying remaining students after pop
        studentStack.displayStudents();

        // Adding more students to test dynamic resizing
        studentStack.push(new Student(3, "Charlie", "555555555"));
        studentStack.push(new Student(4, "Diana", "444444444"));

        // Displaying all students after adding more
        studentStack.displayStudents();

        // Popping all students to demonstrate underflow condition
        studentStack.pop();
        studentStack.pop();
        studentStack.pop();

        // Attempting to display students after popping all
        studentStack.displayStudents();

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + studentStack.isEmpty());
    }
}