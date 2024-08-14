
package javacode1.palindrome;
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,temp;
        int rev=0;
        System.out.print("Enter a number: ");
        a=input.nextInt();
        temp=a;
        
        while(temp !=0)
        {
        int r;
        r=temp%10;
        rev=rev*10+r;
        temp=temp/10;
        }
       
        if(rev==a)
            System.out.println("Palindrome");
        else
            System.out.println("it is not palindrome");
            
    }
}
