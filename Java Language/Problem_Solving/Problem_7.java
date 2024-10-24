/*
*Static Methods:
Write a Java program to create a class called "MathUtility" with a static method add that takes two integers and returns their sum. 
Demonstrate the usage of this static method in the main method without creating an instance of "MathUtility".
*/
package problem_solving;

class MathUtility {
static int add(int x,int y){
    return x+y;
}

}
public class Problem_7 {
    public static void main(String[] args) {
        int num1;
        int num;
        int sum=MathUtility.add(12,13);
        System.out.println("Summition is: "+sum);
    }
    
}
