package org.example;

import java.util.Stack;

public class StudentManagement {
    private Stack<Student> students;

    public StudentManagement(){
        this.students = new Stack<>();

    }

    public void addStudent (Student student){
        students.push(student);
    }
    public void updateStudent (int id, String newName, String newContactNumber){
        Stack<Student> tempStack = new Stack<>();
        boolean found = false;
        while (!students.isEmpty()){
            Student student = students.pop();
            if(student.getId()==id){
                tempStack.push(new Student(id, newName,newContactNumber));
                found = true;
            }else {
                tempStack.push(student);
            }
        }
        while (!tempStack.isEmpty()){
            students.push(tempStack.pop());
        }
        if (!found){
            System.out.println("Student with ID" + id + "not found.");

        }

    }
    public void deleteStudent(int id){
        Stack<Student> tempStack = new Stack<>();

        while ((!students.isEmpty())){
            Student student = students.pop();
            if (student.getId()!= id ){
                tempStack.push(student);
            }
        }
        while (!tempStack.isEmpty()) {
            students.push(tempStack.pop());
        }
    }


    // Search for a student by ID
    public Student searchStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null; // Not found
    }
    public void displayStudents() {
        Stack<Student> tempStack = new Stack<>();


        while (!students.isEmpty()) {
            Student student = students.pop();
            System.out.println(student);
            tempStack.push(student);
        }


        // Restore the original stack
        while (!tempStack.isEmpty()) {
            students.push(tempStack.pop());
        }
    }


}



