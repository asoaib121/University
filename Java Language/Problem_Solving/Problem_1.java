/* Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
Test Data */

package problem_solving;

import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner db1=new Scanner(System.in);
        System.out.print("Enter a Fahrenheit number: ");
       double num= db1.nextDouble();
       
       double result=((5*num)-160)/9;
        System.out.println("Celcious number is: "+result);
       
        
    }
    
}
