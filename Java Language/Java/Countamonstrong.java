
package javacode1.countamonstrong;
import java.util.Scanner;

public class Countamonstrong {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int m,n,i,t,rev=0,count=0;
        System.out.print("Enter initial number:");
        m=input.nextInt();
        
        System.out.print("Enter last number: ");
        n=input.nextInt();
        
        System.out.print("Amonstrong number from "+m+" to "+n+" are: ");
        
        for(i=m;i<n;i++)
        {
        t=i;
        while(t!=0)
        {
        int r;
        r=t%10;
        rev=rev+r*r*r;
        t=t/10;
        
        }
        
        if(rev==i)
        {
        System.out.print(rev+" ");
        count++;
        }
        rev=0;
        }
        System.out.println();
        System.out.println("Total amonstrong number is: "+count+" ");
        
    }
}

