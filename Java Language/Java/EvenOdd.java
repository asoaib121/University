

package javacode1.evenodd;
import java.util.Scanner;

public class EvenOdd {

    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a;
        System.out.print("Enter a number:");
        a=input.nextInt();
        
        if(a%2==0)
        {
        System.out.println("Even");
        }
        else
        {
        System.out.println("Odd");
        }
    }
}
