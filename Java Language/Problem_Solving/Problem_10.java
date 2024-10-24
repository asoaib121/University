/*
*Write a Java program to create a class called Vehicle with a method called drive(). 
Create a subclass called Car that overrides the drive() method to print "Repairing a car"
*/
package problem_solving;

class Vehicle {
   public void drive() {
       System.out.println("The Vehicle 1st time drive");
   }
}
class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");   
    }
}
public class Problem_10 {
    public static void main(String[] args) {
        Car db1=new Car();
        db1.drive();
    }
    
}
