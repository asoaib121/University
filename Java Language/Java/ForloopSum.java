
package javacode1.forloopsum;

import java.util.Scanner;


public class ForloopSum {

    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
     int a;
     int sum;
     sum=0;
     System.out.println("Enter any Number:");
     a=input.nextInt();
     for(int i=0;i<=a;i++)
     {
     sum=a+sum;
     System.out.println("sum="+sum);
     }
    }
}
