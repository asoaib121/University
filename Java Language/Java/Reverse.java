
package javacode1.reverse;
import java.util.Scanner;
public class Reverse {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        int temp;
        int reverse=0;
        System.out.println("Enter a number: ");
        a=input.nextInt();
        temp=a;
       
        
        while(temp!=0)
        {
            int b;
        b=temp%10;
        reverse=reverse*10+b;
        temp=temp/10;
        }
        System.out.println("Reverse Number:"+reverse);
        
        
    }
}
