/*
*Static Final Variables
Write a Java program to create a class called Constants with a static final variable 'PI' initialized to 3.14159. 
Create a method to calculate the area of a circle given its radius, using the 'PI' constant. Demonstrate the method in the main method.
*/
package problem_solving;
class Constants {
    public static final double PI=3.14159;
    public static double CalculateArea(double radius) {
        return PI*radius*radius;
    }
}
public class Problem_8 {
    public static void main(String[] args) {
      
        double radius=5.0;
    double area= Constants.CalculateArea(radius);
        System.out.println("The area of circle is: "+area);
    }
  
}
