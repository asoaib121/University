
package javacode1.fibonacci;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,fibo;
        System.out.print("How many number: ");
        a=input.nextInt();
        int first=0;
        int second=1;
        System.out.print(a+"th fibonacci series is: ");
        System.out.print(first+" "+second);
        
        for(int i=3;i<=a;i++)
        {
        fibo=first+second;
        System.out.print(" "+fibo);
        first=second;
        second=fibo;
        }
        
    }
 
}
