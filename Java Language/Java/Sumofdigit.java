
package javacode1.sumofdigit;

import java.util.Scanner;
public class Sumofdigit {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a,temp;
        int sum=0;
        System.out.print("Enter a number:");
        a=input.nextInt();
        temp=a;
        while(temp!=0)
        {
        int b;
        b=temp%10;
        sum=sum+b ;
        temp=temp/10;  
        }
        System.out.println("Summition of digit: "+sum);
        
    }
}