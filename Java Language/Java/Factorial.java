
package javacode1.factorial;

import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        System.out.print("Enter a number:");
        a=input.nextInt();
        int n=1;
        
        for(int i=1;i<=a;i++)
        {
        n=n*i;
        }
        System.out.println("Factorial: "+n);
    }
}
