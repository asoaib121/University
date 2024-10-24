/*
Constructor with Array Initialization
Write a Java program to create a class called Classroom with instance variables className and students (an array of strings). 
Implement a parameterized constructor that initializes these variables. Print the values of the variables.
*/
package problem_solving;

import java.util.Arrays;

class Classroom {
    String className;
    String[] student;
    Classroom(String className,String[] student){
        this.className=className;
        this.student=student;
    }
    public void display(){
        System.out.println("Class Name: "+className);
        System.out.println("Student: "+Arrays.toString(student));
    }
}

public class Problem_6 {
    public static void main(String[] args) {
        String[] studentArray = {"Andrine", "Ruslan", "Martin"};
        
        Classroom db1 = new Classroom("Science 101", studentArray); 
        db1.display();
    }
    
}
