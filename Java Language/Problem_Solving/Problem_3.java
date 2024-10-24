/*
 Write a Java program to create a class called "Cat" with instance variables name and age.
Implement a default constructor that initializes the name to "Unknown" and the age to 0.
Print the values of the variables.
 */
package problem_solving;

class Cat{
    String name;
    int age;
    Cat(){
        this.name="Shoaib";
        this.age=0;
    }
    public void display (){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class Problem_3 {
    public static void main(String[] args) {
        Cat db1=new Cat();
        db1.display();
    }
}
