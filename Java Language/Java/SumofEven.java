
package javacode1.sumofeven;
import java.util.Scanner;
public class SumofEven {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sum=0;
        int m;
        System.out.print("Enter a initial number:");
        m=input.nextInt();
        
        int n;
        System.out.print("Enter a last number:");
        n=input.nextInt();
        
        for(int i=m;i<=n;i++)
        {
            if (i%2!=0)
            {
        sum=sum+i;
        System.out.print(" "+i);
            }
        }
        System.out.println("  Sum of even number:"+sum);
    }
}
