
package javacode1.sumofodd;

import java.util.Scanner;
public class SumofOdd {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        
        System.out.println("Enter a number:");
        a=input.nextInt();
        int n=0;
        for(int i=1;i<=a;i+=2)
        {
        n+=i;
        }
        System.out.println("Sum of Odd number:"+n);
    }
}
