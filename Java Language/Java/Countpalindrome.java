
package javacode1.countpalindrome;
import java.util.Scanner;
public class Countpalindrome {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m,n,r,i;
        int a,rev=0,count=0;
        
        
        System.out.print("Enter a 1st number:");
        m= input.nextInt();
        
       System.out.print("Enter a 2nd number:");
       n= input.nextInt();
        System.out.print("Pallindrome numbers from "+m+" to "+n+" are:");
       
       
       for( i=m;i<=n;i++)
       {
           a=i;
       while(a!=0)
       {
       
       r=a%10;
       rev=rev*10+r;
       a=a/10;
       }
       
      if(rev==i)
      {
      System.out.print(rev+"  ");
      count++;
      }
      rev=0;
    }
      System.out.println();
      System.out.println("Total Palindrom Number "+count+" ");
    }
    
}