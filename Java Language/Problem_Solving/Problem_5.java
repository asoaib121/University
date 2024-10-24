/*
Overloading Constructors with Different Data Types
Write a Java program to create a class called Point with instance variables x and y. Implement overloaded constructors:

One constructor takes int parameters.
Another constructor takes double parameters.
Print the values of the variables for each constructor.
 */
package problem_solving;

class Constructor {
int x;
int y;
Constructor(int x,int y){
    this.x=x;
    this.y=y;
}
Constructor(double x,double y){
    this.x=(int)x;
    this.y=(int)y;
}
public void display(){
    System.out.println("1st value: "+x);
    System.out.println("2nd value: "+y);
}
}
public class Problem_5 {
    public static void main(String[] args) {
        Constructor db1=new Constructor(7,8);
        db1.display();
        System.out.println();
        
        Constructor db2=new Constructor(12.4,23.8);
        db2.display();
    }
    
}
