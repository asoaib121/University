

package javacode1.amonstrong;

import java.util.Scanner;


public class Armstrong {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a,temp,rev=0,r;
        System.out.print("Enter a number: ");
        a=input.nextInt();
        
        temp=a;
        while(temp!=0)
        {
        r=temp%10;
        rev=rev+r*r*r;
        temp=temp/10;
        
        }
        if(rev==a)
            System.out.println("It is amonstrong number ");
        else
            System.out.println("It is not amonstrong number ");
    }
}
