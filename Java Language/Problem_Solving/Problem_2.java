/* Write a Java program that reads a number in inches and converts it to meters */
package problem_solving;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner db1=new Scanner(System.in);
        System.out.print("Enter a inches number: ");
        double num=db1.nextDouble();
        double result=num*0.0254;
        System.out.println("Meter number is: "+result);
    }  
}