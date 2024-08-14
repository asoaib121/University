
package javacode1.fibonacci2;
import java.util.Scanner;
public class Fibonacci2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        
        System.out.print("How many number:");
        n=input.nextInt();
        
        int first=0;
        int second=1;
        int fibo=0;
        for(int i=3;i<=n;i++)
        {
        fibo=first+second;
        first=second;
        second=fibo;
        }
      System.out.println("Your "+n+"th fibonacci number is "+fibo);
        
    }
}
